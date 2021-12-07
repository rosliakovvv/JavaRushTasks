package com.javarush.task.task35.task3505.for_java_rush.right;

public class ConvertableUser implements Convertable<Integer> {
    private Integer id;
    private String name;

    public ConvertableUser(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Integer getKey() {
        return id;
    }

    @Override
    public String toString() {
        return "ConvertableUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
