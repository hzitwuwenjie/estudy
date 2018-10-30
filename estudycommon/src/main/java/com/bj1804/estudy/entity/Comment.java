package com.bj1804.estudy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * comment
 * @author 
 */
public class Comment implements Serializable {
    /**
     * 评论id
     */
    private String commid;

    /**
     * 评论的员工id
     */
    private String empid;

    /**
     * 课程id
     */
    private String courseid;

    /**
     * 评论时间
     */
    private Date commtime;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 好评度
     */
    private Float favolevel;

    /**
     * 是否屏蔽
     */
    private Boolean ishide;

    private static final long serialVersionUID = 1L;

    public String getCommid() {
        return commid;
    }

    public void setCommid(String commid) {
        this.commid = commid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public Date getCommtime() {
        return commtime;
    }

    public void setCommtime(Date commtime) {
        this.commtime = commtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Float getFavolevel() {
        return favolevel;
    }

    public void setFavolevel(Float favolevel) {
        this.favolevel = favolevel;
    }

    public Boolean getIshide() {
        return ishide;
    }

    public void setIshide(Boolean ishide) {
        this.ishide = ishide;
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
        Comment other = (Comment) that;
        return (this.getCommid() == null ? other.getCommid() == null : this.getCommid().equals(other.getCommid()))
            && (this.getEmpid() == null ? other.getEmpid() == null : this.getEmpid().equals(other.getEmpid()))
            && (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getCommtime() == null ? other.getCommtime() == null : this.getCommtime().equals(other.getCommtime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getFavolevel() == null ? other.getFavolevel() == null : this.getFavolevel().equals(other.getFavolevel()))
            && (this.getIshide() == null ? other.getIshide() == null : this.getIshide().equals(other.getIshide()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommid() == null) ? 0 : getCommid().hashCode());
        result = prime * result + ((getEmpid() == null) ? 0 : getEmpid().hashCode());
        result = prime * result + ((getCourseid() == null) ? 0 : getCourseid().hashCode());
        result = prime * result + ((getCommtime() == null) ? 0 : getCommtime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getFavolevel() == null) ? 0 : getFavolevel().hashCode());
        result = prime * result + ((getIshide() == null) ? 0 : getIshide().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commid=").append(commid);
        sb.append(", empid=").append(empid);
        sb.append(", courseid=").append(courseid);
        sb.append(", commtime=").append(commtime);
        sb.append(", content=").append(content);
        sb.append(", favolevel=").append(favolevel);
        sb.append(", ishide=").append(ishide);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}