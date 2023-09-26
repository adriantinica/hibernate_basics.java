package student.example.domain;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Entity(name = "products")
public class Product {

    @Setter                                     //lombok
    @Getter                                     //lombok
    @Id                                         // hibernate
    @GeneratedValue()                           // hibernate
    private UUID id;


    @Setter                                     //lombok
    @Getter                                     //lombok
    @Column(length = 50, name =" full_name ")   // hibernate
    private String name;

    @Setter                                     //lombok
    @Getter 
    @Column(length = 160)
    private String image;

    @Setter                                     //lombok
    @Getter 
    private Money price;


    //Association (with hibernate)
    @ManyToOne
    private Category category;
    @OneToOne
    private Money money;

    
    public Product(String name, String image, Money price) {
        this.name = name;
        this.image = image;
        this.price = new Money(0, image);
    }

    
    
    
}

