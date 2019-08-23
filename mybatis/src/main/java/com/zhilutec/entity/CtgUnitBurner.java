package com.zhilutec.entity;

public class CtgUnitBurner {
    private Integer ubId;

    private String untId;

    private String bnrId;

    private Integer activity;

    public Integer getUbId() {
        return ubId;
    }

    public void setUbId(Integer ubId) {
        this.ubId = ubId;
    }

    public String getUntId() {
        return untId;
    }

    public void setUntId(String untId) {
        this.untId = untId == null ? null : untId.trim();
    }

    public String getBnrId() {
        return bnrId;
    }

    public void setBnrId(String bnrId) {
        this.bnrId = bnrId == null ? null : bnrId.trim();
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}