package com.example.SoccerGame.models;

import jakarta.persistence.*;

@Entity
@Table(name = "jogador")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jogadorId;

    private String nome;

    private String email;

    @ManyToOne
    @JoinColumn(name = "estatisticaId")
    private Estatisticas estatisticas;

    public Jogador() {}

    public Jogador(String nome, String email, Estatisticas estatisticas) {
        this.nome = nome;
        this.email = email;
        this.estatisticas = estatisticas;
    }

    public Long getJogadorId() {
        return jogadorId;
    }

    public void setJogadorId(Long jogadorId) {
        this.jogadorId = jogadorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Estatisticas getEstatisticas() {
        return estatisticas;
    }

    public void setEstatisticas(Estatisticas estatisticas) {
        this.estatisticas = estatisticas;
    }
}
