package com.example.demo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {
    private @Id @GeneratedValue Long id;
    @Column(unique=true)
    private String cityName;
    private Integer silver;

    @SuppressWarnings("unused")
    private City() {}

    public City(String cityName, Integer silver)
    {
        this.cityName = cityName;
        this.silver = silver;
    }

    @Override
    public boolean equals(Object o) 
    {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City)o;
        return Objects.equals(cityName, city.cityName)
            && Objects.equals(silver, city.silver);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(id, cityName, silver);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public Integer getSilver()
    {
        return silver;
    }

    public void setSilver(Integer silver)
    {
        this.silver = silver;
    }

    @Override
    public String toString()
    {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + "'" +
                ", silver='" + silver + "'}";
    }
}
