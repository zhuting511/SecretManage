package com.secret.entity;
/**
 * ��ҵ���������Ǽ�
 * @author лɯ
 *
 */
public class Cancelrecords {
	private int enterpriseID;		//��ҵID
	private int corporationId;      //������ҵID
	private String enterpriseName;	//��ҵ����
	private String haveEnterprise;	//������ҵ���
	private String haveunit;		//�����������
	private String cancelHave;		//��������ԭ��
	private String department;		//��������
	private String corporationInk;	//���˴���ǩ��
	
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
