package com.bj1804.estudy.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * employee
 * @author 
 */
public class Employee implements Serializable {
    /**
     * 员工id
     */
    private Integer employeeid;

    /**
     * 员工姓名
     */
    private String employeename;

    /**
     * 电话
     */
    private String phone;

    /**
     * 员工编号
     */
    private String employeenumber;

    /**
     * 员工工作邮箱
     */
    private String mail;

    /**
     * 员工性别
     */
    private String sex;

    /**
     * 职位
     */
    private String job;

    /**
     * 工作年限
     */
    private Integer workinglife;

    /**
     * 擅长领域
     */
    private String adept;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 头像
     */
    private String headimg;

    /**
     * 企业id
     */
    private String businessid;

    /**
     * 是否离职
     */
    private String isleave;

    /**
     * 入职时间
     */
    private Date jointime;

    /**
     * 离职时间
     */
    private Date leavetime;

    /**
     * 离开方式
     */
    private String leaveway;

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
     * 账户余额
     */
    private BigDecimal account;

    /**
     * 代表是否删除（1表示存在，0表示删除）
     */
    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getWorkinglife() {
        return workinglife;
    }

    public void setWorkinglife(Integer workinglife) {
        this.workinglife = workinglife;
    }

    public String getAdept() {
        return adept;
    }

    public void setAdept(String adept) {
        this.adept = adept;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid;
    }

    public String getIsleave() {
        return isleave;
    }

    public void setIsleave(String isleave) {
        this.isleave = isleave;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public String getLeaveway() {
        return leaveway;
    }

    public void setLeaveway(String leaveway) {
        this.leaveway = leaveway;
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

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
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
        Employee other = (Employee) that;
        return (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getEmployeename() == null ? other.getEmployeename() == null : this.getEmployeename().equals(other.getEmployeename()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmployeenumber() == null ? other.getEmployeenumber() == null : this.getEmployeenumber().equals(other.getEmployeenumber()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getWorkinglife() == null ? other.getWorkinglife() == null : this.getWorkinglife().equals(other.getWorkinglife()))
            && (this.getAdept() == null ? other.getAdept() == null : this.getAdept().equals(other.getAdept()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getHeadimg() == null ? other.getHeadimg() == null : this.getHeadimg().equals(other.getHeadimg()))
            && (this.getBusinessid() == null ? other.getBusinessid() == null : this.getBusinessid().equals(other.getBusinessid()))
            && (this.getIsleave() == null ? other.getIsleave() == null : this.getIsleave().equals(other.getIsleave()))
            && (this.getJointime() == null ? other.getJointime() == null : this.getJointime().equals(other.getJointime()))
            && (this.getLeavetime() == null ? other.getLeavetime() == null : this.getLeavetime().equals(other.getLeavetime()))
            && (this.getLeaveway() == null ? other.getLeaveway() == null : this.getLeaveway().equals(other.getLeaveway()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCreateuser() == null ? other.getCreateuser() == null : this.getCreateuser().equals(other.getCreateuser()))
            && (this.getUpdateuser() == null ? other.getUpdateuser() == null : this.getUpdateuser().equals(other.getUpdateuser()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getEmployeename() == null) ? 0 : getEmployeename().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmployeenumber() == null) ? 0 : getEmployeenumber().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getWorkinglife() == null) ? 0 : getWorkinglife().hashCode());
        result = prime * result + ((getAdept() == null) ? 0 : getAdept().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getHeadimg() == null) ? 0 : getHeadimg().hashCode());
        result = prime * result + ((getBusinessid() == null) ? 0 : getBusinessid().hashCode());
        result = prime * result + ((getIsleave() == null) ? 0 : getIsleave().hashCode());
        result = prime * result + ((getJointime() == null) ? 0 : getJointime().hashCode());
        result = prime * result + ((getLeavetime() == null) ? 0 : getLeavetime().hashCode());
        result = prime * result + ((getLeaveway() == null) ? 0 : getLeaveway().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCreateuser() == null) ? 0 : getCreateuser().hashCode());
        result = prime * result + ((getUpdateuser() == null) ? 0 : getUpdateuser().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeid=").append(employeeid);
        sb.append(", employeename=").append(employeename);
        sb.append(", phone=").append(phone);
        sb.append(", employeenumber=").append(employeenumber);
        sb.append(", mail=").append(mail);
        sb.append(", sex=").append(sex);
        sb.append(", job=").append(job);
        sb.append(", workinglife=").append(workinglife);
        sb.append(", adept=").append(adept);
        sb.append(", introduction=").append(introduction);
        sb.append(", headimg=").append(headimg);
        sb.append(", businessid=").append(businessid);
        sb.append(", isleave=").append(isleave);
        sb.append(", jointime=").append(jointime);
        sb.append(", leavetime=").append(leavetime);
        sb.append(", leaveway=").append(leaveway);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", account=").append(account);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}