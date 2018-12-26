package com.zhl.manage.pojo;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {
    private Integer id;

    private String name;

    private Integer pid;

    private Integer zindex;

    private Integer istype;

    private String descpt;

    private String code;

    private String icon;

    private String page;

    private Date insertTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getZindex() {
        return zindex;
    }

    public void setZindex(Integer zindex) {
        this.zindex = zindex;
    }

    public Integer getIstype() {
        return istype;
    }

    public void setIstype(Integer istype) {
        this.istype = istype;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", zindex=" + zindex +
                ", istype=" + istype +
                ", descpt='" + descpt + '\'' +
                ", code='" + code + '\'' +
                ", icon='" + icon + '\'' +
                ", page='" + page + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getDescpt() {
        return descpt;
    }

    public void setDescpt(String descpt) {
        this.descpt = descpt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
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
}
