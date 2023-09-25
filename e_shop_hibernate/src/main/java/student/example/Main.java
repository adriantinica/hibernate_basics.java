package student.example;





import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import student.example.domain.Product;

public class Main {
    public static void main(String[] args) {
        

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("e-shop-main");
    EntityManager em = emf.createEntityManager();
    //Session session = em.

    Product product1  = new Product();
    product1.setName("First Product 1");

    
    
    
    //CRUD

    //CREATE
    em.getTransaction().begin();
    em.persist(product1);
    em.getTransaction().commit();


    //READ 

    Product product  = em.find(Product.class, UUID.fromString("0b15e5b7-ddd0-4501-9192-217a5c164e7d"));
    
    System.out.println(product.toString());

    // UPDATE
     
    em.getTransaction().begin();
    product1.setName("Product 999");
    em.getTransaction().commit();

    //DELETE
    //em.getTransaction().begin();
    //Product product2  = em.find(Product.class, UUID.fromString("eb980ff6-329e-4b8a-a07d-6cc7b7e335a0"));
    //em.remove(product2);
    //em.getTransaction().commit();


    }
}
