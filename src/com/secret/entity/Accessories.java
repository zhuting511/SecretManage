package com.secret.entity;
/**
 * 维护人员管理附件上传
 * @author 谢莎
 *
 */
public class Accessories {
	private int protectId;				//维护人员附件上传ID
	private int vindicatorID;           //维护人员ID
	private String untils;				//工作单位
	private String lineFilesName;		//文件真实名称
	private String FilesContentType;	//文件的内容类型
	private String FilesName;			//附件上传的文件名称
	
	public int getProtectId() {
		return protectId;
	}
	public void setProtectId(int protectId) {
		this.protectId = protectId;
	}
	public int getVindicatorID() {
		return vindicatorID;
	}
	public void setVindicatorID(int vindicatorID) {
		this.vindicatorID = vindicatorID;
	}
	public String getUntils() {
		return untils;
	}
	public void setUntils(String untils) {
		this.untils = untils;
	}
	public String getLineFilesName() {
		return lineFilesName;
	}
	public void setLineFilesName(String lineFilesName) {
		this.lineFilesName = lineFilesName;
	}
	public String getFilesContentType() {
		return FilesContentType;
	}
	public void setFilesContentType(String filesContentType) {
		FilesContentType = filesContentType;
	}
	public String getFilesName() {
		return FilesName;
	}
	public void setFilesName(String filesName) {
		FilesName = filesName;
	}
	
}
