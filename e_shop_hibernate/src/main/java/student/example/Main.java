package student.example;





import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import student.example.domain.Category;
import student.example.domain.Currency;
import student.example.domain.Money;
import student.example.domain.Product;

public class Main {
    public static void main(String[] args) {
        

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("e-shop-main");
    EntityManager em = emf.createEntityManager();
    Category smartphoneCat = new Category("smartphones");
    Product product = new Product("Samsung XXII", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages",new Money(1000, "EUR"));
    Currency eurCurr = new Currency("euro", "EUR", 978, 19.3622);
    
    //CRUD

    //CREATE

    em.getTransaction().begin();

    em.persist(product);
    em.persist(smartphoneCat);
    em.persist(eurCurr);

    em.getTransaction().commit();






    
    
    
    
    
    //READ 
    //Product product  = em.find(Product.class, UUID.fromString("0b15e5b7-ddd0-4501-9192-217a5c164e7d"));
    //System.out.println(product.toString());
 



    }
}
