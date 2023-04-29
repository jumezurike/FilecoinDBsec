package com.lokdon.datashield;

import jpa.EncryptedStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "config")
@TypeDef(name = "encrypted", typeClass = EncryptedStringType.class)
public class Config {
    @Id
    @GeneratedValue
    private Long id;
    private String k;

    public Config(String key, String value) {
        this.k = key;
        this.value = value;
    }
    public Config(){

    }
    @Type(type = "encrypted")
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
