package com.secret.entity;
/**
 * ά����Ϣ�ǼǱ�
 * @author лɯ
 *
 */
public class Messageregister {
	private int messageId;			//������ҵid
	private int credentialsId;  	//֤��Id
	private int vindicatorID;		//ά����ԱID
	private int corporationId;		//������ҵID
	private int unitId;				//��λ���
	private String unitName;		//��λ����
	private String companyName;		//��ҵ����
	private String personName;		//ά����Ա����
	private String personSex;		//ά����Ա�Ա�
	private String paperNumber;		//֤�����
	private String validityTime;	//��Ч����
	private String manageStart;		//ά����ʼʱ��
	private String manageEnd;		//ά������ʱ��
	private String manageMessage;	//ά�����
	
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
