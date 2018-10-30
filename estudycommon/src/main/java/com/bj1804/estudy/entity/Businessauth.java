package com.bj1804.estudy.entity;

import java.io.Serializable;

/**
 * businessauth
 * @author 
 */
public class Businessauth implements Serializable {
    /**
     * 认证id
     */
    private String authid;

    /**
     * 企业id
     */
    private String businessid;

    /**
     * 专属路径
     */
    private String exclusiveurl;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 单位性质
     */
    private String properties;

    /**
     * 统一社会信用代码
     */
    private String creditcode;

    /**
     * 证书
     */
    private String credentials;

    private static final long serialVersionUID = 1L;

    public String getAuthid() {
        return authid;
    }

    public void setAuthid(String authid) {
        this.authid = authid;
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid;
    }

    public String getExclusiveurl() {
        return exclusiveurl;
    }

    public void setExclusiveurl(String exclusiveurl) {
        this.exclusiveurl = exclusiveurl;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getCreditcode() {
        return creditcode;
    }

    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
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
        Businessauth other = (Businessauth) that;
        return (this.getAuthid() == null ? other.getAuthid() == null : this.getAuthid().equals(other.getAuthid()))
            && (this.getBusinessid() == null ? other.getBusinessid() == null : this.getBusinessid().equals(other.getBusinessid()))
            && (this.getExclusiveurl() == null ? other.getExclusiveurl() == null : this.getExclusiveurl().equals(other.getExclusiveurl()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getProperties() == null ? other.getProperties() == null : this.getProperties().equals(other.getProperties()))
            && (this.getCreditcode() == null ? other.getCreditcode() == null : this.getCreditcode().equals(other.getCreditcode()))
            && (this.getCredentials() == null ? other.getCredentials() == null : this.getCredentials().equals(other.getCredentials()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthid() == null) ? 0 : getAuthid().hashCode());
        result = prime * result + ((getBusinessid() == null) ? 0 : getBusinessid().hashCode());
        result = prime * result + ((getExclusiveurl() == null) ? 0 : getExclusiveurl().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getProperties() == null) ? 0 : getProperties().hashCode());
        result = prime * result + ((getCreditcode() == null) ? 0 : getCreditcode().hashCode());
        result = prime * result + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authid=").append(authid);
        sb.append(", businessid=").append(businessid);
        sb.append(", exclusiveurl=").append(exclusiveurl);
        sb.append(", industry=").append(industry);
        sb.append(", properties=").append(properties);
        sb.append(", creditcode=").append(creditcode);
        sb.append(", credentials=").append(credentials);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}