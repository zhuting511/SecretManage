package com.secret.entity;
/**
 * 家庭成员情况
 * @author 杨永康
 *
 */
public class Familycircs {
     private int familycircsId; 		//家庭成员情况Id
     private int vindicatorID;  		//维护人员ID
     private String appellation;		//称谓
     private String names; 				//姓名
     private String jobsUntils; 		//工作单位
     private String business;  			//职务
     private String remark;  			//备注
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
