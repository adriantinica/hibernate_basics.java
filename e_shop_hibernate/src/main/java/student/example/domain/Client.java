package student.example.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Entity(name="clients")
public class Client {


    @Id
    @GeneratedValue
    @Setter
    @Getter
    private UUID id;

    @Setter
    @Getter
    @Column(length = 70)
    private String fullName;

    @Setter
    @Getter
    @Column(length = 160)
    private String profileImage;

    @Setter
    @Getter
    @ElementCollection
    @Column(length = 30)
    private List<String> contactPhone = new ArrayList<>();
     
    @Setter
    @Getter
    @Embedded
    private Adress adress;

    @Setter
    @Getter
    @OneToMany
    private List<Cart> carts = new ArrayList<>();



    public Client(String fullName){
        this.fullName = fullName;
    }

    
}
