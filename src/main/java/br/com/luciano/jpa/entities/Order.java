package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {

    private Long id;
    private LocalDateTime initialDate;
    private LocalDateTime finalDate;
    private Integer invoiceId;
    private BigDecimal total;
    private Status status;

}
