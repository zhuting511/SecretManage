package com.secret.entity;
/**
 * ϵͳ�ռ�
 * @author ������
 *
 */
public class SysLog {
    private int sysLog;					//ϵͳ�ռ����
    private int purviewId;				//��ɫ���
    private String applyTime;			//����ʱ��
    private String operationContent;	//��������
    private String operationPerson;		//����Ա
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
