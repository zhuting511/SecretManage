package com.secret.entity;
/**
 * 权限表
 * @author 谢莎
 *
 */
public class Purviewimpl {
	private int id;			//权限ID
	private String code;	//编号
	private String url;		//URL地址
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
