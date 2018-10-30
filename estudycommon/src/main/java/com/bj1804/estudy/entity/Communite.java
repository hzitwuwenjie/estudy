package com.bj1804.estudy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * communite
 * @author 
 */
public class Communite implements Serializable {
    /**
     * 社区id
     */
    private String communiteid;

    /**
     * 企业id
     */
    private String businessid;

    /**
     * 内容
     */
    private String content;

    /**
     * 员工id
     */
    private String employeeid;

    /**
     * 类型
     */
    private String type;

    /**
     * 发布时间
     */
    private Date releasetime;

    private static final long serialVersionUID = 1L;

    public String getCommuniteid() {
        return communiteid;
    }

    public void setCommuniteid(String communiteid) {
        this.communiteid = communiteid;
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
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
        Communite other = (Communite) that;
        return (this.getCommuniteid() == null ? other.getCommuniteid() == null : this.getCommuniteid().equals(other.getCommuniteid()))
            && (this.getBusinessid() == null ? other.getBusinessid() == null : this.getBusinessid().equals(other.getBusinessid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getReleasetime() == null ? other.getReleasetime() == null : this.getReleasetime().equals(other.getReleasetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommuniteid() == null) ? 0 : getCommuniteid().hashCode());
        result = prime * result + ((getBusinessid() == null) ? 0 : getBusinessid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getReleasetime() == null) ? 0 : getReleasetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", communiteid=").append(communiteid);
        sb.append(", businessid=").append(businessid);
        sb.append(", content=").append(content);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", type=").append(type);
        sb.append(", releasetime=").append(releasetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}