package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        String name; 
        int age ;
        String dateOfBirth;
        char gender;
        double bankBalance = 0.0; // Initialized bankBalance to 0.0
        
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter username");
        name = myObj.nextLine();
        System.out.println("Enter date of birth");
        dateOfBirth = myObj.nextLine();
        System.out.println("Enter gender");
        gender = myObj.next().charAt(0);
        
        System.out.println("Enter Age");
        age = myObj.nextInt(); // Use nextInt() for integer input
        
        // You need to prompt for dateOfBirth, gender, and bankBalance inputs as well
        
        System.out.println("This is my profile");
        System.out.println("My name is " + name);
        System.out.println("Age: " + age + ", born on: + dateOfBirth"); // Add dateOfBirth
        // Add prompts and inputs for gender, dateOfBirth, and bankBalance
        
        System.out.println("This is my first Java Program");
        
        // Use if-else to determine gender string
        String genderg;
        if (gender == 'M') {
            genderg = "Male";
        } else {
            genderg = "Female";
        }
        System.out.println("Gender: " + genderg);
        
        System.out.println("Account Balance is " + bankBalance);
    }
}
