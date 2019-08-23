package com.zhilutec.entity;

public class CtgFocusSite {
    private Integer fsId;

    private String fcsId;

    private String sitId;

    private Integer activity;

    public Integer getFsId() {
        return fsId;
    }

    public void setFsId(Integer fsId) {
        this.fsId = fsId;
    }

    public String getFcsId() {
        return fcsId;
    }

    public void setFcsId(String fcsId) {
        this.fcsId = fcsId == null ? null : fcsId.trim();
    }

    public String getSitId() {
        return sitId;
    }

    public void setSitId(String sitId) {
        this.sitId = sitId == null ? null : sitId.trim();
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}