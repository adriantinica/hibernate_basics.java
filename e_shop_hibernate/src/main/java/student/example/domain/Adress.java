package student.example.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Embeddable
public class Adress {


    @Setter
    @Getter
    @Column(length = 60)
    private String country;
    

    @Setter
    @Getter
    @Column(length = 60)
    private String city;

    @Setter
    @Getter
    @Column(length = 100)
    private String street;

    @Setter
    @Getter
    @Column(length = 10)
    private String strNumber;

    public Adress(String city, String street, String strNumber) {
        this.city = city;
        this.street = street;
        this.strNumber = strNumber;
    }

    



}

