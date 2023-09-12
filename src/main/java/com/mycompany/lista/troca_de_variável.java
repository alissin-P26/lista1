/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

/**
 *
 * @author jose.5989
 */
public class troca_de_variável {
    public static void main(String args[]){
        
        int num1 = 5, num2 = 9, temp;
        
        System.out.println("--------------------------------------------------");
        System.out.println("Valores antes das trocas: num1 = 5 e num2 = 9 ");
        temp = num1;
        num1 = num2;
        num2 = temp;
       
        System.out.println("--------------------------------------------------");
        
        System.out.println("Valores depois da troca: ");
        
        System.out.println("- O valor de num1 é : " + num1);
        System.out.println("- O valor de num2 é : " + num2);
        System.out.println("--------------------------------------------------");
    }
}
