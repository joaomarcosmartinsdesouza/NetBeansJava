/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1quantnumprimos;

/**
 *
 * @author joaom
 */
public class Mavenproject1QuantNumPrimos {

    public static void main(String[] args) {
        
        int quantidadeNumerosPrimos = 0;
        for (int i=2; i<=10; i++ ){
            System.out.println( i + " eh primo???");
            int numeroDivisores = 0;
            int j = 1;
            while (j<=i){
                if (i%j==0){
                    numeroDivisores++;
                }
                j++;
            }
            if (numeroDivisores==2){
                quantidadeNumerosPrimos++;
                System.out.println(" SIM, "+ i +" eh primo.");
            }
            else{
                System.out.println(" NAO, "+ i +" nao eh primo");
            }
        }
        
        System.out.println("Quantidade de numeros primos: "
        + quantidadeNumerosPrimos);
    }
}
