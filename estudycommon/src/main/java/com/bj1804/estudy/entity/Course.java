package com.bj1804.estudy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * course
 * @author 
 */
public class Course implements Serializable {
    /**
     * 课程ID
     */
    private String courseid;

    private String businessid;

    /**
     * 创建课程的员工ID
     */
    private String empid;

    /**
     * 课程封面图片（路径）
     */
    private String courimg;

    /**
     * 课程名
     */
    private String courname;

    /**
     * 课程发布状态（发布/未发布）
     */
    private Boolean pubstate;

    /**
     * 创建课程时间
     */
    private Date createtime;

    /**
     * 上次更新时间
     */
    private Date lastupdate;

    /**
     * 知识分类ID(需引用知识分类表)
     */
    private String knowid;

    /**
     * 课程简介
     */
    private String cdesc;

    /**
     * 课程是否热门
     */
    private Boolean ishot;

    /**
     * 浏览量
     */
    private Integer lookcount;

    /**
     * 收藏量
     */
    private Integer collerctcount;

    /**
     * 点赞量
     */
    private Integer agreecount;

    private static final long serialVersionUID = 1L;

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getCourimg() {
        return courimg;
    }

    public void setCourimg(String courimg) {
        this.courimg = courimg;
    }

    public String getCourname() {
        return courname;
    }

    public void setCourname(String courname) {
        this.courname = courname;
    }

    public Boolean getPubstate() {
        return pubstate;
    }

    public void setPubstate(Boolean pubstate) {
        this.pubstate = pubstate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getKnowid() {
        return knowid;
    }

    public void setKnowid(String knowid) {
        this.knowid = knowid;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    public Boolean getIshot() {
        return ishot;
    }

    public void setIshot(Boolean ishot) {
        this.ishot = ishot;
    }

    public Integer getLookcount() {
        return lookcount;
    }

    public void setLookcount(Integer lookcount) {
        this.lookcount = lookcount;
    }

    public Integer getCollerctcount() {
        return collerctcount;
    }

    public void setCollerctcount(Integer collerctcount) {
        this.collerctcount = collerctcount;
    }

    public Integer getAgreecount() {
        return agreecount;
    }

    public void setAgreecount(Integer agreecount) {
        this.agreecount = agreecount;
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
        Course other = (Course) that;
        return (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getBusinessid() == null ? other.getBusinessid() == null : this.getBusinessid().equals(other.getBusinessid()))
            && (this.getEmpid() == null ? other.getEmpid() == null : this.getEmpid().equals(other.getEmpid()))
            && (this.getCourimg() == null ? other.getCourimg() == null : this.getCourimg().equals(other.getCourimg()))
            && (this.getCourname() == null ? other.getCourname() == null : this.getCourname().equals(other.getCourname()))
            && (this.getPubstate() == null ? other.getPubstate() == null : this.getPubstate().equals(other.getPubstate()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLastupdate() == null ? other.getLastupdate() == null : this.getLastupdate().equals(other.getLastupdate()))
            && (this.getKnowid() == null ? other.getKnowid() == null : this.getKnowid().equals(other.getKnowid()))
            && (this.getCdesc() == null ? other.getCdesc() == null : this.getCdesc().equals(other.getCdesc()))
            && (this.getIshot() == null ? other.getIshot() == null : this.getIshot().equals(other.getIshot()))
            && (this.getLookcount() == null ? other.getLookcount() == null : this.getLookcount().equals(other.getLookcount()))
            && (this.getCollerctcount() == null ? other.getCollerctcount() == null : this.getCollerctcount().equals(other.getCollerctcount()))
            && (this.getAgreecount() == null ? other.getAgreecount() == null : this.getAgreecount().equals(other.getAgreecount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourseid() == null) ? 0 : getCourseid().hashCode());
        result = prime * result + ((getBusinessid() == null) ? 0 : getBusinessid().hashCode());
        result = prime * result + ((getEmpid() == null) ? 0 : getEmpid().hashCode());
        result = prime * result + ((getCourimg() == null) ? 0 : getCourimg().hashCode());
        result = prime * result + ((getCourname() == null) ? 0 : getCourname().hashCode());
        result = prime * result + ((getPubstate() == null) ? 0 : getPubstate().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastupdate() == null) ? 0 : getLastupdate().hashCode());
        result = prime * result + ((getKnowid() == null) ? 0 : getKnowid().hashCode());
        result = prime * result + ((getCdesc() == null) ? 0 : getCdesc().hashCode());
        result = prime * result + ((getIshot() == null) ? 0 : getIshot().hashCode());
        result = prime * result + ((getLookcount() == null) ? 0 : getLookcount().hashCode());
        result = prime * result + ((getCollerctcount() == null) ? 0 : getCollerctcount().hashCode());
        result = prime * result + ((getAgreecount() == null) ? 0 : getAgreecount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseid=").append(courseid);
        sb.append(", businessid=").append(businessid);
        sb.append(", empid=").append(empid);
        sb.append(", courimg=").append(courimg);
        sb.append(", courname=").append(courname);
        sb.append(", pubstate=").append(pubstate);
        sb.append(", createtime=").append(createtime);
        sb.append(", lastupdate=").append(lastupdate);
        sb.append(", knowid=").append(knowid);
        sb.append(", cdesc=").append(cdesc);
        sb.append(", ishot=").append(ishot);
        sb.append(", lookcount=").append(lookcount);
        sb.append(", collerctcount=").append(collerctcount);
        sb.append(", agreecount=").append(agreecount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}