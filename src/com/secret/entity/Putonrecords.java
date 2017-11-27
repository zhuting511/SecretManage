package com.secret.entity;
/**
 * 企业备案登记管理表
 * @author 谢莎
 *
 */
public class Putonrecords {
	private int corporationId;			//申请企业ID
	private String corporationName;		//申请企业名称
	private String corporationAdress;	//申请企业地址
	private String legalDelegate;		//法定代表人
	private String corporationFaxes;	//法人传真
	private int principalIdcard;		//负责人身份证号
	private String rollCalLinkman;		//登记备案联系人
	private String letterNumber;		//资质证书编号
	private String timeStart;			//有效期(开始)
	private String timeEnd;				//有效期(结束)
	private String unitsIdea;			//备案部门意见
	private String ifDisobey;			//是否有过违规行为
	private int postalcode;				//邮政编码
	private String corporationTime;		//企业成立时间
	private int artifpersonPhone;		//法人联系电话
	private String residencePrincipal;	//驻湘负责人
	private int principalPhone;			//负责人联系电话
	private int contactPhone;			//联系人电话
	private String recordsmodel;		//企业备案登记状态
	private String enrolDate;			//备案号
	private String bound;				//企业资质等级
	
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
	public String getCorporationAdress() {
		return corporationAdress;
	}
	public void setCorporationAdress(String corporationAdress) {
		this.corporationAdress = corporationAdress;
	}
	public String getLegalDelegate() {
		return legalDelegate;
	}
	public void setLegalDelegate(String legalDelegate) {
		this.legalDelegate = legalDelegate;
	}
	public String getCorporationFaxes() {
		return corporationFaxes;
	}
	public void setCorporationFaxes(String corporationFaxes) {
		this.corporationFaxes = corporationFaxes;
	}
	public int getPrincipalIdcard() {
		return principalIdcard;
	}
	public void setPrincipalIdcard(int principalIdcard) {
		this.principalIdcard = principalIdcard;
	}
	public String getRollCalLinkman() {
		return rollCalLinkman;
	}
	public void setRollCalLinkman(String rollCalLinkman) {
		this.rollCalLinkman = rollCalLinkman;
	}
	public String getLetterNumber() {
		return letterNumber;
	}
	public void setLetterNumber(String letterNumber) {
		this.letterNumber = letterNumber;
	}
	public String getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}
	public String getUnitsIdea() {
		return unitsIdea;
	}
	public void setUnitsIdea(String unitsIdea) {
		this.unitsIdea = unitsIdea;
	}
	public String getIfDisobey() {
		return ifDisobey;
	}
	public void setIfDisobey(String ifDisobey) {
		this.ifDisobey = ifDisobey;
	}
	public int getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}
	public String getCorporationTime() {
		return corporationTime;
	}
	public void setCorporationTime(String corporationTime) {
		this.corporationTime = corporationTime;
	}
	public int getArtifpersonPhone() {
		return artifpersonPhone;
	}
	public void setArtifpersonPhone(int artifpersonPhone) {
		this.artifpersonPhone = artifpersonPhone;
	}
	public String getResidencePrincipal() {
		return residencePrincipal;
	}
	public void setResidencePrincipal(String residencePrincipal) {
		this.residencePrincipal = residencePrincipal;
	}
	public int getPrincipalPhone() {
		return principalPhone;
	}
	public void setPrincipalPhone(int principalPhone) {
		this.principalPhone = principalPhone;
	}
	public int getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(int contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getRecordsmodel() {
		return recordsmodel;
	}
	public void setRecordsmodel(String recordsmodel) {
		this.recordsmodel = recordsmodel;
	}
	public String getEnrolDate() {
		return enrolDate;
	}
	public void setEnrolDate(String enrolDate) {
		this.enrolDate = enrolDate;
	}
	public String getBound() {
		return bound;
	}
	public void setBound(String bound) {
		this.bound = bound;
	}
	
}
