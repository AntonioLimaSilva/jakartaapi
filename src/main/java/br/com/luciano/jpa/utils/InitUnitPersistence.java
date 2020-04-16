package br.com.luciano.jpa.utils;

import br.com.luciano.jpa.entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InitUnitPersistence {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Ecommerce-PU");
        EntityManager entityManager = factory.createEntityManager();

        Product product = entityManager.find(Product.class, 1);

        System.out.println("Name: " + product.getName());

        factory.close();
        entityManager.close();

    }

}
