package com.bj1804.estudy.entity;

import java.io.Serializable;

/**
 * course_homeword
 * @author 
 */
public class CourseHomeword implements Serializable {
    /**
     * 作业和课程的关系表id
     */
    private Integer courseHomeworkId;

    /**
     * 课程id
     */
    private String courseid;

    /**
     * 作业id
     */
    private String homeworkid;

    private static final long serialVersionUID = 1L;

    public Integer getCourseHomeworkId() {
        return courseHomeworkId;
    }

    public void setCourseHomeworkId(Integer courseHomeworkId) {
        this.courseHomeworkId = courseHomeworkId;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(String homeworkid) {
        this.homeworkid = homeworkid;
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
        CourseHomeword other = (CourseHomeword) that;
        return (this.getCourseHomeworkId() == null ? other.getCourseHomeworkId() == null : this.getCourseHomeworkId().equals(other.getCourseHomeworkId()))
            && (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getHomeworkid() == null ? other.getHomeworkid() == null : this.getHomeworkid().equals(other.getHomeworkid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourseHomeworkId() == null) ? 0 : getCourseHomeworkId().hashCode());
        result = prime * result + ((getCourseid() == null) ? 0 : getCourseid().hashCode());
        result = prime * result + ((getHomeworkid() == null) ? 0 : getHomeworkid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseHomeworkId=").append(courseHomeworkId);
        sb.append(", courseid=").append(courseid);
        sb.append(", homeworkid=").append(homeworkid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}