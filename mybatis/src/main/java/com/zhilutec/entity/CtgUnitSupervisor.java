package com.zhilutec.entity;

public class CtgUnitSupervisor {
    private Integer usId;

    private String untId;

    private String spvId;

    private Integer activity;

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getUntId() {
        return untId;
    }

    public void setUntId(String untId) {
        this.untId = untId == null ? null : untId.trim();
    }

    public String getSpvId() {
        return spvId;
    }

    public void setSpvId(String spvId) {
        this.spvId = spvId == null ? null : spvId.trim();
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}