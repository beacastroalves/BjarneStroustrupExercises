/**
 * Write a program to test an integer value to determine if it is odd or even.
 * As always, make sure your output is clear and complete. In other words,
 * don't just use yes or no. Your output should stand alone, like the value 4
 * is an even number.
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type a number and find out if it is odd or even:");
    int val1 = input.nextInt();
    String numberIs = "odd";

    if (val1 % 2 == 0) {
      numberIs = "even";
    }

    System.out.printf("The value %d is an %s number.", val1, numberIs);
  }
}
