/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Entrevista {
    
    private List<Eleitor> eleitores;
    private int qtdEntrevistados;
    
    public Entrevista(List<Eleitor> eleitores) {
        this.eleitores = eleitores;
        this.qtdEntrevistados = eleitores.size();
    }
    
    public List<Eleitor> filtrarEntrevistados(String estadoCivil, double rendaMensalBrutaMaxima){
        
        List<Eleitor> eleitoresFiltrados = new ArrayList<Eleitor>();
        
        for(Eleitor el : this.eleitores){
            if(el.getRendaBrutaMensal() <= rendaMensalBrutaMaxima && el.getEstadoCivil().equals(estadoCivil) && el.getNumeroFilhos() > 0){
                eleitoresFiltrados.add(el);
            }
        }
        
        return eleitoresFiltrados;
    }
    
    

    public List<Eleitor> getEleitores() {
        return eleitores;
    }

    public void setEleitores(List<Eleitor> eleitores) {
        this.eleitores = eleitores;
    }

    public int getQtdEntrevistados() {
        return qtdEntrevistados;
    }
        
}
