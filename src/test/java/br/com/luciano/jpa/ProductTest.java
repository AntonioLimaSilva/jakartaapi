package br.com.luciano.jpa;

import br.com.luciano.jpa.entities.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest extends EntityManagerTest {

    @Test
    public void shouldSearchProductById() {
        Product product = manager.find(Product.class, 1);

        Assert.assertNotNull(product);
    }

}
