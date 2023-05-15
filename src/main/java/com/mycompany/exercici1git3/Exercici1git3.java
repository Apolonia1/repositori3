/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici1git3;

import java.util.Scanner;

/**
 *
 * @author ammas
 */
public class Exercici1git3 {

    public static void main(String[] args) {
        System.out.println("Introduir nombre entre 1 i 10");
        Scanner sc = new Scanner (System.in);
        int nombre = sc.nextInt();
       
        if (nombre>10 && nombre<1){
            System.out.println("El nombre no es troba entre 1 i 10. Introduir un altre nombre");
            nombre = sc.nextInt();
        }
        System.out.println("La taula de multiplicar de"+ nombre);
        for (int mult = 1; mult <=10; mult++){
            int res = nombre*mult;
            System.out.println(+nombre);
            System.out.println("*"+mult);
            System.out.println("="+res);
        }
    }
}
