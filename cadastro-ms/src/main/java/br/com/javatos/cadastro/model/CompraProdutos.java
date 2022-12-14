package br.com.javatos.cadastro.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class CompraProdutos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private Date dataCompra;

    @ManyToMany
    List<Produtos> produtosList;

}
