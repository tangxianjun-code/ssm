package com.zking.model;

public class Class {
    private Long classId;

    private String className;

    private Long classParentId;

    public Class(Long classId, String className, Long classParentId) {
        this.classId = classId;
        this.className = className;
        this.classParentId = classParentId;
    }

    public Class() {
        super();
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Long getClassParentId() {
        return classParentId;
    }

    public void setClassParentId(Long classParentId) {
        this.classParentId = classParentId;
    }
}