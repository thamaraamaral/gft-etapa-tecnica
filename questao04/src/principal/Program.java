package principal;

import java.util.Random;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
    	
        Random geradorAleatorios = new Random();

        Integer numeroAleatorio = geradorAleatorios.nextInt(11);
         
        System.out.print("Digite um n�mero entre 0 e 10: ");
        Integer numero = scanner.nextInt();
        
       while (numero != numeroAleatorio) {
        	System.out.println("Digite outro n�mero entre 0 e 10: ");
        	numero = scanner.nextInt();               
       }
       System.out.println("Voc� adivinhou!");
       
       scanner.close();
    }
  }
