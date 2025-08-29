/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carlrstn;
import java.util.Scanner;
/**
 *
 * @author CL1-PC09
 */
public class Carlrstn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[1] - Rock");
        System.out.println("[2] - Paper");
        System.out.println("[3] - Scissor");
        
        System.out.println("Enter Player 1: ");
        int x = input.nextInt();
        System.out.println("Enter Player 2: ");
        int y = input.nextInt();
        
        if(x == 1 && y == 1)
        {
            System.out.print("DRAW");
        }
        else if(x == 1 && y == 2)
        {
            System.out.print("Player 2 Wins!! PAPER");
        }
        else if(x == 1 && y == 3)
        {
            System.out.print("Player 1 Wins!! ROCK");
        }
        else if(x == 2 && y == 1)
        {
            System.out.print("Player 1 Wins!! PAPER");
        }
        else if(x == 2 && y == 2)
        {
            System.out.print("DRAW");
        }
        else if(x == 2 && y == 3)
        {
            System.out.print("Player 2 Wins!! SCISSOR");
        }
        else if(x == 3 && y == 1)
        {
            System.out.print("Player 2 Wins!! ROCK");
        }
        else if(x == 3 && y == 2)
        {
            System.out.print("Player 1 Wins!! SCISSOR");
        }
        else if(x == 3 && x == 3)
        {
            System.out.print("DRAW");
        }
        else
        {
            System.out.print("PLEASE INPUT THE RIGHT CHOICE!!");
        }
    }
}
