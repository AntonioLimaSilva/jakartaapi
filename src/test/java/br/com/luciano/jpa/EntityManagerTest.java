package br.com.luciano.jpa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerTest {

    private static EntityManagerFactory factory;

    protected EntityManager manager;

    @BeforeClass
    public static void setUpBeforeClass() {
        factory = Persistence.createEntityManagerFactory("Ecommerce-PU");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        factory.close();
    }

    @Before
    public void setUp() {
        this.manager = factory.createEntityManager();
    }

    @After
    public void tearDown() {
        this.manager.close();
    }
}
