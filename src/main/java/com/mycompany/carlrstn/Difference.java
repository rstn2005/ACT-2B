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
public class Difference {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        int x = input.nextInt();
        System.out.println("Enter another Number: ");
        int y = input.nextInt();
        
        int diff = x - y;
        
        System.out.println("The Difference of 2 numbers is " + diff);
    }
}
