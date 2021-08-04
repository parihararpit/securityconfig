package com.todo.practice.Entity;

import javax.persistence.*;

@Entity
@Table(name="User_Security")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String Password;

    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        Password = password;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
