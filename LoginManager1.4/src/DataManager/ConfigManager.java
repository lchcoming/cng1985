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
		fontName = "����";
	}
	
	public void save()
	{
		profile.setProperty("����ʱ�������", String.valueOf(isMaxium));
		profile.setProperty("�Ƿ��Զ�����", String.valueOf(isAutoSave));
		profile.setProperty("����ʱ�Ƿ��������α�����ļ�", String.valueOf(isOpenLastFile));
		profile.setProperty("���α�����ļ�", lastFileName.toString());
		profile.setProperty("����ʱ�Զ�����", String.valueOf(isAutoExport));
		profile.setProperty("�����ļ���", ExportFile);
		profile.setProperty("����", fontName);
		profile.setProperty("�����С", String.valueOf(fontSize));
		profile.setProperty("�Ƿ���������", String.valueOf(hidePassword));
		File file = new File(configFile);
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�޷����������ļ���");
			}
		}
		try {
			profile.store(new FileWriter(file), "LoginManager Setup File");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�����ļ�����ʱ����");
			e.printStackTrace();
		}
		
	}
	
	//���������ļ�
	public boolean load()
	{
		File file = new File(configFile);
		if(file.exists())
		{
			try {
				profile.load(new FileReader(file));
				isMaxium = Boolean.parseBoolean(profile.getProperty("����ʱ�������"));
				isAutoSave = Boolean.parseBoolean(profile.getProperty("�Ƿ��Զ�����"));
				isOpenLastFile = Boolean.parseBoolean(profile.getProperty("����ʱ�Ƿ��������α�����ļ�"));
				isAutoExport = Boolean.parseBoolean(profile.getProperty("����ʱ�Զ�����"));
				lastFileName = profile.getProperty("���α�����ļ�");
				fontSize = Integer.parseInt(profile.getProperty("�����С"));
				fontName = profile.getProperty("����");
				hidePassword = Boolean.parseBoolean(profile.getProperty("�Ƿ���������"));
				return true;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("�����ļ�δ�ҵ�");
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
