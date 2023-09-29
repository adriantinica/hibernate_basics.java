 package student.example;

import java.util.UUID;

import org.hibernate.annotations.processing.Find;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import student.example.domain.Adress;
import student.example.domain.Cart;
import student.example.domain.CartItem;
import student.example.domain.CartState;
import student.example.domain.Category;
import student.example.domain.Client;
import student.example.domain.Currency;
import student.example.domain.Money;
import student.example.domain.Product;

public class Main {
    public static void main(String[] args) {
        

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("e-shop-main");
    EntityManager em = emf.createEntityManager();


    em.getTransaction().begin();
   
    Product product = new Product("Iphone 15", "image15.jpg");
    em.persist(product);
    Money cost = new Money(3200, "USD");
    em.persist(cost);
    product.setPrice(cost);
    Currency usdCurr = new Currency("Dolar S.U.A.", "USD", 840, 18.1679);
    em.persist(usdCurr);
    
    //Client client1 = new Client("Marry Jane");
    //client1.getContactPhone().add("123456239");
    //client1.getContactPhone().add("987654565");
    //client1.setAdress(new Adress("New York", "Broadway", "86th"));
    
    Client client  = em.find(Client.class, UUID.fromString("9a18b982-dcbf-4da9-b13c-c915dfd2c5aa"));
    Cart cart = new Cart();
    em.persist(cart);
    CartItem cartItem = new CartItem(product,(short) 2);
    em.persist(cartItem);
    cart.getCartitems().add(cartItem);
    em.persist(cart);
    client.getCarts().add(cart);
    em.persist(client);
    
    //READ 
    //Product product  = em.find(Product.class, UUID.fromString("0b15e5b7-ddd0-4501-9192-217a5c164e7d"));
    //System.out.println(product.toString());
    
    //DELETE

    cart.setState(CartState.COMPLETED);

    
    em.getTransaction().commit();
    cart.getState();
    System.out.println("Cart state: "+ cart.getState());
    



    }
}
    
