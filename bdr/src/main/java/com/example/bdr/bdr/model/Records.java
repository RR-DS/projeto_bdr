package com.example.bdr.bdr.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(unique = true)
    private Date data;
    private int velocidade;
    private String placa;
    private String classeDoVeiculo;
}
