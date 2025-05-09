package br.com.etechas.study.entity.TesteRelacionamento;

import jakarta.persistence.*;

@Entity
@Table (name ="telefone")
public class Telefone {
    @Id
    private int id;
    private String numero;
    private String ddd;

    @OneToOne
    @JoinColumn(name = "id_proprietario")
    private Proprietario proprietario;
}
