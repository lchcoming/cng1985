package DataManager;
public class ListItemData {
	
	private String txtTitle;
	private String txtItemCount;
	private String iconURL;
	private boolean customIcon;
	
	public String getTxtTitle() {
		return txtTitle;
	}
	public void setTxtTitle(String txtTitle) {
		this.txtTitle = txtTitle;
	}
	public String getTxtItemCount() {
		return txtItemCount;
	}
	public void setTxtItemCount(String txtItemCount) {
		this.txtItemCount = txtItemCount;
	}
	public String getIconURL() {
		return iconURL;
	}
	public void setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}
	public ListItemData(String txtTitle,String icon,boolean customIcon)
	{
		this.txtTitle = txtTitle;
		this.txtItemCount = "ÔÝÎÞ¼ÇÂ¼";
		this.iconURL = icon;
		this.customIcon = customIcon;
	}
	public boolean isCustomIcon() {
		return customIcon;
	}
	public void setCustomIcon(boolean customIcon) {
		this.customIcon = customIcon;
	}
	
}
