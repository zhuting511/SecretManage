package com.secret.entity;
/**
 * �����ϴ�
 * @author ������
 *
 */
public class Takeboat {
    private int accessoriesID;  			//�ļ�ID
    private int corporationId; 				//������ҵID
    private String corporationName;  		//������ҵ����
    private String documentName;  			//�ļ���ʵ����
    private String documentContentType; 	//�ļ�����������
    private String documentFileName;  		//�ϴ����ļ�����
	public int getAccessoriesID() {
		return accessoriesID;
	}
	public void setAccessoriesID(int accessoriesID) {
		this.accessoriesID = accessoriesID;
	}
	public int getCorporationId() {
		return corporationId;
	}
	public void setCorporationId(int corporationId) {
		this.corporationId = corporationId;
	}
	public String getCorporationName() {
		return corporationName;
	}
	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentContentType() {
		return documentContentType;
	}
	public void setDocumentContentType(String documentContentType) {
		this.documentContentType = documentContentType;
	}
	public String getDocumentFileName() {
		return documentFileName;
	}
	public void setDocumentFileName(String documentFileName) {
		this.documentFileName = documentFileName;
	}
}
