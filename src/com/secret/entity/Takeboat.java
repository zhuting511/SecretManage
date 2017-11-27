package com.secret.entity;
/**
 * 附件上传
 * @author 杨永康
 *
 */
public class Takeboat {
    private int accessoriesID;  			//文件ID
    private int corporationId; 				//申请企业ID
    private String corporationName;  		//申请企业名称
    private String documentName;  			//文件真实名称
    private String documentContentType; 	//文件的内容类型
    private String documentFileName;  		//上传的文件名称
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
