package com.example.abhinav.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "UserTable")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    @NotNull
    private String name;

    @Column(name = "Course")
    @NotNull
    private String course;

    public User(String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
