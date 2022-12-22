package com.pda.mobile.model.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PCCC_BUILDER")
public class PcccBuilder {
	@Id
	@GeneratedValue(generator = "BUILDER_SEQ")
	@GenericGenerator(name = "BUILDER_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Column(name = "BUILDERID")
	private long builderId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CODE_")
	private String code;

	@Column(name = "ACTIVE_")
	private Boolean active = true;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "LAT_")
	private String lat_;
	@Column(name = "LONG_")
	private String long_;

	@Column(name = "USERID")
	private Long userId ;
	@Column(name = "USERNAME")
	private String userName;
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "CREATEDATE")
	private Date createDate;

	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "MODIFIEDDATE")
	private Date modifiedDate;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "OTHERPHONE")
	private String otherPhone;

	@Column(name = "RESIDENTPHONE")
	private String residentPhone;



//	@Column(name = "ADMINILEVELNAME")
//	private String adminiLevelName ;
//
//	@Column(name = "ADMINILEVELID")
//	private Long adminiLevelId ;

	@Column(name = "CHECKNUMBERPERYEAR")
	private Long checkNumberPerYear ;
	//	//Hướng tiếp cận công trình
//	@Column(name = "DIRECTION")
//	private String direction;
//
//	@Column(name = "ACTIVITYTYPENAME")
//	private String activityTypeName ;
//
//	@Column(name = "ACTIVITYTYPEID")
//	private Long activityTypeId ;
//
//	@Column(name = "RESCUEDEPARTMENTID")
//	private Long rescueDepartmentId ;
//
//	@Column(name = "RESCUEDEPARTMENTNAME")
//	private String rescueDepartmentName ;


	@Column(name = "CADRESID")
	private Long cadresId ;
	@Column(name = "CADRESNAME")
	private String cadresName ;

	@Column(name = "RESIDENTID")
	private Long residentId ;

	@Column(name = "RESIDENTNAME")
	private String residentName ;



//
//	@Column(name = "PROVINCEID")
//	private Long provinceId ;


//
//	@Column(name = "DISTRICTID")
//	private Long districtId ;
//
//	@Column(name = "COMMUNEID")
//	private Long communeId ;


//	@Column(name = "RESIDENTIDCARD")
//	private String residentIdCard ;



//	@Column(name = "PROVINCENAME")
//	private String provinceName ;
//
//	@Column(name = "DISTRICTNAME")
//	private String districtName ;
//
//
//	@Column(name = "COMMUNENAME")
//	private String communeName ;



// trạng thái phê duyệt
//	@Column(name = "STATUSAPPROVAL")
//	private Boolean statusApproval;

	// Loại hình hoạt động



	public PcccBuilder() {
		// TODO Auto-generated constructor stub
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getResidentPhone() {
		return residentPhone;
	}

	public void setResidentPhone(String residentPhone) {
		this.residentPhone = residentPhone;
	}
	//	public String getResidentIdCard() {
//		return residentIdCard;
//	}
//
//	public void setResidentIdCard(String residentIdCard) {
//		this.residentIdCard = residentIdCard;
//	}

//	public Long getRescueDepartmentId() {
//		return rescueDepartmentId;
//	}
//
//	public void setRescueDepartmentId(Long rescueDepartmentId) {
//		this.rescueDepartmentId = rescueDepartmentId;
//	}
//
//	public String getRescueDepartmentName() {
//		return rescueDepartmentName;
//	}
//
//	public void setRescueDepartmentName(String rescueDepartmentName) {
//		this.rescueDepartmentName = rescueDepartmentName;
//	}
//
//	public Long getAdminiLevelId() {
//		return adminiLevelId;
//	}
//
//	public void setAdminiLevelId(Long adminiLevelId) {
//		this.adminiLevelId = adminiLevelId;
//	}
//
//	public Long getActivityTypeId() {
//		return activityTypeId;
//	}

	public Long getCadresId() {
		return cadresId;
	}

	public void setCadresId(Long cadresId) {
		this.cadresId = cadresId;
	}

//	public Long getProvinceId() {
//		return provinceId;
//	}
//
//	public void setProvinceId(Long provinceId) {
//		this.provinceId = provinceId;
//	}

	public Long getResidentId() {
		return residentId;
	}

	public void setResidentId(Long residentId) {
		this.residentId = residentId;
	}

//	public Long getDistrictId() {
//		return districtId;
//	}
//
//	public void setDistrictId(Long districtId) {
//		this.districtId = districtId;
//	}
//
//	public Long getCommuneId() {
//		return communeId;
//	}
//
//	public void setCommuneId(Long communeId) {
//		this.communeId = communeId;
//	}



	public String getCadresName() {
		return cadresName;
	}

	public void setCadresName(String cadresName) {
		this.cadresName = cadresName;
	}



//	public String getProvinceName() {
//		return provinceName;
//	}
//
//	public void setProvinceName(String provinceName) {
//		this.provinceName = provinceName;
//	}
//
//	public String getDistrictName() {
//		return districtName;
//	}
//
//	public void setDistrictName(String districtName) {
//		this.districtName = districtName;
//	}
//
//	public String getCommuneName() {
//		return communeName;
//	}
//
//	public void setCommuneName(String communeName) {
//		this.communeName = communeName;
//	}
//
//	public void setActivityTypeId(Long activityTypeId) {
//		this.activityTypeId = activityTypeId;
//	}
//
//	public String getActivityTypeName() {
//		return activityTypeName;
//	}
//
//	public void setActivityTypeName(String activityTypeName) {
//		this.activityTypeName = activityTypeName;
//	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

//	public String getDirection() {
//		return direction;
//	}
//
//	public void setDirection(String direction) {
//		this.direction = direction;
//	}
	public Long getCheckNumberPerYear() {
		return checkNumberPerYear;
	}

	public void setCheckNumberPerYear(Long checkNumberPerYear) {
		this.checkNumberPerYear = checkNumberPerYear;
	}
//	public String getAdminiLevelName() {
//		return adminiLevelName;
//	}
//
//	public void setAdminiLevelName(String adminiLevelName) {
//		this.adminiLevelName = adminiLevelName;
//	}

	public long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(long builderId) {
		this.builderId = builderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLat_() {
		return lat_;
	}

	public void setLat_(String lat_) {
		this.lat_ = lat_;
	}

	public String getLong_() {
		return long_;
	}

	public void setLong_(String long_) {
		this.long_ = long_;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
