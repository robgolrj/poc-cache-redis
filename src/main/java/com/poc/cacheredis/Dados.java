package com.poc.cacheredis;

import java.io.Serializable;

public class Dados implements Serializable {

    private static final long serialVersionUID = 1225221326902530580L;

    private String nome;
    private String idade;
    private String numeroReferencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }
}
