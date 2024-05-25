package com.practice.basic.java8;

import java.util.List;
import java.util.function.Predicate;

class Main{
    public static void main(String[] args) {
        var courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 20000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );
        System.out.println("review score > 90");
        Predicate<Course> coursePredicate = course -> course.getReviewScore() > 90;
        System.out.println(courses.stream().anyMatch(coursePredicate));

        System.out.println("Comparator");

    }
}
public class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOdStudents;

    public Course(String name, String category, int reviewScore, int noOdStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOdStudents = noOdStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOdStudents() {
        return noOdStudents;
    }

    public void setNoOdStudents(int noOdStudents) {
        this.noOdStudents = noOdStudents;
    }

    public String toString() {
        return name + ":" + noOdStudents + ":" + reviewScore;
    }
}
