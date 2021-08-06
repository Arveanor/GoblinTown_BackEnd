package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Action {
    @Id @GeneratedValue Long id;
    private String name;
    private String type;

    @SuppressWarnings("unused")
    private Action() {}

    public Action(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action)o;
        return Objects.equals(name, action.name) &&
            Objects.equals(type, action.type);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, type);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString()
    {
        return "Action{" +
        "id=" + id +
        ", name='" + name + "'" +
        ", type='" + type + "'}";
    }
}
