package com.secret.entity;
/**
 * 角色管理
 * @author 杨永康
 *
 */
public class Purview {
     private int purviewId; 		//角色序号
     private int id;				//权限ID
     private String userRole;		//角色名
     private String userPurview;	//用户权限
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
