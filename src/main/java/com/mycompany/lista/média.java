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
public class média {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, resultado;
        System.out.println("------------------------------------------");
        System.out.println("Informe o primeiro número");
        num1 = entrada.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Informe o segundo número");
        num2 = entrada.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Informe o terceiro número");
        num3 = entrada.nextInt();
        System.out.println("------------------------------------------");
        resultado =( num1 + num2 + num3)/3;
        System.out.println("A MEDIA : " + num1 + " E " + num2  + " É " + num3 + resultado);
        System.out.println("------------------------------------------");
    }
    
    
}
