package com.zhl.manage.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = -3096736268081409238L;
    private Integer id;

    private String username;

    private String mobile;

    private String email;

    private String password;

    private Integer insertUid;

    private Date insertTime;

    private Date updateTime;



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", insertUid=" + insertUid +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                ", isDel=" + isDel +
                ", isJob=" + isJob +
                ", mcode='" + mcode + '\'' +
                ", sendTime=" + sendTime +
                ", version=" + version +
                '}';
    }

    private Boolean isDel;

    private Boolean isJob;

    private String mcode;

    private Date sendTime;

    private Integer version;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getInsertUid() {
        return insertUid;
    }

    public void setInsertUid(Integer insertUid) {
        this.insertUid = insertUid;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public Boolean getJob() {
        return isJob;
    }

    public void setJob(Boolean job) {
        isJob = job;
    }

    public String getMcode() {
        return mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
