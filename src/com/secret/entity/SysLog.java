package com.secret.entity;
/**
 * 系统日记
 * @author 杨永康
 *
 */
public class SysLog {
    private int sysLog;					//系统日记序号
    private int purviewId;				//角色序号
    private String applyTime;			//发生时间
    private String operationContent;	//操作内容
    private String operationPerson;		//操作员
	public int getSysLog() {
		return sysLog;
	}
	public void setSysLog(int sysLog) {
		this.sysLog = sysLog;
	}
	public int getPurviewId() {
		return purviewId;
	}
	public void setPurviewId(int purviewId) {
		this.purviewId = purviewId;
	}
	public String getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public String getOperationContent() {
		return operationContent;
	}
	public void setOperationContent(String operationContent) {
		this.operationContent = operationContent;
	}
	public String getOperationPerson() {
		return operationPerson;
	}
	public void setOperationPerson(String operationPerson) {
		this.operationPerson = operationPerson;
	}
}
