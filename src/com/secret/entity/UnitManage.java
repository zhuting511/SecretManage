package com.secret.entity;
/**
 * ��λ����
 * @author ������
 *
 */
public class UnitManage {
     private int unitId; 			//��λ���
     private String unitName;		//��λ����
     private String unitDirector; 	//��λ����
     private int telephone; 		//��ϵ�绰
     private String fax; 			//����
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitDirector() {
		return unitDirector;
	}
	public void setUnitDirector(String unitDirector) {
		this.unitDirector = unitDirector;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
}
