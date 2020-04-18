package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    private BigDecimal total;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
    @OneToMany(mappedBy = "order")
    private List<Item> items;
    @OneToOne(mappedBy = "order")
    private PaymentCard paymentCard;
    @OneToOne(mappedBy = "order")
    private PaymentSlip paymentSlip;
}
