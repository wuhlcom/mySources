package com.zhilutec.entity;

import java.util.Date;

public class CtgSiteAudit {
    private Integer adtId;

    private String sitId;

    private Integer adtStatus;

    private Date adtTime;

    private Date expireTime;

    public Integer getAdtId() {
        return adtId;
    }

    public void setAdtId(Integer adtId) {
        this.adtId = adtId;
    }

    public String getSitId() {
        return sitId;
    }

    public void setSitId(String sitId) {
        this.sitId = sitId == null ? null : sitId.trim();
    }

    public Integer getAdtStatus() {
        return adtStatus;
    }

    public void setAdtStatus(Integer adtStatus) {
        this.adtStatus = adtStatus;
    }

    public Date getAdtTime() {
        return adtTime;
    }

    public void setAdtTime(Date adtTime) {
        this.adtTime = adtTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}