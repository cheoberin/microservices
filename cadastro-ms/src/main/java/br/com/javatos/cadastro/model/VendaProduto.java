package br.com.javatos.cadastro.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class VendaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private Date dataVenda;

    @NotBlank
    private BigDecimal valorTotal;

    @ManyToMany
    List<Produtos> produtosList;

}
