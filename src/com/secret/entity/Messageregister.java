package com.secret.entity;
/**
 * 维护信息登记表
 * @author 谢莎
 *
 */
public class Messageregister {
	private int messageId;			//备案企业id
	private int credentialsId;  	//证件Id
	private int vindicatorID;		//维护人员ID
	private int corporationId;		//申请企业ID
	private int unitId;				//单位编号
	private String unitName;		//单位名称
	private String companyName;		//企业名称
	private String personName;		//维护人员名称
	private String personSex;		//维护人员性别
	private String paperNumber;		//证件编号
	private String validityTime;	//有效期至
	private String manageStart;		//维护开始时间
	private String manageEnd;		//维护结束时间
	private String manageMessage;	//维护情况
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getCredentialsId() {
		return credentialsId;
	}
	public void setCredentialsId(int credentialsId) {
		this.credentialsId = credentialsId;
	}
	public int getVindicatorID() {
		return vindicatorID;
	}
	public void setVindicatorID(int vindicatorID) {
		this.vindicatorID = vindicatorID;
	}
	public int getCorporationId() {
		return corporationId;
	}
	public void setCorporationId(int corporationId) {
		this.corporationId = corporationId;
	}
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonSex() {
		return personSex;
	}
	public void setPersonSex(String personSex) {
		this.personSex = personSex;
	}
	public String getPaperNumber() {
		return paperNumber;
	}
	public void setPaperNumber(String paperNumber) {
		this.paperNumber = paperNumber;
	}
	public String getValidityTime() {
		return validityTime;
	}
	public void setValidityTime(String validityTime) {
		this.validityTime = validityTime;
	}
	public String getManageStart() {
		return manageStart;
	}
	public void setManageStart(String manageStart) {
		this.manageStart = manageStart;
	}
	public String getManageEnd() {
		return manageEnd;
	}
	public void setManageEnd(String manageEnd) {
		this.manageEnd = manageEnd;
	}
	public String getManageMessage() {
		return manageMessage;
	}
	public void setManageMessage(String manageMessage) {
		this.manageMessage = manageMessage;
	}
	
}
