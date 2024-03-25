package com.ontariotechu.wzc100846922.sofe3980u.whitebox;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scan.nextLine();
        System.out.print("Please enter the character to count: ");
        char target = scan.nextLine().charAt(0);
        scan.close();
        System.out.println("Counted " + StringCalculator.occurances(str, target) + " of character " + target + ".");
    }
}
