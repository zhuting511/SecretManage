package com.secret.entity;
/**
 * ��ͥ��Ա���
 * @author ������
 *
 */
public class Familycircs {
     private int familycircsId; 		//��ͥ��Ա���Id
     private int vindicatorID;  		//ά����ԱID
     private String appellation;		//��ν
     private String names; 				//����
     private String jobsUntils; 		//������λ
     private String business;  			//ְ��
     private String remark;  			//��ע
	public int getFamilycircsId() {
		return familycircsId;
	}
	public void setFamilycircsId(int familycircsId) {
		this.familycircsId = familycircsId;
	}
	public int getVindicatorID() {
		return vindicatorID;
	}
	public void setVindicatorID(int vindicatorID) {
		this.vindicatorID = vindicatorID;
	}
	public String getAppellation() {
		return appellation;
	}
	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getJobsUntils() {
		return jobsUntils;
	}
	public void setJobsUntils(String jobsUntils) {
		this.jobsUntils = jobsUntils;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
