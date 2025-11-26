/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author nzela37
 */
import java.util.Scanner;
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     * Exercise 1 — Simple Calculator

    Write a program that:

    Takes two integers

    Prints their sum, subtraction, multiplication, division
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nb1, nb2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        nb1 = sc.nextInt();
        System.out.println("Enter second number");
        nb2 = sc.nextInt();
        
        int sum =nb1 + nb2;
        int sub = nb1 - nb2;;
        int mult = nb1 * nb2;
        int div = nb1 / nb2;
        
        System.out.println( "The sumation of "+nb1+"and "+nb2+"= "+sum);
        System.out.println( "The substraction of "+nb1+"and "+nb2+"= "+sub);
        System.out.println( "The multiplication of "+nb1+"and "+nb2+"= "+mult);
        System.out.println( "The division of "+nb1+"and "+nb2+"= "+div);
        
    }
    
}
