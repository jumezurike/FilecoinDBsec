package examples;

import jpa.EncryptedStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import providers.Encrypted;

import javax.persistence.*;

@Entity
@Table(name = "demo")
@TypeDef(name = "encrypted", typeClass = EncryptedStringType.class)
public class Demo {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Type(type = "encrypted")
    private String email;

    // getter setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
