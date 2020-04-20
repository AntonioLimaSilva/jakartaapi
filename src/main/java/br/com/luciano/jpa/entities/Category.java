package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Auto relacionamento na mesma tabela
 */
@Entity
@Table(name = "tbl_category")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    private String name;
    @ManyToOne //owner da relação
    @JoinColumn(name = "root_category_id")
    private Category rootCategory;
    @OneToMany(mappedBy = "rootCategory") // not owner da relacao
    private List<Category> categories;
}
