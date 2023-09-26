package student.example.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Entity(name="money")
public class Money {

    @Setter                                     //lombok
    @Getter                                     //lombok
    @Id                                         // hibernate
    @GeneratedValue()                           // hibernate
    private UUID id;

    @Setter                                     //lombok
    @Getter 
    private int amount;

    @Setter                                     //lombok
    @Getter 
    @Column(length = 4)
    private String charcode;
    
    public Money (int amount, String charcode){
        this.amount = amount;
        this.charcode = charcode;
    }

}
