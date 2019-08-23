package com.zhilutec.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CtgSite {
    private String sitId;

    private String name;

    private Integer type;

    private String original;

    private String location;

    private BigDecimal lat;

    private BigDecimal lng;

    private String distcode;

    private String maintainer;

    private String phone;

    private Date chcTime;

    private Byte check;

    private Date expireTime;

    private Date adtTime;

    private Byte audit;

    private String factors;

    private Date gmtCreated;

    private Date gmtModified;

    private Integer activity;

    public String getSitId() {
        return sitId;
    }

    public void setSitId(String sitId) {
        this.sitId = sitId == null ? null : sitId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original == null ? null : original.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
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

    public String getDistcode() {
        return distcode;
    }

    public void setDistcode(String distcode) {
        this.distcode = distcode == null ? null : distcode.trim();
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer == null ? null : maintainer.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getChcTime() {
        return chcTime;
    }

    public void setChcTime(Date chcTime) {
        this.chcTime = chcTime;
    }

    public Byte getCheck() {
        return check;
    }

    public void setCheck(Byte check) {
        this.check = check;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getAdtTime() {
        return adtTime;
    }

    public void setAdtTime(Date adtTime) {
        this.adtTime = adtTime;
    }

    public Byte getAudit() {
        return audit;
    }

    public void setAudit(Byte audit) {
        this.audit = audit;
    }

    public String getFactors() {
        return factors;
    }

    public void setFactors(String factors) {
        this.factors = factors == null ? null : factors.trim();
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