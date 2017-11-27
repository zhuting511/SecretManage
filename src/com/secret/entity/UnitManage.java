package com.secret.entity;
/**
 * 单位管理
 * @author 杨永康
 *
 */
public class UnitManage {
     private int unitId; 			//单位编号
     private String unitName;		//单位名称
     private String unitDirector; 	//单位主管
     private int telephone; 		//联系电话
     private String fax; 			//传真
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
