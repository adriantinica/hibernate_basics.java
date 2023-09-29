package student.example.domain;

import java.util.UUID;

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
@Entity(name="cart_items")
public class CartItem {
    
    @Id
    @GeneratedValue
    @Setter
    @Getter
    private UUID uuid;




    @Setter
    @Getter
    private short quantity;

   
    //Associations
     
    @Setter
    @Getter
    @OneToOne
    private Product product;


    public CartItem( Product product, short quantity) {
        this.quantity = quantity;
        this.product = product;
    }
    

    

    
}
