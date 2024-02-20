/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskstdinstdout;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TaskStdinStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); //não consome o caractere de quebra de linha \n

        // Write your code here.
        Double d = scan.nextDouble(); // primeiro o double para depois usar as strings
         scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
