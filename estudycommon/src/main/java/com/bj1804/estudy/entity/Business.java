package com.bj1804.estudy.entity;

import java.io.Serializable;

/**
 * business
 * @author 
 */
public class Business implements Serializable {
    /**
     * 企业id
     */
    private Integer businessid;

    /**
     * 官方网址
     */
    private String url;

    /**
     * 地址
     */
    private String businessplace;

    /**
     * 固定电话
     */
    private String businessphone;

    /**
     * 企业简称
     */
    private String abbreviation;

    /**
     * 企业全称
     */
    private String businessname;

    /**
     * 是否认证
     */
    private Integer isauth;

    /**
     * 管理员帐号
     */
    private String smaccount;

    /**
     * 企业邮箱
     */
    private String mail;

    /**
     * 企业logo
     */
    private String logo;

    /**
     * 产品版本
     */
    private String pversion;

    /**
     * 服务剩余天数
     */
    private Integer remainning;

    /**
     * 账户余额
     */
    private String businesscount;

    private static final long serialVersionUID = 1L;

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBusinessplace() {
        return businessplace;
    }

    public void setBusinessplace(String businessplace) {
        this.businessplace = businessplace;
    }

    public String getBusinessphone() {
        return businessphone;
    }

    public void setBusinessphone(String businessphone) {
        this.businessphone = businessphone;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public Integer getIsauth() {
        return isauth;
    }

    public void setIsauth(Integer isauth) {
        this.isauth = isauth;
    }

    public String getSmaccount() {
        return smaccount;
    }

    public void setSmaccount(String smaccount) {
        this.smaccount = smaccount;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPversion() {
        return pversion;
    }

    public void setPversion(String pversion) {
        this.pversion = pversion;
    }

    public Integer getRemainning() {
        return remainning;
    }

    public void setRemainning(Integer remainning) {
        this.remainning = remainning;
    }

    public String getBusinesscount() {
        return businesscount;
    }

    public void setBusinesscount(String businesscount) {
        this.businesscount = businesscount;
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
        Business other = (Business) that;
        return (this.getBusinessid() == null ? other.getBusinessid() == null : this.getBusinessid().equals(other.getBusinessid()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getBusinessplace() == null ? other.getBusinessplace() == null : this.getBusinessplace().equals(other.getBusinessplace()))
            && (this.getBusinessphone() == null ? other.getBusinessphone() == null : this.getBusinessphone().equals(other.getBusinessphone()))
            && (this.getAbbreviation() == null ? other.getAbbreviation() == null : this.getAbbreviation().equals(other.getAbbreviation()))
            && (this.getBusinessname() == null ? other.getBusinessname() == null : this.getBusinessname().equals(other.getBusinessname()))
            && (this.getIsauth() == null ? other.getIsauth() == null : this.getIsauth().equals(other.getIsauth()))
            && (this.getSmaccount() == null ? other.getSmaccount() == null : this.getSmaccount().equals(other.getSmaccount()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getPversion() == null ? other.getPversion() == null : this.getPversion().equals(other.getPversion()))
            && (this.getRemainning() == null ? other.getRemainning() == null : this.getRemainning().equals(other.getRemainning()))
            && (this.getBusinesscount() == null ? other.getBusinesscount() == null : this.getBusinesscount().equals(other.getBusinesscount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBusinessid() == null) ? 0 : getBusinessid().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getBusinessplace() == null) ? 0 : getBusinessplace().hashCode());
        result = prime * result + ((getBusinessphone() == null) ? 0 : getBusinessphone().hashCode());
        result = prime * result + ((getAbbreviation() == null) ? 0 : getAbbreviation().hashCode());
        result = prime * result + ((getBusinessname() == null) ? 0 : getBusinessname().hashCode());
        result = prime * result + ((getIsauth() == null) ? 0 : getIsauth().hashCode());
        result = prime * result + ((getSmaccount() == null) ? 0 : getSmaccount().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getPversion() == null) ? 0 : getPversion().hashCode());
        result = prime * result + ((getRemainning() == null) ? 0 : getRemainning().hashCode());
        result = prime * result + ((getBusinesscount() == null) ? 0 : getBusinesscount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", businessid=").append(businessid);
        sb.append(", url=").append(url);
        sb.append(", businessplace=").append(businessplace);
        sb.append(", businessphone=").append(businessphone);
        sb.append(", abbreviation=").append(abbreviation);
        sb.append(", businessname=").append(businessname);
        sb.append(", isauth=").append(isauth);
        sb.append(", smaccount=").append(smaccount);
        sb.append(", mail=").append(mail);
        sb.append(", logo=").append(logo);
        sb.append(", pversion=").append(pversion);
        sb.append(", remainning=").append(remainning);
        sb.append(", businesscount=").append(businesscount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}