package com.example.first;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Subject {
    private int id;
    private String sname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                '}';
    }

    void study(){
        System.out.println("studying");
    }
}
