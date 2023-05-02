package com.lokdon.datashield;

import jpa.EncryptedStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Table(name = "config")
@TypeDef(name = "encrypted", typeClass = EncryptedStringType.class)
public class Configuration {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Basic
    private Long id;
    private String k;

    public Configuration(String key, String value) {
        this.k = key;
        this.value = value;
    }
    public Configuration(){

    }
    @Type(type = "encrypted")
    @Column(name = "value", length = 8000)
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getK() {
        return k;
    }

    public void setK(String key) {
        this.k = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
