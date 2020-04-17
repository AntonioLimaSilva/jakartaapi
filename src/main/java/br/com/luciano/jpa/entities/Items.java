package br.com.luciano.jpa.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Items {

    private Integer id;
    private Integer orderId;
    private Integer productId;
    private BigDecimal productPrice;
    private Integer quantity;

}
