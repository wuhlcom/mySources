package com.zhilutec.entity;

import java.math.BigDecimal;

public class CtgBurner {
    private String bnrId;

    private String dctCode;

    private Integer number;

    private BigDecimal power;

    private String fuelDctCode;

    private Integer activity;

    public String getBnrId() {
        return bnrId;
    }

    public void setBnrId(String bnrId) {
        this.bnrId = bnrId == null ? null : bnrId.trim();
    }

    public String getDctCode() {
        return dctCode;
    }

    public void setDctCode(String dctCode) {
        this.dctCode = dctCode == null ? null : dctCode.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPower() {
        return power;
    }

    public void setPower(BigDecimal power) {
        this.power = power;
    }

    public String getFuelDctCode() {
        return fuelDctCode;
    }

    public void setFuelDctCode(String fuelDctCode) {
        this.fuelDctCode = fuelDctCode == null ? null : fuelDctCode.trim();
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}