package com.javarush.task.task17.task1714.Comparable.vov;

import com.javarush.task.task17.task1714.Beach;

public class Sol implements Comparable<Sol> {

    private String name;
    private float distance;
    private int quality;

    public Sol(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public static void main(String[] args) {
        Sol beach1 = new Sol("first", 5, 80);
        Sol beach2 = new Sol("second", 3, 100);

        int res = beach1.compareTo(beach2);

        System.out.println(res);
    }

    @Override
    public int compareTo(Sol o) {
        float one = getDistance() - o.getDistance();
        float two = (float) getQuality() - (float) o.getQuality();
        System.out.println(one);
        System.out.println(two);
        System.out.println(one - two);
        return ((one - two) > 0) ? 1 : ((one - two) == 0) ? 0 : -1;
    }
}
