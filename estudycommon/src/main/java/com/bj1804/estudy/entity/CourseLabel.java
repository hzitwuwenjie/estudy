package com.bj1804.estudy.entity;

import java.io.Serializable;

/**
 * course_label
 * @author 
 */
public class CourseLabel implements Serializable {
    /**
     * 课程和标签关系id
     */
    private Integer courlabelid;

    /**
     * 课程/课件id 
     */
    private String courseorwareid;

    /**
     * 标签id
     */
    private String labelid;

    private static final long serialVersionUID = 1L;

    public Integer getCourlabelid() {
        return courlabelid;
    }

    public void setCourlabelid(Integer courlabelid) {
        this.courlabelid = courlabelid;
    }

    public String getCourseorwareid() {
        return courseorwareid;
    }

    public void setCourseorwareid(String courseorwareid) {
        this.courseorwareid = courseorwareid;
    }

    public String getLabelid() {
        return labelid;
    }

    public void setLabelid(String labelid) {
        this.labelid = labelid;
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
        CourseLabel other = (CourseLabel) that;
        return (this.getCourlabelid() == null ? other.getCourlabelid() == null : this.getCourlabelid().equals(other.getCourlabelid()))
            && (this.getCourseorwareid() == null ? other.getCourseorwareid() == null : this.getCourseorwareid().equals(other.getCourseorwareid()))
            && (this.getLabelid() == null ? other.getLabelid() == null : this.getLabelid().equals(other.getLabelid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourlabelid() == null) ? 0 : getCourlabelid().hashCode());
        result = prime * result + ((getCourseorwareid() == null) ? 0 : getCourseorwareid().hashCode());
        result = prime * result + ((getLabelid() == null) ? 0 : getLabelid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courlabelid=").append(courlabelid);
        sb.append(", courseorwareid=").append(courseorwareid);
        sb.append(", labelid=").append(labelid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}