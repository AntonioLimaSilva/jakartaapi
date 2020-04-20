package br.com.luciano.jpa.merges;

import br.com.luciano.jpa.EntityManagerTest;
import br.com.luciano.jpa.entities.Category;
import org.junit.Assert;
import org.junit.Test;

public class CategoryPersistTest extends EntityManagerTest {

    @Test
    public void shouldPersistCategoryRoot() {

        Category categoryRoot = new Category();
        categoryRoot.setName("Eletrônicos");

        Category category = new Category();
        category.setName("Celulares");
        category.setRootCategory(categoryRoot);

        this.manager.getTransaction().begin();
        this.manager.persist(categoryRoot);
        this.manager.persist(category);
        this.manager.getTransaction().commit();

        this.manager.clear();

        Category categoryChildVerify = this.manager.find(Category.class, 2);

        Assert.assertNotNull(categoryChildVerify.getRootCategory());

    }

}
