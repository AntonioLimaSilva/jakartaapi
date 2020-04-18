package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_payment_card")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PaymentCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    private String number;

}
