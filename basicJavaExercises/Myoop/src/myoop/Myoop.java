/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myoop;

/**
 *
 * @author nzela37
 */  
import java.util.Scanner;
public class Myoop {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        
       while(true) {
        Calculator bwenge = new Calculator();
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter first number");
        int number1=sc.nextInt();
        System.out.println("enter operation");
        char operation = sc.next().charAt(0);
        System.out.println("enter second number");
        int number2 = sc.nextInt();
        
        bwenge.num1 = number1;
        bwenge.num2 = number2;
        if(operation == '+'){
            bwenge.add();
        }
        if(operation == '-'){
            bwenge.sub();
        }
       
    }
    
        }
}
