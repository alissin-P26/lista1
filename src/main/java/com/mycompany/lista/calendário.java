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
public class calendário {
    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       
      
        int jan = 31,
            fev = 28,
            mar = 31,
            abr = 30,
            maio = 31,
            jun  = 30,
            jul = 31,
            ago = 31,
            set = 30,     
            out = 30,
            nov = 30,
            dez = 31;
        
        int mes;
       
        System.out.println("Informe o mes: ");
        mes = scanner.nextInt();
        
        if(mes == 1){
            System.out.println("Seu mes tem " + jan + " dias");
        }else if(mes == 2) {
            System.out.println("Seu mes tem " + fev + " dias");
        }else if (mes == 3) {
            System.out.println("Seu mes tem " + mar + " dias");
        }else if (mes == 4) {
            System.out.println("Seu mes tem " + abr + " dias");
        }else if (mes == 5) {
            System.out.println("Seu mes tem " + maio + " dias");
        }else if (mes == 6) {
            System.out.println("Seu mes tem " + jun + " dias");
        }else if (mes == 7) {
            System.out.println("Seu mes tem " + jul + " dias");
        }else if (mes == 8) {
            System.out.println("Seu mes tem " + ago + " dias");
        }else if (mes == 9) {
            System.out.println("Seu mes tem " + set + " dias");
        }else if (mes == 10) {
            System.out.println("Seu mes tem " + out + " dias");
        }else if (mes == 11) {
            System.out.println("Seu mes tem " + nov + " dias");
        }else if (mes == 12) {
            System.out.println("Seu mes tem " + dez + " dias");
        }   
    }
}
