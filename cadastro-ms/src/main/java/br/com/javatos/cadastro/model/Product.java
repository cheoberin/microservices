package br.com.javatos.cadastro.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String description;

    @NotBlank
    private String productCod;

    @NotBlank
    private String measureUnit;

    @NotBlank
    private double unitValue;

    @NotBlank
    @ManyToOne
    private Brand brand;

    @NotBlank
    @ManyToOne
    private Category category;

}
