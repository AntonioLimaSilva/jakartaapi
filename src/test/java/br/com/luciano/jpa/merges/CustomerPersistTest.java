package br.com.luciano.jpa.merges;

import br.com.luciano.jpa.EntityManagerTest;
import br.com.luciano.jpa.entities.Customer;
import br.com.luciano.jpa.entities.Gender;
import org.junit.Assert;
import org.junit.Test;

public class CustomerPersistTest extends EntityManagerTest {

    @Test
    public void shouldPersistAndSearchCustomerById() {

        Customer customer = new Customer();
        customer.setName("Maria de Souza");
        customer.setGender(Gender.FEMALE);

        this.manager.getTransaction().begin();
        customer = this.manager.merge(customer);
        this.manager.getTransaction().commit();

        this.manager.clear();

        Customer customerVerify = this.manager.find(Customer.class, customer.getId());

        Assert.assertEquals(customer.getId(), customerVerify.getId());

    }

    @Test
    public void shouldUpdateAndSearchCustomerById() {
        Customer customer = this.manager.find(Customer.class, 2);

        customer.setName("Maria de Medeiros");

        this.manager.getTransaction().begin();
        this.manager.merge(customer);
        this.manager.getTransaction().commit();

        this.manager.clear();

        Customer customerVerify = this.manager.find(Customer.class, 2);

        Assert.assertEquals(customer.getName(), customerVerify.getName());
    }

}
