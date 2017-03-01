package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Valores {

    ArrayList _ex1;

    public Valores(){
        _ex1 = new ArrayList();

        System.out.printf("\n\t Exercicio 1.1 \n");
        adicionaValor();
        mostraValores();
        System.out.printf("\n\t Exercicio 1.2 \n");
        inserirValor();
        mostraValores();
    }

    public void adicionaValor(){
        _ex1.add('c');
        _ex1.add(3);
        _ex1.add("Carruagens");
        _ex1.add(8.56);
        _ex1.add("Caixas de Armazenamento");
    }

    public void mostraValores(){
        for(int i=0; i<_ex1.size(); i++){
            System.out.println(_ex1.get(i));
        }
    }

    public void inserirValor(){
        System.out.println("Introduza um valor: ");
        int v = new Scanner(System.in).nextInt();
        _ex1.add(v);
    }
}
