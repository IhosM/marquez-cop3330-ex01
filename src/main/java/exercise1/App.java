/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package exercise1;
import java.util.Scanner;



public class App

{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("What is your name?");

        String name = s.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }

}