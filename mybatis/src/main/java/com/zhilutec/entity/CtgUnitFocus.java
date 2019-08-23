package com.zhilutec.entity;

public class CtgUnitFocus {
    private Integer ufId;

    private String untId;

    private String fcsId;

    private Integer activity;

    public Integer getUfId() {
        return ufId;
    }

    public void setUfId(Integer ufId) {
        this.ufId = ufId;
    }

    public String getUntId() {
        return untId;
    }

    public void setUntId(String untId) {
        this.untId = untId == null ? null : untId.trim();
    }

    public String getFcsId() {
        return fcsId;
    }

    public void setFcsId(String fcsId) {
        this.fcsId = fcsId == null ? null : fcsId.trim();
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}