package application;

import java.util.Scanner;

import controller.Exercicio1;
import controller.Exercicio2;

public class App {
    public static void main(String [] args){
    	int opc = 0;
    	boolean sair = true;
    	
    	do
    	{
    		switch(opc)
    		{
    			case 1:
    				new Exercicio1();
    				opc = 0;
    				break;
    			case 2:
    				new Exercicio2();
    				opc = 0;
    				break;
    			case 3:
    				sair=false;
    				break;
    			default:
    				System.out.println("\nEscolha o Exercicio: ");
    				opc = new Scanner(System.in).nextInt();
    		}
    		
    	}while(sair);
    }
}
