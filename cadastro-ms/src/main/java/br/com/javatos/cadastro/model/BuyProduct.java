package br.com.javatos.cadastro.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class BuyProduct implements Serializable {

    @Id
    @ManyToOne
    private Buy buy;

    @Id
    @ManyToOne
    private Product product;

    @NotBlank
    private BigDecimal unitValue;

    @NotBlank
    private long quantity;

    @NotBlank
    private BigDecimal totalValue;

}
