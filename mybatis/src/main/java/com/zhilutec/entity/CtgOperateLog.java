package com.zhilutec.entity;

import java.util.Date;

public class CtgOperateLog {
    private String logId;

    private String userName;

    private String userIp;

    private String logObj;

    private String logDtl;

    private Byte logLevel;

    private Date logTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public String getLogObj() {
        return logObj;
    }

    public void setLogObj(String logObj) {
        this.logObj = logObj == null ? null : logObj.trim();
    }

    public String getLogDtl() {
        return logDtl;
    }

    public void setLogDtl(String logDtl) {
        this.logDtl = logDtl == null ? null : logDtl.trim();
    }

    public Byte getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(Byte logLevel) {
        this.logLevel = logLevel;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}