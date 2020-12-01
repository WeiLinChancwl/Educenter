package net.william.educenter.entity;

public class IfTakeCourse {
    private Integer ifTakeId;

    private String ifTakeCourse;

    private String ifInputGrade;

    public Integer getIfTakeId() {
        return ifTakeId;
    }

    public void setIfTakeId(Integer ifTakeId) {
        this.ifTakeId = ifTakeId;
    }

    public String getIfTakeCourse() {
        return ifTakeCourse;
    }

    public void setIfTakeCourse(String ifTakeCourse) {
        this.ifTakeCourse = ifTakeCourse == null ? null : ifTakeCourse.trim();
    }

    public String getIfInputGrade() {
        return ifInputGrade;
    }

    public void setIfInputGrade(String ifInputGrade) {
        this.ifInputGrade = ifInputGrade == null ? null : ifInputGrade.trim();
    }
}