package com.secret.entity;
/**
 * ѧϰ��ѵ����
 * @author ������
 *
 */
public class StudyStory {
    private int studyStoryID; 		//ѧϰ��ѵ����Id
    private int vindicatorID;		//ά����ԱID
    private String startTime;		//��ʼʱ��
    private String endTime;			//����ʱ��
    private String schoolName;		//ѧУ����
    private String cultivateCourse;	//��ѵ�γ�
    private String soSpeciality;	//����רҵ
    private String schoolAge;		//ѧ��
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
