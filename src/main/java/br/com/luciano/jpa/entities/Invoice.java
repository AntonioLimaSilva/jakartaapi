package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_invoice")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Invoice {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    @Column(name = "order_id")
    private Integer orderId;
    private String xml;
    @Column(name = "issuance_date")
    private LocalDate issuanceDate;

}
