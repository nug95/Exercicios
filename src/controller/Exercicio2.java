package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Aluno;

public class Exercicio2 {

    ArrayList<Aluno> _aluno;

    public Exercicio2(){
        _aluno = new ArrayList();

        System.out.printf("\n\t Exercicio 2 \n");
        adicionaAluno();
        mostraAluno();
    }
    

    public void adicionaAluno(){
    	
        System.out.println("Introduza o nome do aluno: ");
        String al_nome = new Scanner(System.in).nextLine();
        System.out.println("Introduza a nota do aluno: ");
        int al_nota = new Scanner(System.in).nextInt();
        System.out.println("Introduza o contacto do aluno: ");
        String al_contacto = new Scanner(System.in).nextLine();
        
        
    	Aluno al = new Aluno(al_nome, al_nota, al_contacto);
    	_aluno.add(al);
    }

    public void mostraAluno(){
        for(int i=0; i<_aluno.size(); i++){
            System.out.println((Aluno)_aluno.get(i));
        }
    }
}
