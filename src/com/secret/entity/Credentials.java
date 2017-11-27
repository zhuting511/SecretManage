package com.secret.entity;
/**
 * 证件管理
 * @author 杨永康
 *
 */
public class Credentials {
    private int credentialsId;   	 //证件Id
    private int vindicatorID;     	 //维护人员ID
    private String untils;       	 //工作单位
    private String sex;           	 //性别
    private String cardCode;      	 //证号
    private String hairCode;      	 //发证日期
    private String availabilityTme;  //有效期至
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
