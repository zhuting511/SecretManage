package com.secret.entity;
/**
 * �����������
 * @author ������
 *
 */
public class StoryCircs {
    private int storyCircsId;		//�����������Id
    private int vindicatorID;		//ά����ԱID
    private String startTime;		//��ʼʱ��
    private String endTime;			//����ʱ��
    private String jobAdress;		//��ְ��ҵ
    private String business;		//ְ��
    private String dimission;		//��ְԭ��
	public int getStoryCircsId() {
		return storyCircsId;
	}
	public void setStoryCircsId(int storyCircsId) {
		this.storyCircsId = storyCircsId;
	}
	public int getVindicatorID() {
		return vindicatorID;
	}
	public void setVindicatorID(int vindicatorID) {
		this.vindicatorID = vindicatorID;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getJobAdress() {
		return jobAdress;
	}
	public void setJobAdress(String jobAdress) {
		this.jobAdress = jobAdress;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getDimission() {
		return dimission;
	}
	public void setDimission(String dimission) {
		this.dimission = dimission;
	}
}
