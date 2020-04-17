package br.com.luciano.jpa.merges;

import br.com.luciano.jpa.EntityManagerTest;
import br.com.luciano.jpa.entities.Product;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ProductPersistTest extends EntityManagerTest {

    @Test
    public void shouldPersistProductAndSearchById() {
        Product product = new Product();
        product.setName("MI FIT");
        product.setDescription("Relório de pulso");
        product.setPrice(new BigDecimal("122.0"));

        manager.getTransaction().begin();
        manager.persist(product);
        manager.getTransaction().commit();

        // Limpa a memória do entity manager para poder buscar registro na base e poder testar
        manager.clear();

        Product productSave = manager.find(Product.class, 2);

        Assert.assertNotNull(productSave);
    }

}
