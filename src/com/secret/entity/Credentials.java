package com.secret.entity;
/**
 * ֤������
 * @author ������
 *
 */
public class Credentials {
    private int credentialsId;   	 //֤��Id
    private int vindicatorID;     	 //ά����ԱID
    private String untils;       	 //������λ
    private String sex;           	 //�Ա�
    private String cardCode;      	 //֤��
    private String hairCode;      	 //��֤����
    private String availabilityTme;  //��Ч����
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
	public String getUntils() {
		return untils;
	}
	public void setUntils(String untils) {
		this.untils = untils;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public String getHairCode() {
		return hairCode;
	}
	public void setHairCode(String hairCode) {
		this.hairCode = hairCode;
	}
	public String getAvailabilityTme() {
		return availabilityTme;
	}
	public void setAvailabilityTme(String availabilityTme) {
		this.availabilityTme = availabilityTme;
	}
}
