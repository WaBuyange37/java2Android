/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempconvertor;

/**
 *
 * @author nzela37
 */
import java.util.Scanner;
public class TempConvertor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputo = new Scanner(System.in);
        int degree;
        int output;
        int choice;
        System.out.println("Temperature Convetor");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit ");
        
        choice = inputo.nextInt();
        if(choice == 1){
            System.out.println("Enter degree Fahrenheit you wish to convert to C");
            degree = inputo.nextInt();
            output = (degree-32)*5/9;
            System.out.println("the ooutput is "+output+" C");
        }
        
        else if(choice == 2){
            System.out.println("Enter degree C you wish to convert to F");
            degree = inputo.nextInt();
            output = (degree*9/5)+32;
            System.out.println("the ooutput is "+output+" C");
        }
        else{
            System.out.println("You are doing shit <.|.>");
        }
    }
    
}
