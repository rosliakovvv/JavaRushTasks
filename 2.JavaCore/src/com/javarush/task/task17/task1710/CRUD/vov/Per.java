package com.javarush.task.task17.task1710.CRUD.vov;

import com.javarush.task.task17.task1710.CRUD.right.Person;

import java.util.Date;

public class Per {

    private String name;
    private Sexy sex;
    private Date hb;

    public Per(String name, Sexy sex, Date hb) {
        this.name = name;
        this.sex = sex;
        this.hb = hb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sexy getSex() {
        return sex;
    }

    public void setSex(Sexy sex) {
        this.sex = sex;
    }

    public Date getHb() {
        return hb;
    }

    public void setHb(Date hb) {
        this.hb = hb;
    }

    public static Per createMale(String name, Date hbDay) {
        return new Per(name, Sexy.NO, hbDay);
    }

    public static Per createFemale(String name, Date hbDay) {
        return new Per(name, Sexy.YES, hbDay);
    }
}
