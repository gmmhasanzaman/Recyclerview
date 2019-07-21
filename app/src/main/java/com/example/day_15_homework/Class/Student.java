package com.example.day_15_homework.Class;

public class Student {

    private String seId;
    private String name;
    private String phone;

    public Student(String seId, String name, String phone) {
        this.seId = seId;
        this.name = name;
        this.phone = phone;
    }

    public String getSeId() {
        return seId;
    }

    public void setSeId(String seId) {
        this.seId = seId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
