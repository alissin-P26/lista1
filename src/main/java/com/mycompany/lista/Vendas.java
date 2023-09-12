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
public class Vendas {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        String produto1 = "FIFA 24";
        String produto2 = "CALL OF DUTY";
        String produto3 = "MINECRAFT";
        String produto4 = "FORZA HORIZION";
        String produto5 = "BOMBA PATCH 100% ATUALIZADO";
        
        float preço1 = (float) 390.00;
        float preço2 = (float) 110.65;
        float preço3 = (float) 197.50;
        float preço4 = (float) 89.99;
        float preço5 = (float) 99.99;
        
        int menu;
        
        float preço, quantidade, total;
        
        System.out.println("----------------------PRODUTOS------------------------");
        System.out.println("Selecione seu Produto!");
        System.out.println("1-FIFA 24" + " R$ " + preço1);
        System.out.println("2-CALL OF DUTY"+ " R$ " + preço2);
        System.out.println("3-MINECRAFT" + " R$ " + preço3);
        System.out.println("4-FORZA HORIZION" + " R$ " + preço4);
        System.out.println("5-BOMBA PATCH 100% ATUALIZADO" + " R$ " + preço5);
        System.out.println("------------------------------------------------------");
        
        System.out.println("Informe o produto selecionado: ");
        menu = entrada.nextInt();
        System.out.println("------------------------------------------------------");
        
        System.out.println("Informe a quantidade do produto que você queira: ");
        quantidade = entrada.nextFloat();
        System.out.println("------------------------------------------------------");
        if (menu == 1){
            System.out.println("Voce Selecionou: " + produto1);
            total = preço1 * quantidade;
            System.out.println("O total da sua compra foi: " + "R$ " + total);
            System.out.println("--------------------------------------------------");
        }else if (menu == 2) {
            System.out.println("Voce Selecionou: " + produto2);
            total = preço2 * quantidade;
            System.out.println("O total da sua compra foi: " + "R$ " + total);
            System.out.println("--------------------------------------------------");
        }else if (menu == 3) {
            System.out.println("Voce Selecionou: " + produto3);
            total = preço3 * quantidade;
            System.out.println("O total da sua compra foi: " + "R$ " + total);
            System.out.println("--------------------------------------------------");
        }else if (menu == 4){
            System.out.println("Voce Selecionou: " + produto4);
            total = preço4 * quantidade;
            System.out.println("O total da sua compra foi: " + "R$ " + total);
            System.out.println("--------------------------------------------------");
        }else if (menu == 5){
            System.out.println("Voce Selecionou: " + produto5);
            total = preço5 * quantidade;
            System.out.println("O total da sua compra foi: " + "R$ " + total);
            System.out.println("--------------------------------------------------------");
        }
        System.out.println("OBRIGADO PELA COMPRA, VOLTE SEMPRE! ");
        System.out.println("------------------------------------------------------");
    }
    
}
