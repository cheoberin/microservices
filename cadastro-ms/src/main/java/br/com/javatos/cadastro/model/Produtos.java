package br.com.javatos.cadastro.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String codigoProduto;

    @NotBlank
    private String unidadeMedida;

    @NotBlank
    private double valorUnitario;

    @NotBlank
    @ManyToOne
    private Marca marca;

    @NotBlank
    @ManyToOne
    private Categoria categoria;

}
