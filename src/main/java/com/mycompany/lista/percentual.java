/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

import java.util.Scanner;

/**
 *
 * @author jose.5989
 */
public class percentual {
    public static void main(String [] args){
      Scanner entrada = new Scanner(System.in);  
      
      int num1;
      float porcentagem, resultado;
      
      System.out.println("Digite um numero: ");
      num1 = entrada.nextInt();
      
      System.out.println("Informe a porcentagem que você queira saber: ");
      porcentagem = entrada.nextFloat();
      
      System.out.println();
      
      resultado = (num1 * porcentagem) /100;
      
      System.out.println("O resultado " + resultado );
        
    }
}
