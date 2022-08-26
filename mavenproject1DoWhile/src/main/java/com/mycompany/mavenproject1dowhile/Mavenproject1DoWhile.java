/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1dowhile;

/**
 *
 * @author joaom
 */
public class Mavenproject1DoWhile {

    public static void main(String[] args) {
        
        int opcao;
        do{
            System.out.println("Digite uma das opcoes abaixo:");
            System.out.println("1 - Pratos");
            System.out.println("2 - Bebidas");
            System.out.println("3 - Encerre sua conta e saia do programa");
            
            opcao = new java.util.Scanner(System.in).nextInt();
            
            switch (opcao) {
                case 1:{
                    System.out.println("* Hamburger");
                    System.out.println("* Salada");
                    System.out.println("* Batata frita");
                    break;
                }
                case 2:{
                    System.out.println("* Refrigerante");
                    System.out.println("* Suco");
                    System.out.println("* Agua");
                }
                case 3:{
                    System.out.println("Conta encerrada");
                }
                break;
                default:{
                    System.out.println("Opcao invalida");
                }
            }
                        
        } 
        while (opcao!=3);
        System.out.println("Fim do programa");
    }
    
}
