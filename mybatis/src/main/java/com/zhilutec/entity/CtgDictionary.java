package com.zhilutec.entity;

public class CtgDictionary {
    private Integer dctId;

    private String name;

    private String code;

    private String type;

    public Integer getDctId() {
        return dctId;
    }

    public void setDctId(Integer dctId) {
        this.dctId = dctId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}