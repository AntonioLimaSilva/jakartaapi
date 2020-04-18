package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_payment_slip")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PaymentSlip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    @Column(name = "payment_status")
    private PaymentStatus status;
    @Column(name = "bar_code")
    private String barCode;

}
