package com.javarush.task.task17.task1711.CRUD2.vov;

import java.util.Date;

public class Pers {

    private String name;
    private Sexy sex;
    private Date hbDay;

    public Pers(String name, Sexy sex, Date hbDay) {
        this.name = name;
        this.sex = sex;
        this.hbDay = hbDay;
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

    public Date getHbDay() {
        return hbDay;
    }

    public void setHbDay(Date hbDay) {
        this.hbDay = hbDay;
    }

    public static Pers crMale(String name, Date hbDay) {
        return new Pers(name, Sexy.No, hbDay);
    }

    public static Pers crFemale(String name, Date hbDay) {
        return new Pers(name, Sexy.Yes, hbDay);
    }
}
