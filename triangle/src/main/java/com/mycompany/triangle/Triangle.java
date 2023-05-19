/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.triangle;

import java.util.Scanner;

/**
 *
 * @author ammas
 */
public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Introduir nombre d'elements: ");
        int n = sc.nextInt();
       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
       
        sc.close();
    }
}
