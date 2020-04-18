package br.com.luciano.jpa.merges;

import br.com.luciano.jpa.EntityManagerTest;
import br.com.luciano.jpa.entities.Customer;
import br.com.luciano.jpa.entities.Gender;
import org.junit.Test;

public class CustomerPersistTest extends EntityManagerTest {

    @Test
    public void shouldPersistAndSearchCustomer() {

        Customer customer = new Customer();
        customer.setName("Maria de Souza");
        customer.setGender(Gender.FEMALE);

        this.manager.getTransaction().begin();
        this.manager.persist(customer);
        this.manager.getTransaction().commit();

    }

}
