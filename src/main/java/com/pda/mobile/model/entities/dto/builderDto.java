package com.pda.mobile.model.entities.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PCCC_BUILDER")
public class builderDto {

    @Id
    @GeneratedValue(generator = "BUILDER_SEQ")
    @GenericGenerator(name = "BUILDER_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
    @Column(name = "BUILDERID")
    private long builderId;

    @Column(name = "userid")
    private Long userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "createdate")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
    private Date createDate;

    @Column(name = "modifieddate")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
    private Date modifiedDate;

    @Column(name = "active_")
    private Boolean active = true;

    @Column(length = 129, name = "name")
    private String name;

    @Column(length = 65, name = "code_")
    private String code;

    @Column(name = "properties")
    private String properties;

    @Column(length = 257, name = "description")
    private String description;

    @Column(length = 257, name = "address")
    private String address;

    @Column(length = 21, name = "phone")
    private String phone;

    @Column(length = 3501, name = "otherphone")
    private String otherPhone;

    @Column(length = 129, name = "direction")
    private String direction;

    @Column(name = "isdisplayonmap")
    private Boolean isDisplayOnMap;

    @Column(name = "registerdate")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
    private Date registerDate;

    @Column(name = "expiredate")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
    private Date expireDate;

    @Column(length = 5, name = "startupyear")
    private String startUpYear;

    @Column(name = "digitalize")
    private Boolean digitalize;

    @Column(name = "firesafetyid")
    private Long fireSafetyId;

    @Column(name = "sensornumber")
    private Long sensorNumber;

    @Column(name = "search")
    private String search;

    @Column(name = "ownertypeid")
    private Long ownerTypeId;

    @Column(name = "builderownerid")
    private String builderOwnerId;

    @Column(name = "fireinsurancerequired")
    private Boolean fireInsuranceRequired;

    @Column(name = "fireinsurancebought")
    private Boolean fireInsuranceBought;

    @Column(length = 129, name = "web")
    private String web;

    @Column(length = 129, name = "email")
    private String email;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "checknumberperyear")
    private Long checkNumberPerYear;

    @Column(length = 21, name = "lat_")
    private String lat_;

    @Column(length = 21, name = "long_")
    private String long_;

    @Column(name = "adminilevelid")
    private Long adminiLevelId;

    @Column(name = "countryinvestmentid")
    private Long countryInvestmentId;

    @Column(name = "buildertypeid")
    private Long builderTypeId;

    @Column(name = "economicsectors")
    private String economicSectors;

    @Column(name = "branchfield")
    private String branchField;

    @Column(name = "investmenttypeid")
    private Long investmentTypeId;

    @Column(name = "activitytypeid")
    private Long activityTypeId;

    @Column(name = "residentid")
    private Long residentId;

    @Column(name = "cadresid")
    private Long cadresId;

    @Column(name = "rescuedepartmentid")
    private Long rescueDepartmentId;

    @Column(name = "provinceid")
    private Long provinceId;

    @Column(name = "districtid")
    private Long districtId;

    @Column(name = "communeid")
    private Long communeId;

    @Transient
    private String provinceName;

    @Transient
    private String districtName;

    public builderDto() {
    }

    public long getBuilderId() {
        return builderId;
    }

    public void setBuilderId(long builderId) {
        this.builderId = builderId;
    }

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

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Boolean getDisplayOnMap() {
        return isDisplayOnMap;
    }

    public void setDisplayOnMap(Boolean displayOnMap) {
        isDisplayOnMap = displayOnMap;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getStartUpYear() {
        return startUpYear;
    }

    public void setStartUpYear(String startUpYear) {
        this.startUpYear = startUpYear;
    }

    public Boolean getDigitalize() {
        return digitalize;
    }

    public void setDigitalize(Boolean digitalize) {
        this.digitalize = digitalize;
    }

    public Long getFireSafetyId() {
        return fireSafetyId;
    }

    public void setFireSafetyId(Long fireSafetyId) {
        this.fireSafetyId = fireSafetyId;
    }

    public Long getSensorNumber() {
        return sensorNumber;
    }

    public void setSensorNumber(Long sensorNumber) {
        this.sensorNumber = sensorNumber;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Long getOwnerTypeId() {
        return ownerTypeId;
    }

    public void setOwnerTypeId(Long ownerTypeId) {
        this.ownerTypeId = ownerTypeId;
    }

    public String getBuilderOwnerId() {
        return builderOwnerId;
    }

    public void setBuilderOwnerId(String builderOwnerId) {
        this.builderOwnerId = builderOwnerId;
    }

    public Boolean getFireInsuranceRequired() {
        return fireInsuranceRequired;
    }

    public void setFireInsuranceRequired(Boolean fireInsuranceRequired) {
        this.fireInsuranceRequired = fireInsuranceRequired;
    }

    public Boolean getFireInsuranceBought() {
        return fireInsuranceBought;
    }

    public void setFireInsuranceBought(Boolean fireInsuranceBought) {
        this.fireInsuranceBought = fireInsuranceBought;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getCheckNumberPerYear() {
        return checkNumberPerYear;
    }

    public void setCheckNumberPerYear(Long checkNumberPerYear) {
        this.checkNumberPerYear = checkNumberPerYear;
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

    public Long getAdminiLevelId() {
        return adminiLevelId;
    }

    public void setAdminiLevelId(Long adminiLevelId) {
        this.adminiLevelId = adminiLevelId;
    }

    public Long getCountryInvestmentId() {
        return countryInvestmentId;
    }

    public void setCountryInvestmentId(Long countryInvestmentId) {
        this.countryInvestmentId = countryInvestmentId;
    }

    public Long getBuilderTypeId() {
        return builderTypeId;
    }

    public void setBuilderTypeId(Long builderTypeId) {
        this.builderTypeId = builderTypeId;
    }

    public String getEconomicSectors() {
        return economicSectors;
    }

    public void setEconomicSectors(String economicSectors) {
        this.economicSectors = economicSectors;
    }

    public String getBranchField() {
        return branchField;
    }

    public void setBranchField(String branchField) {
        this.branchField = branchField;
    }

    public Long getInvestmentTypeId() {
        return investmentTypeId;
    }

    public void setInvestmentTypeId(Long investmentTypeId) {
        this.investmentTypeId = investmentTypeId;
    }

    public Long getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Long activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public Long getResidentId() {
        return residentId;
    }

    public void setResidentId(Long residentId) {
        this.residentId = residentId;
    }

    public Long getCadresId() {
        return cadresId;
    }

    public void setCadresId(Long cadresId) {
        this.cadresId = cadresId;
    }

    public Long getRescueDepartmentId() {
        return rescueDepartmentId;
    }

    public void setRescueDepartmentId(Long rescueDepartmentId) {
        this.rescueDepartmentId = rescueDepartmentId;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getCommuneId() {
        return communeId;
    }

    public void setCommuneId(Long communeId) {
        this.communeId = communeId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
