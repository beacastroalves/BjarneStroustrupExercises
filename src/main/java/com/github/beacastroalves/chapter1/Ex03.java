/**
 * Write a program that prompts the user to enter two integers. Store these
 * values as int variables named val1 and val2. Write your program to determine
 * the smaller, larger, sum, difference, product, and ratio of these values and
 * report them to the user.
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type the first number:");
    int val1 = input.nextInt();
    System.out.println("Type the second number:");
    int val2 = input.nextInt();
    int smaller = val1;
    int larger = val2;

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
