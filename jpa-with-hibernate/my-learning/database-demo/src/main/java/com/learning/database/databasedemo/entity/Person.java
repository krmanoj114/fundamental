package com.learning.database.databasedemo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQuery(name="find_all_persons", query="Select p from Person p")
public class Person {

    @Id
    @GeneratedValue
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="location")
    private String location;
    @Column(name="birth_date")
    private Date birthDate;

    public Person(int id, Date birthDate,  String location,  String name) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Person(Date birthDate,  String location,  String name) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
