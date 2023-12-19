/**
 * Write a program that prompts the user to enter some number of pennies,
 * nickels, dimes, quarters, half-dollars, and one dollar. Query the user
 * separately for the numbers of each coin. If only one of a coin is
 * reported, make the output grammatically correct. Also, report the sum
 * in dollars and cents.
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    //pennies 0.01 , nickels 0.05, dimes 0.10 , quarters 0.25, half-dollars 0.50, and one dollar 1.00
    Scanner input = new Scanner(System.in);
    System.out.println("How many pennies do you have?");
    int pennies = input.nextInt();
    System.out.println("How many nickels do you have?");
    int nickels = input.nextInt();
    System.out.println("How many dimes do you have?");
    int dimes = input.nextInt();
    System.out.println("How many quarters do you have?");
    int quarters = input.nextInt();
    System.out.println("How many half-dollars do you have?");
    int halfDollars = input.nextInt();
    System.out.println("How many one dollar do you have?");
    int oneDollar = input.nextInt();
    String dollarWord = "dollar";
    String centWord = "cent";

    float result = (float) ((pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25) + (halfDollars * 0.50) + (oneDollar * 1.0));
    int resultInt = (int) result;
    int resultDec = (int) ((result * 100) - (resultInt * 100));

    if (resultInt > 1) {
      dollarWord = "dollars";
    }

    if (resultDec > 1) {
      centWord = "cents";
    }

    System.out.printf( "%d %s and %d %s", resultInt, dollarWord, resultDec, centWord);

  }
}
