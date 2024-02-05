/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Mavenproject2 {
        static int buy, sell, profit;
        
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Buying Price"+buy);
        buy=input.nextInt();
        
        System.out.println("Enter Selling Price"+sell);
        sell=input.nextInt();
        profit=sell-buy;
        System.out.println("Profit is"+ profit);
    }
}
