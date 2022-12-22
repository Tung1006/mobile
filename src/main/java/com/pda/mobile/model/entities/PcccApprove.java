package com.pda.mobile.model.entities;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PCCC_PCCCAPPROVE")
public class PcccApprove {


	@Id
	@GeneratedValue(generator = "PCCCAPPROVE_SEQ")
	@GenericGenerator(name = "PCCCAPPROVE_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Column(name = "PCCCAPPROVEID")
	private Long pcccApproveId;

	@Column(name = "DOCCODE")
	private String docCode;

	@Column(name="ACTIVE_")
	private Boolean active_ = true;

	@Column(name = "DOCNAME")
	private String docName;

	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "CREATEDATE")
	private Date createDate;

	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "MODIFIEDDATE")
	private Date modifiedDate;

	@Column(name ="DOCUMENTCODE")
	private String documentCode;
	
	@Column(name = "DOCUMENTPOSITION")
	private String documentPosition;

	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "Asia/Bangkok")
	@Column(name = "GRANTDATE")
	private Date grantDate;

	@Column(name = "BUILDERID")
	private Long builderId;
	@Column(name = "BUILDERNAME") 
	private String builderName;
	
	@Column(name = "APPROVETYPEID")
	private Long approveTypeId;
	@Column(name ="RESCUEDEPARTMENTID")
	private int rescueDepartmentId;
	@Column(name ="RESCUEDEPARTMENTNAME")
	private String rescueDepartmentName;
	@Column(name="APPROVETYPENAME")
	private String approveTypeName;

//	@Column(name="INVESTORNAME") // chủ đầu tư
//	private String investorName;

//	@Column(name="DESIGNNAME") // đơn vị thiết kế
//	private String designName;

	@Column(name="NOTE")
	private String note;

	public PcccApprove() {
		// TODO Auto-generated constructor stub
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Boolean getActive_() {
		return active_;
	}
	public void setActive(Boolean active_) {
		this.active_ = active_;
	}

	public Long getPcccApproveId() {
		return pcccApproveId;
	}

	public void setPcccApproveId(Long pcccApproveId) {
		this.pcccApproveId = pcccApproveId;
	}

	public String getDocCode() {
		return docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocumentPosition() {
		return documentPosition;
	}

	public void setDocumentPosition(String documentPosition) {
		this.documentPosition = documentPosition;
	}

	public Date getGrantDate() {
		return grantDate;
	}

	public void setGrantDate(Date grantDate) {
		this.grantDate = grantDate;
	}

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	public String getDocumentCode() {
		return documentCode;
	}

	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	public Long getApproveTypeId() {
		return approveTypeId;
	}

	public void setApproveTypeId(Long approveTypeId) {
		this.approveTypeId = approveTypeId;
	}

	public int getRescueDepartmentId() {
		return rescueDepartmentId;
	}

	public void setRescueDepartmentId(int rescueDepartmentId) {
		this.rescueDepartmentId = rescueDepartmentId;
	}

	public String getRescueDepartmentName() {
		return rescueDepartmentName;
	}

	public void setRescueDepartmentName(String rescueDepartmentName) {
		this.rescueDepartmentName = rescueDepartmentName;
	}

	public String getApproveTypeName() {
		return approveTypeName;
	}

	public void setApproveTypeName(String approveTypeName) {
		this.approveTypeName = approveTypeName;
	}

//	public String getInvestorName() {
//		return investorName;
//	}
//
//	public void setInvestorName(String investorName) {
//		this.investorName = investorName;
//	}

//	public String getDesignName() {
//		return designName;
//	}
//
//	public void setDesignName(String designName) {
//		this.designName = designName;
//	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
