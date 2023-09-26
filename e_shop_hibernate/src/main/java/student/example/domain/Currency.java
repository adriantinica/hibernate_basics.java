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

@NoArgsConstructor
@ToString
@Entity(name="currencies")
public class Currency {
    
    
    @Setter                                     //lombok
    @Getter 
    @Id
    @GeneratedValue
    private UUID uuid;


    @Setter                                     //lombok
    @Getter 
    @Column(length = 40)
    private String name;

    @Setter                                     //lombok
    @Getter 
    @Column(length = 4)
    private String charCode;

    @Setter                                     //lombok
    @Getter
    @Column(length = 4) 
    private int numCode;

    @Setter                                     //lombok
    @Getter 
    private double value;

    public Currency(String name, String charCode, int numCode, double value) {
        this.name = name;
        this.charCode = charCode;
        this.numCode = numCode;
        this.value = value;
    }


    
}
