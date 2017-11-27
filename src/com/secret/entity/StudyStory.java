package com.secret.entity;
/**
 * 学习培训经历
 * @author 杨永康
 *
 */
public class StudyStory {
    private int studyStoryID; 		//学习培训经历Id
    private int vindicatorID;		//维护人员ID
    private String startTime;		//开始时间
    private String endTime;			//结束时间
    private String schoolName;		//学校名称
    private String cultivateCourse;	//培训课程
    private String soSpeciality;	//所修专业
    private String schoolAge;		//学历
	public int getStudyStoryID() {
		return studyStoryID;
	}
	public void setStudyStoryID(int studyStoryID) {
		this.studyStoryID = studyStoryID;
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
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getCultivateCourse() {
		return cultivateCourse;
	}
	public void setCultivateCourse(String cultivateCourse) {
		this.cultivateCourse = cultivateCourse;
	}
	public String getSoSpeciality() {
		return soSpeciality;
	}
	public void setSoSpeciality(String soSpeciality) {
		this.soSpeciality = soSpeciality;
	}
	public String getSchoolAge() {
		return schoolAge;
	}
	public void setSchoolAge(String schoolAge) {
		this.schoolAge = schoolAge;
	}
}
