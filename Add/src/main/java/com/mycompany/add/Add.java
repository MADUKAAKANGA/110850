/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.add;
import java.util.Scanner;
        
/**
 *
 * @author User
 */
public class Add {
        
    public static void main(String[] args) {
        int a, b, sum, subtraction, multiplication,modulus;
        float division ;
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter value a");
        a= myobj.nextInt();
           
        System.out.println("Enter value b");
        b= myobj.nextInt();
           
       sum=a+b;
       subtraction=a-b;
       multiplication =a*b;
       division= a/b;
        modulus= b%a;
       
       System.out.println("The Sum is"+sum);
       System.out.println("The Subtraction value is"+ subtraction);
       System.out.println("The Multiplication value is"+multiplication);
       System.out.println("The Division value is"+division);
       System.out.println("The Modulus value is"+modulus);

    }
}
