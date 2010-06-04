package DataManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

	private Properties profile;
	private static String configFile = "LoginManager.cfg";
	private static String ExportFile = "AutoExport.txt";
	private boolean isMaxium;
	private boolean isAutoSave;
	private boolean isOpenLastFile;
	private String lastFileName;
	private boolean isAutoExport;
	private int fontSize;
	private String fontName;
	private boolean hidePassword;
	
	public Properties getProfile() {
		return profile;
	}

	public void setProfile(Properties profile) {
		this.profile = profile;
	}

	public static String getConfigFile() {
		return configFile;
	}

	public static void setConfigFile(String configFile) {
		ConfigManager.configFile = configFile;
	}

	public static String getExportFile() {
		return ExportFile;
	}

	public static void setExportFile(String exportFile) {
		ExportFile = exportFile;
	}

	public boolean isMaxium() {
		return isMaxium;
	}

	public void setMaxium(boolean isMaxium) {
		this.isMaxium = isMaxium;
	}

	public boolean isAutoSave() {
		return isAutoSave;
	}

	public void setAutoSave(boolean isAutoSave) {
		this.isAutoSave = isAutoSave;
	}

	public boolean isOpenLastFile() {
		return isOpenLastFile;
	}

	public void setOpenLastFile(boolean isOpenLastFile) {
		this.isOpenLastFile = isOpenLastFile;
	}

	public String getLastFileName() {
		return lastFileName;
	}

	public void setLastFileName(String lastFileName) {
		this.lastFileName = lastFileName;
	}

	public boolean isAutoExport() {
		return isAutoExport;
	}

	public void setAutoExport(boolean isAutoExport) {
		this.isAutoExport = isAutoExport;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public boolean isHidePassword() {
		return hidePassword;
	}

	public void setHidePassword(boolean hidePassword) {
		this.hidePassword = hidePassword;
	}
	
	public ConfigManager()
	{
		profile = new Properties();
		lastFileName="null";
		fontSize = 14;
		fontName = "宋体";
	}
	
	public void save()
	{
		profile.setProperty("启动时窗口最大化", String.valueOf(isMaxium));
		profile.setProperty("是否自动保存", String.valueOf(isAutoSave));
		profile.setProperty("启动时是否载入最后次保存的文件", String.valueOf(isOpenLastFile));
		profile.setProperty("最后次保存的文件", lastFileName.toString());
		profile.setProperty("保存时自动导出", String.valueOf(isAutoExport));
		profile.setProperty("导出文件名", ExportFile);
		profile.setProperty("字体", fontName);
		profile.setProperty("字体大小", String.valueOf(fontSize));
		profile.setProperty("是否隐藏密码", String.valueOf(hidePassword));
		File file = new File(configFile);
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("无法创建配置文件！");
			}
		}
		try {
			profile.store(new FileWriter(file), "LoginManager Setup File");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("配置文件保存时出错！");
			e.printStackTrace();
		}
		
	}
	
	//载入配置文件
	public boolean load()
	{
		File file = new File(configFile);
		if(file.exists())
		{
			try {
				profile.load(new FileReader(file));
				isMaxium = Boolean.parseBoolean(profile.getProperty("启动时窗口最大化"));
				isAutoSave = Boolean.parseBoolean(profile.getProperty("是否自动保存"));
				isOpenLastFile = Boolean.parseBoolean(profile.getProperty("启动时是否载入最后次保存的文件"));
				isAutoExport = Boolean.parseBoolean(profile.getProperty("保存时自动导出"));
				lastFileName = profile.getProperty("最后次保存的文件");
				fontSize = Integer.parseInt(profile.getProperty("字体大小"));
				fontName = profile.getProperty("字体");
				hidePassword = Boolean.parseBoolean(profile.getProperty("是否隐藏密码"));
				return true;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("配置文件未找到");
				e.printStackTrace();
				return false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}
}
