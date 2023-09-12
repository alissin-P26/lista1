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
public class IMC {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        float imc, altura, peso; 
        
        System.out.println("--------------------------------------------------");
        System.out.println("Informe sua altura para calcular-mos o IMC: ");
        altura = entrada.nextFloat();
        
        System.out.println("--------------------------------------------------");
        System.out.println("Informe seu peso para calcular-mos o IMC: ");
        peso = entrada.nextFloat();
       
        imc = peso / (altura * altura);   
        
        System.out.println("Seu IMC: " + imc);
    }
        
    
}
