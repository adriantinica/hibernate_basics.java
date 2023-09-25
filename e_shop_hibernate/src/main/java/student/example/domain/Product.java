package student.example.domain;

import java.util.UUID;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue()
    UUID id;


    @Column(length = 100, name =" full_name ")
    String name;

    
    public Product() {
    }


    public Product(UUID id, String name) {
        this.id = id;
        this.name = name;
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }

    
    
    
}
