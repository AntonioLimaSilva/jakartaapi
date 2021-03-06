package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_storage")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private Integer quantity;

}
