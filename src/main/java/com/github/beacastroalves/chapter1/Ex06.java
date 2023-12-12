/**
 * Do exercise 5, but with three strings values in alphabetic order.
 * So, if the user enters the values: Steinbeck Hemingway Fitzgerald
 * the output should be Fitzgerald, Hemingway, Steinbeck.
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type names:");
    String val1 = input.next();
    String val2 = input.next();
    String val3 = input.next();

    String first;
    String second;
    String third;

    if (val1.compareToIgnoreCase(val2) <= 0 && val1.compareToIgnoreCase(val3) <= 0) {
      first = val1;

      if (val2.compareToIgnoreCase(val3) < 0) {
        second = val2;
        third = val3;
      } else {
        second = val3;
        third = val2;
      }
    } else if (val2.compareToIgnoreCase(val1) < 0 && val2.compareToIgnoreCase(val3) <= 0) {
      first = val2;

      if (val1.compareToIgnoreCase(val3) < 0) {
        second = val1;
        third = val3;
      } else {
        second = val3;
        third = val1;
      }
    } else {
      first = val3;

      if (val1.compareToIgnoreCase(val2) < 0) {
        second = val1;
        third = val2;
      } else {
        second = val2;
        third = val1;
      }
    }

    String comma1 = !first.equals(second) ? "," : "";
    String comma2 = !second.equals(third) ? "," : "";

    System.out.printf("%s%s %s%s %s", first, comma1, second, comma2, third);
  }
}
