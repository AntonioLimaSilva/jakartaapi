package br.com.luciano.jpa.queries;

import br.com.luciano.jpa.EntityManagerTest;
import br.com.luciano.jpa.entities.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductSearchTest extends EntityManagerTest {

    @Test
    public void shouldSearchProductById() {
        Product product = manager.find(Product.class, 1);

        Assert.assertNotNull(product.getId());
    }

}
