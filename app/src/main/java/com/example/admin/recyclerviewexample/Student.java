package com.example.admin.recyclerviewexample;

/**
 * Created by admin on 12/4/2019.
 */

public class Student {

    private String Sno,Name,Subject;

    public Student(String sno, String name, String subject) {
        Sno = sno;
        Name = name;
        Subject = subject;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
