/**
 * Write a program that prompts a first name and an age, then display the
 * name the user entered with the following age in months.
 * e.g:
 * $ Please enter your first name and age:
 * > John 23
 * "Hello, John (age 276 months)."
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your first name and age:");
    String firstName = input.next();
    int age = input.nextInt();
    System.out.printf("Hello, %s (age %d months).", firstName, age * 12);
  }
}
