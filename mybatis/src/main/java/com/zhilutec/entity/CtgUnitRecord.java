package com.zhilutec.entity;

public class CtgUnitRecord {
    private Integer urId;

    private String untId;

    private Integer fileId;

    private String dctCode;

    private Integer activity;

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    public String getUntId() {
        return untId;
    }

    public void setUntId(String untId) {
        this.untId = untId == null ? null : untId.trim();
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getDctCode() {
        return dctCode;
    }

    public void setDctCode(String dctCode) {
        this.dctCode = dctCode == null ? null : dctCode.trim();
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}