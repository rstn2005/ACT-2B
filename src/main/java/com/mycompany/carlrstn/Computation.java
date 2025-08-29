/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carlrstn;
import java.util.Scanner;
/**
 *
 * @author CL1-PC08
 */
public class Computation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[1] - Addition");
        System.out.println("[2] - Subtraction");
        System.out.println("[3] - Multiplication");
        System.out.println("[4] - Division");
        
        System.out.println("Enter your choice: ");
        int x = input.nextInt();
        
        if(x==1)
        {
               System.out.println("Enter a number: ");
               int num1 = input.nextInt();
               System.out.println("Enter another number: ");
               int num2 = input.nextInt();
               
               int sum = num1 + num2;
               System.out.print("The Sum of 2 number is: " + sum);
        }
        else if(x==2)
        {
               System.out.println("Enter a number: ");
               int num1 = input.nextInt();
               System.out.println("Enter another number: ");
               int num2 = input.nextInt();
               
               int sub = num1 - num2;
               System.out.print("The Sum of 2 number is: " + sub);
        }
        else if(x==3)
        {
               System.out.println("Enter a number: ");
               int num1 = input.nextInt();
               System.out.println("Enter another number: ");
               int num2 = input.nextInt();
               
               int mul = num1 * num2;
               System.out.print("The Sum of 2 number is: " + mul);
        }
        else if(x==4)
        {
               System.out.println("Enter a number: ");
               int num1 = input.nextInt();
               System.out.println("Enter another number: ");
               int num2 = input.nextInt();
               
               int div = num1 / num2;
               System.out.print("The Sum of 2 number is: " + div);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}
