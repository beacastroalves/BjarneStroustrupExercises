/**
 * Write a program that converts miles to kilometers. Your program should
 * have a reasonable prompt for the user to enter a number of miles.
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("To convert miles to kilometers. Enter how many miles you want");
    double dMi = input.nextDouble();
    double dKm = Double.parseDouble(String.format("%f", dMi * 1.609344));
    String mileWord = "mile is";
    String kilometerWord = "kilometer";

    if (dMi > 1.0) {
      mileWord = "miles are";
    }

    if (dKm > 1.0) {
      kilometerWord = "kilometers";
    }

    System.out.printf("%.2f %s %f %s", dMi, mileWord, dKm, kilometerWord);
  }
}
