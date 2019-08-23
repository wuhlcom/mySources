package com.zhilutec.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CtgUnit {
    private String untId;

    private String name;

    private String license;

    private String store;

    private String openingTime;

    private String provcode;

    private String towncode;

    private String distcode;

    private String citycode;

    private String address;

    private BigDecimal lat;

    private BigDecimal lng;

    private String contact;

    private String phone;

    private String legalPerson;

    private String businessCode;

    private Date soptime;

    private Integer employee;

    private Integer monitor;

    private Integer attention;

    private Integer diningtable;

    private Integer capacity;

    private BigDecimal facadeArea;

    private BigDecimal waterConsumption;

    private Integer scale;

    private Date gmtCreated;

    private Date gmtModified;

    private Integer activity;

    public String getUntId() {
        return untId;
    }

    public void setUntId(String untId) {
        this.untId = untId == null ? null : untId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store == null ? null : store.trim();
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime == null ? null : openingTime.trim();
    }

    public String getProvcode() {
        return provcode;
    }

    public void setProvcode(String provcode) {
        this.provcode = provcode == null ? null : provcode.trim();
    }

    public String getTowncode() {
        return towncode;
    }

    public void setTowncode(String towncode) {
        this.towncode = towncode == null ? null : towncode.trim();
    }

    public String getDistcode() {
        return distcode;
    }

    public void setDistcode(String distcode) {
        this.distcode = distcode == null ? null : distcode.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public Date getSoptime() {
        return soptime;
    }

    public void setSoptime(Date soptime) {
        this.soptime = soptime;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

    public Integer getMonitor() {
        return monitor;
    }

    public void setMonitor(Integer monitor) {
        this.monitor = monitor;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getDiningtable() {
        return diningtable;
    }

    public void setDiningtable(Integer diningtable) {
        this.diningtable = diningtable;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public BigDecimal getFacadeArea() {
        return facadeArea;
    }

    public void setFacadeArea(BigDecimal facadeArea) {
        this.facadeArea = facadeArea;
    }

    public BigDecimal getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(BigDecimal waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}