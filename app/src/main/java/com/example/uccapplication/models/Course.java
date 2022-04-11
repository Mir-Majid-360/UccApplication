package com.example.uccapplication.models;

public class Course {

    String code, name, credits, pre_requisites, description;

    public Course() {
    }

    public Course(String code, String name, String credits, String pre_requisites, String description) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.pre_requisites = pre_requisites;
        this.description = description;
    }

    public Course(String code, String name, String credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getPre_requisites() {
        return pre_requisites;
    }

    public void setPre_requisites(String pre_requisites) {
        this.pre_requisites = pre_requisites;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

