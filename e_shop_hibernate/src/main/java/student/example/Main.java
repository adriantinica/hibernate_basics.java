packagepackage student.example;

import java.util.UUID;
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


    em.getTransaction().begin();
        
    Category smartphoneCat = new Category("smartphones");
    em.persist(smartphoneCat);
    Product product = new Product("Samsung XX", "image.jpg");
    em.persist(product);
    Money cost = new Money(1000, "USD");
    em.persist(cost);
    product.setPrice(cost);
    Currency usdCurr = new Currency("Dolar S.U.A.", "USD", 840, 18.1679);
    em.persist(usdCurr);
    product.setCategory(smartphoneCat);
    
    //READ 
    //Product product  = em.find(Product.class, UUID.fromString("0b15e5b7-ddd0-4501-9192-217a5c164e7d"));
    //System.out.println(product.toString());

    //DELETE
    Product product1  = em.find(Product.class, UUID.fromString("41309d41-f61c-40ed-a11c-3a9c5051371b"));
    em.remove(product1);
    Product product2  = em.find(Product.class, UUID.fromString("bd218dee-5160-4732-bd18-7c10f0e9f42e"));
    em.remove(product2);
    Product product3  = em.find(Product.class, UUID.fromString("f2ced312-9423-43ba-8c54-2a18cbabf4a6"));
    em.remove(product3);
    Product product4  = em.find(Product.class, UUID.fromString("8bad1413-f088-4bdc-8eb5-347fb31114e0"));
    em.remove(product4);
    Product product5  = em.find(Product.class, UUID.fromString("16121f01-a96c-4500-8b8a-7a8ac39df275"));
    em.remove(product5);

    em.getTransaction().commit();



    }
}
