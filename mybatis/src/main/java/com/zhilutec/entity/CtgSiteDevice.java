package com.zhilutec.entity;

public class CtgSiteDevice {
    private Integer sdId;

    private String sitId;

    private String devId;

    private Integer activity;

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public String getSitId() {
        return sitId;
    }

    public void setSitId(String sitId) {
        this.sitId = sitId == null ? null : sitId.trim();
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId == null ? null : devId.trim();
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}