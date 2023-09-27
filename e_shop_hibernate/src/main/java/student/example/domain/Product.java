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

    @Setter                                    
    @Getter                                     
    @Id                                         
    @GeneratedValue()                           
    private UUID id;


    @Setter                                     
    @Getter                                    
    @Column(length = 50, name =" full_name ")  
    private String name;

    @Setter                                     
    @Getter 
    @Column(length = 160)
    private String image;

   


    //Association (with hibernate)
    @Setter                                     
    @Getter 
    @ManyToOne
    private Category category;
    
    @Setter                                     
    @Getter
    @OneToOne
    private Money price;

    
    public Product(String name, String image) {
        this.name = name;
        this.image = image;
    }

    
    
    
}


