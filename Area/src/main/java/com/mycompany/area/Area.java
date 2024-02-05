/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Area {
            
    public static void main(String[] args) {
            int base, height, perimeter,hypotenuse;
           double area;
        Scanner input= new Scanner(System.in);
        
        System.out.println("Input Base");
        base=input.nextInt();
        System.out.println("Input Height");
        height=input.nextInt();
        System.out.println("Input Hypotenuse");
        hypotenuse=input.nextInt();
        area= 0.5*base*height;
        perimeter= base +height+hypotenuse;
        System.out.println("Area is"+ area);
        System.out.println("Perimeter is"+ perimeter);
        
        
    }
}
