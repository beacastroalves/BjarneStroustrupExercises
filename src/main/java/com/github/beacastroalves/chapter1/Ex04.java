/**
 * Modify the previous program to ask the user to enter floating-point values
 * and store them in double variables.
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type the first number:");
    double val1 = input.nextDouble();
    System.out.println("Type the second number:");
    double val2 = input.nextDouble();
    double smaller = val1;
    double larger = val2;

    if (val1 > val2) {
      smaller = val2;
      larger = val1;
    }

    System.out.println("The smaller: " + smaller);
    System.out.println("The larger: " + larger);
    System.out.println("sum: " + (val1 + val2));
    System.out.println("difference: " + (val1 - val2));
    System.out.println("product: " + (val2 * val1));
    System.out.println("ratio: " + (val1 / val2));
  }
}

