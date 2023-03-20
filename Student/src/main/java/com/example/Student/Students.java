package com.example.Student;

public class Students {
    private String name;
    private int age;
    private int rollno;
    private String mobileNo;

    public Students(String name, int age, int rollno, String mobileNo) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
