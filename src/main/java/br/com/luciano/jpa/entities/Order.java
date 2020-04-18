package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_order")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    @Column(name = "initial_date")
    private LocalDateTime initialDate;
    @Column(name = "final_date")
    private LocalDateTime finalDate;
    @Column(name = "invoice_id")
    private Integer invoiceId;
    private BigDecimal total;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
