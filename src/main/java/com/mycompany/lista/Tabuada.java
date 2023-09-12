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
public class Tabuada {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      
      String opcaoTabuada;
      
      int tab, resultado, cont = 1;
      System.out.println("------------------------------------------");
      System.out.println("Informe uma tabuada: ");
      tab = entrada.nextInt();
      
      while(cont <= 10){
          resultado = tab * cont;
          
          System.out.println(tab + " x " + cont + " = " + resultado);
          cont = cont + 1;
        }
      System.out.println("------------------------------------------");
    }
}
