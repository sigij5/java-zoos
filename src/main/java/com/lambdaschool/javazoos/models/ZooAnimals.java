package com.lambdaschool.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooAnimalsId.class)
public class ZooAnimals extends Auditable implements Serializable
{
    @Id
    @ManyToOne
    @JsonIgnoreProperties(value = "animals")
    @JoinColumn(name = "zooid")
    private Zoo zoo;

    @Id
    @ManyToOne
    @JsonIgnoreProperties(value = "zoos")
    @JoinColumn(name = "animalid")
    private Animal animal;

    public ZooAnimals() {
    }

    public ZooAnimals(Zoo zoo,
                      Animal animal) {
        this.zoo = zoo;
        this.animal = animal;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // two objects are equal
        // this.userid = that.userid &&
        // this.roleid = that.roleid

        ZooAnimals that = (ZooAnimals) o;
        return ((this.zoo == null) ? 0 : this.getZoo().getZooid()) == ((that.zoo == null) ? 0 : that.getZoo().getZooid()) &&
               ((this.animal == null) ? 0 : this.getAnimal().getAnimalid()) == ((that.animal == null) ? 0 : that.getAnimal().getAnimalid());
    }

    @Override
    public int hashCode() {
        // return Objects.hash(zoo, animal);
        return 37;
    }
}
