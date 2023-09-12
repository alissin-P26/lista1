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
public class classificação_de_idades_de_alunos {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();
        
        if(idade <5){
            System.out.println("Sua classificação e infantil A: " + idade);
        }else if ((idade >= 5) && (idade)<=7){
            
        }else if(idade <8 && idade <= 10){
            System.out.println("Sua classificação e infantil B: " + idade);
        }else if (idade <11 && idade <= 13){
            System.out.println("Sua classificação e juvenil A: " + idade);
        }else if (idade <14 && idade <=18){
            System.out.println("Sua classificação e juvenil B: " + idade);
        }else if (idade >=18){
            System.out.println("Sua classificação e adulto: " + idade);
        }
            
    }
}
