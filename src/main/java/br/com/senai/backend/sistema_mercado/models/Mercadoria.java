package br.com.senai.backend.sistema_mercado.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mercadoria")
public class Mercadoria {
  
  @Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private Integer id;

@Column(name="preço")
private double preço;

@Column(name="quantidade")
private  int  quantidade;

@Column(name="nome")
private  int  nome;

@Column(name="categoria")
private  int  caegoria;

    public Mercadoria() {
    }

    public Mercadoria(int caegoria, Integer id, int nome, double preço, int quantidade) {
        this.caegoria = caegoria;
        this.id = id;
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getCaegoria() {
        return caegoria;
    }

    public void setCaegoria(int caegoria) {
        this.caegoria = caegoria;
    }









}
