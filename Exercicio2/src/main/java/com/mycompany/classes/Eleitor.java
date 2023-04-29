/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author Felipe Melchior de Britto
 */
public class Eleitor {
    
    
    private String nome;
    private Endereco endereco; 
    private int numeroFilhos;
    private String estadoCivil;
    private String profissaoSetor;
    private double rendaBrutaMensal;
    private int votoPresidente;

    public Eleitor(String nome, Endereco endereco, int numeroFilhos, String estadoCivil, String profissaoSetor, double rendaBrutaMensal, int votoPresidente) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroFilhos = numeroFilhos;
        this.estadoCivil = estadoCivil;
        this.profissaoSetor = profissaoSetor;
        this.rendaBrutaMensal = rendaBrutaMensal;
        this.votoPresidente = votoPresidente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    public void setNumeroFilhos(int numeroFilhos) {
        this.numeroFilhos = numeroFilhos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissaoSetor() {
        return profissaoSetor;
    }

    public void setProfissaoSetor(String profissaoSetor) {
        this.profissaoSetor = profissaoSetor;
    }

    public double getRendaBrutaMensal() {
        return rendaBrutaMensal;
    }

    public void setRendaBrutaMensal(double rendaBrutaMensal) {
        this.rendaBrutaMensal = rendaBrutaMensal;
    }

    public int getVotoPresidente() {
        return votoPresidente;
    }

    public void setVotoPresidente(int votoPresidente) {
        this.votoPresidente = votoPresidente;
    }
    
   
    
}
