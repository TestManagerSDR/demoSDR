package TalentozPackage;

public class SubSettings {
	 public int subSettingsId;
	    public int groupID;
	    public String SettingDisplayName;
	    public int innerSettingID;
	    public String subSettingCloseId;
	    
	SubSettings(int subSettingsId,int groupID,int innerSettingID, String SettingDisplayName,String subSettingCloseId){
    	this.subSettingsId = subSettingsId;
    	this.groupID = groupID;
    	this.innerSettingID = innerSettingID;
    	this.SettingDisplayName = SettingDisplayName;
    	this.subSettingCloseId = subSettingCloseId;
    }
}
