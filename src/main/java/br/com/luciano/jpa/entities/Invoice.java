package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_invoice")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    @OneToOne(mappedBy = "invoice")
    private Order order;
    private String xml;
    @Column(name = "issuance_date")
    private LocalDate issuanceDate;

}
