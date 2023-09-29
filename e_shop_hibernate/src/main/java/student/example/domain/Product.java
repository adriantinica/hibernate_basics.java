package student.example.domain;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Base64;
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
    private UUID id ;


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
    @ManyToOne
    private Category category;
    
    @Setter                                     
    @OneToOne
    private Money price;

    
    public Product(String name, String image) {
        //this.id =UUID.randomUUID();
        this.name = name;
        this.image = image;
        //this.id = UUID.randomUUID();

        // TWO FAILD ATEMPTS TO REDUCE UUID length
        
        //String uuid = String.format("%040d", Long.parseLong(id.toString().replace("-", "").replaceAll("[^0-9a-fA-F]", ""), 16));
        //String uuid16digits = uuid.substring(uuid.length() -16 );
        //this.id = UUID.fromString(uuid16digits);

        //String uuid = String.format("%040d", new BigInteger(id.toString().replace("-", ""), 16));
        //String uuid16digits = uuid.substring(uuid.length() - 16);
        //this.id = UUID.fromString(uuid16digits);
    }


