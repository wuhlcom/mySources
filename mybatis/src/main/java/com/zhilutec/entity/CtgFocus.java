package com.zhilutec.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CtgFocus {
    private String fcsId;

    private Integer type;

    private String name;

    private String original;

    private String location;

    private BigDecimal lat;

    private BigDecimal lng;

    private String dctCode;

    private String remark;

    private Integer monitor;

    private Integer activity;

    private Date gmtCreated;

    private Date gmtModified;

    public String getFcsId() {
        return fcsId;
    }

    public void setFcsId(String fcsId) {
        this.fcsId = fcsId == null ? null : fcsId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getDctCode() {
        return dctCode;
    }

    public void setDctCode(String dctCode) {
        this.dctCode = dctCode == null ? null : dctCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getMonitor() {
        return monitor;
    }

    public void setMonitor(Integer monitor) {
        this.monitor = monitor;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
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
}