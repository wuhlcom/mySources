package com.zhilutec.entity;

import java.util.Date;

public class CtgSiteCheck {
    private Integer chcId;

    private String sitId;

    private Integer chcStatus;

    private Date chcTime;

    public Integer getChcId() {
        return chcId;
    }

    public void setChcId(Integer chcId) {
        this.chcId = chcId;
    }

    public String getSitId() {
        return sitId;
    }

    public void setSitId(String sitId) {
        this.sitId = sitId == null ? null : sitId.trim();
    }

    public Integer getChcStatus() {
        return chcStatus;
    }

    public void setChcStatus(Integer chcStatus) {
        this.chcStatus = chcStatus;
    }

    public Date getChcTime() {
        return chcTime;
    }

    public void setChcTime(Date chcTime) {
        this.chcTime = chcTime;
    }
}