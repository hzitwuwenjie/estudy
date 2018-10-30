package com.bj1804.estudy.entity;

import java.io.Serializable;

/**
 * course_courseware
 * @author 
 */
public class CourseCourseware implements Serializable {
    /**
     * 课程与课件关系表的id
     */
    private Integer courseCoursewareId;

    /**
     * 课程id
     */
    private String courseid;

    /**
     * 课件id
     */
    private String coursewareid;

    private static final long serialVersionUID = 1L;

    public Integer getCourseCoursewareId() {
        return courseCoursewareId;
    }

    public void setCourseCoursewareId(Integer courseCoursewareId) {
        this.courseCoursewareId = courseCoursewareId;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursewareid() {
        return coursewareid;
    }

    public void setCoursewareid(String coursewareid) {
        this.coursewareid = coursewareid;
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
        CourseCourseware other = (CourseCourseware) that;
        return (this.getCourseCoursewareId() == null ? other.getCourseCoursewareId() == null : this.getCourseCoursewareId().equals(other.getCourseCoursewareId()))
            && (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getCoursewareid() == null ? other.getCoursewareid() == null : this.getCoursewareid().equals(other.getCoursewareid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourseCoursewareId() == null) ? 0 : getCourseCoursewareId().hashCode());
        result = prime * result + ((getCourseid() == null) ? 0 : getCourseid().hashCode());
        result = prime * result + ((getCoursewareid() == null) ? 0 : getCoursewareid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseCoursewareId=").append(courseCoursewareId);
        sb.append(", courseid=").append(courseid);
        sb.append(", coursewareid=").append(coursewareid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}