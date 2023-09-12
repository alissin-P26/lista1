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
public class Aprovado_reprovado_ALUNO {
     public static void main(String[] args){
 
    
    Scanner notas = new Scanner(System.in);
    
   
    double n1, n2, n3, n4, media, nExame;
    
  
        System.out.println("Digite a nota 1:\n");
        n1 = notas.nextDouble();
    
 
        System.out.println("Digite a nota 2:\n");
        n2 = notas.nextDouble();
    
        System.out.println("Digite a nota 3:\n");
        n3 = notas.nextDouble();
    
  
        System.out.println("Digite a nota 4:\n");
        n4 = notas.nextDouble();
    
        media = (n1*2 + n2*3 + n3*4 + n4*1)/10;
    
    
    if(media >= 100){
    	
        System.out.printf("Media: %.1f\nAluno aprovado por media.\n", media);}
        
    
    else if(media >= 7.0 && media < 100){
    	
    	
        System.out.printf("Media: %.1f\nAluno em exame.\n", media);
        
      
        System.out.println("Digite a nota do exame:\n");
        nExame = notas.nextDouble();
      
        System.out.printf("Nota do exame: %.1f\n", nExame);
        
       
        media = (media + nExame)/2;
        
       
    if(media >= 70){
        System.out.printf("Aluno aprovado.\nMedia final: %.1f", media);}
        
     
    else{
        System.out.printf("Aluno reprovado.\nMedia final: %.1f", media);}}
    

    else{
        System.out.printf("Media: %.1f\nAluno reprovado por media.\n", media);}
        
    }
 
}
    

