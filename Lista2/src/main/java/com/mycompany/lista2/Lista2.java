/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista2;

import com.mycompany.classes.Endereco;
import com.mycompany.classes.Eleitor;
import com.mycompany.classes.Entrevista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Lista2 {

    public static void main(String[] args) {
        
        Endereco endereco1 = new Endereco(13, "Tchurusbango Tchurusbago", "Inexistente", "Pintópolis", "BA", "66666-666" );
        Endereco endereco2 = new Endereco(17, "Rua 1", "Limoeiro", "Gotham City", "SP", "12345-666" );
        Endereco endereco3 = new Endereco(22, "Rua 2", "Turma do Bairro", "Piracaia", "MS", "54321-666" );
        Endereco endereco4 = new Endereco(12, "Avenida Brasiç", "Barro", "Volta Redonda", "RS", "67890-666" );
        Endereco endereco5 = new Endereco(15, "Olavo de Carvalho", "Casa do Caralho", "Coruscant", "AC", "09876-666" );
        
        Eleitor eleitor1 = new Eleitor("Eleitor da Silva de Azevedo", endereco1, 39, "S", "Pub", 50000.00, 13);
        Eleitor eleitor2 = new Eleitor("Um Dois Três de Oliveira Quatro", endereco2, 0, "C", "Inf", 30.00, 45);
        Eleitor eleitor3 = new Eleitor("TospericaGergia Santos", endereco3, 1, "C", "Pub", 50000.00, 15);
        Eleitor eleitor4 = new Eleitor("Elon da Silva Musk Barbosa", endereco4, 0, "S", "Pri", 50000.00, 0);
        Eleitor eleitor5 = new Eleitor("Vladimir Costa de Barros Putin", endereco5, 2, "C", "Aut", 100.00, 66);
        
        List<Eleitor> listaDosEntrevistados = new ArrayList<Eleitor>();
        listaDosEntrevistados.add(eleitor1);
        listaDosEntrevistados.add(eleitor2);
        listaDosEntrevistados.add(eleitor3);
        listaDosEntrevistados.add(eleitor4);
        listaDosEntrevistados.add(eleitor5);
        
        Entrevista entrevista = new Entrevista(listaDosEntrevistados, 5);
        
        System.out.println("O número total de entrevistados é: " + entrevista.getQtdEntrevistados());
        System.out.println("Para cada candidato a intenção de voto é:");
        for(Eleitor el : entrevista.getEleitores()){
            System.out.println(el.getNome() + ":" + el.getVotoPresidente());
        }
        List<Eleitor> eleitoresFiltrados = entrevista.filtrarEntrevistados("C", 200.00);
        
        System.out.println("ELEITORES FILTRADOS:");
        for(Eleitor el : eleitoresFiltrados){
            System.out.println(el.getNome() + ":" + el.getVotoPresidente());
        }
        
        
        
    }
}
