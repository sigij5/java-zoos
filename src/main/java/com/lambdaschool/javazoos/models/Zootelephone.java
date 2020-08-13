package com.lambdaschool.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * The entity allowing interaction with the useremails table
 */
@Entity
@Table(name = "telephones")
public class Zootelephone extends Auditable
{
    /**
     * The primary key (long) of the useremails table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    /**
     * Email (String) for this zoo. Cannot be nullable.
     * Must be in the format userid@domain.upperLevelDomain
     */
    private String phonetype;

    private String phonenumber;

    /**
     * The userid of the zoo assigned to this email is what is stored in the database.
     * This is the entire zoo object!
     * <p>
     * Forms a Many to One relationship between useremails and users.
     * A zoo can have many emails.
     */
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "zootelephones",
            allowSetters = true)
    private Zoo zoo;


    public Zootelephone() {
    }

    public Zootelephone(String phonetype, String phonenumber, Zoo zoo) {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
        this.zoo = zoo;
    }

    public long getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(long phoneid) {
        this.phoneid = phoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
