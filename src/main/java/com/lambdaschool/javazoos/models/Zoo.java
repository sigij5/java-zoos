package com.lambdaschool.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The entity allowing interaction with the users table
 */
@Entity
@Table(name = "zoos")
public class Zoo extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    @Column(nullable = false,
            unique = true)
    private String zooname;

    @OneToMany(mappedBy = "zoo",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo")
    private List<Zootelephone> zootelephones = new ArrayList<>();

    @OneToMany(mappedBy = "zoo",
         cascade = CascadeType.ALL,
         orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo")
    private Set<ZooAnimals> animals = new HashSet<>();

    public Zoo()
    {
    }

    public Zoo(
            String zooname)
    {
        setZooname(zooname);
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public List<Zootelephone> getZootelephones() {
        return zootelephones;
    }

    public void setZootelephones(List<Zootelephone> zootelephones) {
        this.zootelephones = zootelephones;
    }

    public Set<ZooAnimals> getAnimals()
    {
        return animals;
    }

    public void setAnimals(Set<ZooAnimals> animals)
    {
        this.animals = animals;
    }
}
