
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jose.5989
 */
public class Ex_1 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        String opcaoEscolha;
        int num1, num2, resultado;
        System.out.println("------------------------------------------");
        System.out.println("Calculadora de SOMA");
        System.out.println("------------------------------------------");
        System.out.println("Informe o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Informe o segundo número:");
        num2 = entrada.nextInt();
        System.out.println("------------------------------------------");
        
        resultado = num1 + num2;
        System.out.println("RESULTADO DA SOMA " + num1 + " E " + num2 + " É " + resultado);
        System.out.println("------------------------------------------");
   
      
    }   
   
    
}
