package com.secret.entity;
/**
 * 企业撤销备案登记
 * @author 谢莎
 *
 */
public class Cancelrecords {
	private int enterpriseID;		//企业ID
	private int corporationId;      //申请企业ID
	private String enterpriseName;	//企业名称
	private String haveEnterprise;	//备案企业意见
	private String haveunit;		//备案部门意见
	private String cancelHave;		//撤销备案原因
	private String department;		//备案机关
	private String corporationInk;	//法人代表签字
	
	public int getEnterpriseID() {
		return enterpriseID;
	}
	public void setEnterpriseID(int enterpriseID) {
		this.enterpriseID = enterpriseID;
	}
	public int getCorporationId() {
		return corporationId;
	}
	public void setCorporationId(int corporationId) {
		this.corporationId = corporationId;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getHaveEnterprise() {
		return haveEnterprise;
	}
	public void setHaveEnterprise(String haveEnterprise) {
		this.haveEnterprise = haveEnterprise;
	}
	public String getHaveunit() {
		return haveunit;
	}
	public void setHaveunit(String haveunit) {
		this.haveunit = haveunit;
	}
	public String getCancelHave() {
		return cancelHave;
	}
	public void setCancelHave(String cancelHave) {
		this.cancelHave = cancelHave;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCorporationInk() {
		return corporationInk;
	}
	public void setCorporationInk(String corporationInk) {
		this.corporationInk = corporationInk;
	}
	
}
