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
public class Par_impar {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("------------------------------------------");
	System.out.println("Informe um número inteiro para descobrir se é Par ou Impar: ");
	x = entrada.nextInt();
	System.out.println("------------------------------------------");	
	if(x % 2 == 0) {
	System.out.printf("%d é par", x);
        }
	else {
	System.out.printf("%d é impar", x);
	}
	entrada.close();
    }
}


    
    