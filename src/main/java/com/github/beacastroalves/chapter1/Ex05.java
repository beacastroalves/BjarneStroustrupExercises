/**
 * Write a program that prompts the user to enter three integer values, and
 * then outputs the values in numerical sequence separated by commas. So, if
 * the user enters the values 10 4 6, the output should be 4, 6, 10. If two
 * values are the same, they should just be ordered together. So the input
 * 4 5 4. should give 4 4, 5.
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type three numbers:");
    int val1 = input.nextInt();
    int val2 = input.nextInt();
    int val3 = input.nextInt();

    int first;
    int second;
    int third;

    if (val1 <= val2 && val1 <= val3) {
      first = val1;

      if (val2 < val3) {
        second = val2;
        third = val3;
      } else {
        second = val3;
        third = val2;
      }
    } else if (val2 < val1 && val2 <= val3) {
      first = val2;

      if (val1 < val3) {
        second = val1;
        third = val3;
      } else {
        second = val3;
        third = val1;
      }
    } else {
      first = val3;

      if (val1 < val2) {
        second = val1;
        third = val2;
      } else {
        second = val2;
        third = val1;
      }
    }

    String comma1 = first != second ? "," : "";
    String comma2 = second != third ? "," : "";

    System.out.printf("%d%s %d%s %d", first, comma1, second, comma2, third);
  }
}
