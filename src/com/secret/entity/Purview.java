package com.secret.entity;
/**
 * ��ɫ����
 * @author ������
 *
 */
public class Purview {
     private int purviewId; 		//��ɫ���
     private int id;				//Ȩ��ID
     private String userRole;		//��ɫ��
     private String userPurview;	//�û�Ȩ��
	public int getPurviewId() {
		return purviewId;
	}
	public void setPurviewId(int purviewId) {
		this.purviewId = purviewId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserPurview() {
		return userPurview;
	}
	public void setUserPurview(String userPurview) {
		this.userPurview = userPurview;
	}
}
