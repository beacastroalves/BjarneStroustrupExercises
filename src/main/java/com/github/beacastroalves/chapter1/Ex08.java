/**
 * Write a program that converts spelled-out numbers such as "zero" and
 * "two" into such as 0 and 2. Do it for the values 1, 2, 3, and 4 and
 * write out "Not a number I know" if the user enters something that
 * doesn't correspond.
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Write a spelled-out number, such as one, two, three or four");
    String spelledNumber = input.next().toUpperCase();
    int value = 0;

    switch (spelledNumber) {
      case "ONE":
        value = 1;
        break;
      case "TWO":
        value = 2;
        break;
      case "THREE":
        value = 3;
        break;
      case "FOUR":
        value = 4;
        break;
      default:
        System.out.println("Not a number I know");
    }

    if (value > 0) {
      System.out.println(value);
    }
  }
}
