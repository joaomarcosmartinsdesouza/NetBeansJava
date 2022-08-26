/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1exerc001;

/**
 *
 * @author joaom
 */
public class Mavenproject1Exerc001 {

    public static void main(String[] args) {
        
        int[] idadeAlunos = new int[10];
        float [][] notasAlunos = new float[10][3];
        for (int i=0; i<10; i++){
            System.out.println("Entre com a idade do "+ (i+1)+"º aluno: ");
            idadeAlunos[i] = new java.util.Scanner(System.in).nextInt();
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<3; j++){
                System.out.println("Entre com a nota da Prova"+(j+1)+" do "
                        +(i+1)+"º aluno: ");
                notasAlunos[i][j] = new java.util.Scanner(System.in).nextFloat();
            }
        }
        
        System.out.println("Fim do programa!");
    }
}
