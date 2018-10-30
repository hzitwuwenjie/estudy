package com.bj1804.estudy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * dept
 * @author 
 */
public class Dept implements Serializable {
    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 部门名称
     */
    private String deptname;

    /**
     * 上级部门id
     */
    private String higherdeptid;

    /**
     * 部门主管
     */
    private String deptdirector;

    /**
     * 部门路径
     */
    private String deptpath;

    /**
     * 部门级别
     */
    private Integer deptgrade;

    /**
     * 用户创建时间
     */
    private Date createtime;

    /**
     * 用户修改时间
     */
    private Date updatetime;

    /**
     * 创建者
     */
    private String createuser;

    /**
     * 修改者
     */
    private String updateuser;

    /**
     * 所属企业ID
     */
    private Integer businessid;

    private static final long serialVersionUID = 1L;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getHigherdeptid() {
        return higherdeptid;
    }

    public void setHigherdeptid(String higherdeptid) {
        this.higherdeptid = higherdeptid;
    }

    public String getDeptdirector() {
        return deptdirector;
    }

    public void setDeptdirector(String deptdirector) {
        this.deptdirector = deptdirector;
    }

    public String getDeptpath() {
        return deptpath;
    }

    public void setDeptpath(String deptpath) {
        this.deptpath = deptpath;
    }

    public Integer getDeptgrade() {
        return deptgrade;
    }

    public void setDeptgrade(Integer deptgrade) {
        this.deptgrade = deptgrade;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dept other = (Dept) that;
        return (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
            && (this.getHigherdeptid() == null ? other.getHigherdeptid() == null : this.getHigherdeptid().equals(other.getHigherdeptid()))
            && (this.getDeptdirector() == null ? other.getDeptdirector() == null : this.getDeptdirector().equals(other.getDeptdirector()))
            && (this.getDeptpath() == null ? other.getDeptpath() == null : this.getDeptpath().equals(other.getDeptpath()))
            && (this.getDeptgrade() == null ? other.getDeptgrade() == null : this.getDeptgrade().equals(other.getDeptgrade()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCreateuser() == null ? other.getCreateuser() == null : this.getCreateuser().equals(other.getCreateuser()))
            && (this.getUpdateuser() == null ? other.getUpdateuser() == null : this.getUpdateuser().equals(other.getUpdateuser()))
            && (this.getBusinessid() == null ? other.getBusinessid() == null : this.getBusinessid().equals(other.getBusinessid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getDeptname() == null) ? 0 : getDeptname().hashCode());
        result = prime * result + ((getHigherdeptid() == null) ? 0 : getHigherdeptid().hashCode());
        result = prime * result + ((getDeptdirector() == null) ? 0 : getDeptdirector().hashCode());
        result = prime * result + ((getDeptpath() == null) ? 0 : getDeptpath().hashCode());
        result = prime * result + ((getDeptgrade() == null) ? 0 : getDeptgrade().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCreateuser() == null) ? 0 : getCreateuser().hashCode());
        result = prime * result + ((getUpdateuser() == null) ? 0 : getUpdateuser().hashCode());
        result = prime * result + ((getBusinessid() == null) ? 0 : getBusinessid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptid=").append(deptid);
        sb.append(", deptname=").append(deptname);
        sb.append(", higherdeptid=").append(higherdeptid);
        sb.append(", deptdirector=").append(deptdirector);
        sb.append(", deptpath=").append(deptpath);
        sb.append(", deptgrade=").append(deptgrade);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", businessid=").append(businessid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}