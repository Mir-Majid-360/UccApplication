package com.example.uccapplication.models;

public class Timetable {

    String courseCode, courseTitle, section,credit, days, start,end,room;

    public Timetable() {
    }

    public Timetable(String courseCode, String courseTitle, String section, String credit, String days, String start, String end, String room) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.section = section;
        this.credit = credit;
        this.days = days;
        this.start = start;
        this.end = end;
        this.room = room;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
