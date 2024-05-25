package com.practice.basic.sorting;

import org.jetbrains.annotations.NotNull;

public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player() {
    }

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
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

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(@NotNull Player o) {
        /*if (this.ranking == o.ranking) {
            return 0;
        } else if (this.ranking > o.ranking) {
            return 1;
        } else{
            return -1;
        }*/
        return Integer.compare(getRanking(),o.getRanking());
    }
}
