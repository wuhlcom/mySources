package com.zhilutec.entity;

import java.util.Date;

public class CtgSupervisor {
    private String spvId;

    private String name;

    private String phone;

    private Date gmtCreated;

    private Date gmtModified;

    private Integer activity;

    public String getSpvId() {
        return spvId;
    }

    public void setSpvId(String spvId) {
        this.spvId = spvId == null ? null : spvId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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