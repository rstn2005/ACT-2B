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
        
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        System.out.println("Input another number: ");
        int y = input.nextInt();
        
        int sum = x + y;
        int diff = x - y;
        int prod = x * y;
        int quo = x / y;
        
        System.out.println("The sum of 2 number is " + sum);
        System.out.println("The Difference of 2 number is " + diff);
        System.out.println("The Product of 2 number is " + prod);
        System.out.println("The Quotient of 2 number is " + quo);
        
    }
}
