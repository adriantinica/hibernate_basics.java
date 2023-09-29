package student.example.domain;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Entity(name="carts")
public class Cart {
    
    
    @Id
    @GeneratedValue
    @Setter
    @Getter
    private UUID id;



    // state: active, canceled, completed..
    //add the state field using enum;
    // set active by default
   
    //Associations
     
    

    @Setter
    @Getter
    @OneToOne
    private Money totalCost;

    @Setter
    @Getter
    @OneToMany
    private List<CartItem> cartitems = new ArrayList <>();

   
    @Getter
    @Enumerated(EnumType.STRING) // Specify the storage type of the enum
    private CartState state = CartState.ACTIVE;


    public void setState(CartState state) {
        this.state = state;
    }

    

}


