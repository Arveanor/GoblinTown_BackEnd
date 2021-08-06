package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order {
    private @Id @GeneratedValue Long id;
    private Integer day;
    @ManyToOne
    @JoinColumn(name = "CITY_ID", referencedColumnName = "ID")
    private City city;
    @ManyToOne
    @JoinColumn(name = "ACTION_ID", referencedColumnName = "ID")
    private Action action;

    @SuppressWarnings("unused")
    private Order() {}

    public Order(Integer day, City city, Action action)
    {
        this.day = day;
        this.city = city;
        this.action = action;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Order orders = (Order)o;
        return Objects.equals(day, orders.day) && 
            Objects.equals(city, orders.city) &&
            Objects.equals(action, orders.action);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, day, city, action);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Integer getDay()
    {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Action getAction()
    {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString()
    {
        return "Order{" +
        "id=" + id +
        ", day='" + day + "'" +
        ", city='" + city.getId() + "'" +
        ", action='" + action.getId() + "'}";
    }


}
