/**
 * Write a program that takes an operation followed by two
 * operands and outputs the result. For example the user inputs:
 * > 100 + 3.14
 * It displays:
 * > 103.14
 * Do it for all 4 operations sum, subtraction,
 * multiplication and division
 */
package com.github.beacastroalves.chapter1;

import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator for all 4 operations. " +
        "Write two operands in the same line. " +
        "For example 100 + 3.14 ");


    while (true) {
      System.out.print("> ");
      try {
        Scanner input = new Scanner(System.in);
        String term1 = input.next();

        if (term1.equalsIgnoreCase("EXIT")) {
          break;
        }

        String option = input.next();

        if (option.equalsIgnoreCase("EXIT")) {
          break;
        }

        String term2 = input.next();

        if (term2.equalsIgnoreCase("EXIT")) {
          break;
        }

        float n1 = Float.parseFloat(term1);
        float n2 = Float.parseFloat(term2);
        float result;

        switch (option) {
          case "+":
            result = n1 + n2;
            break;
          case "-":
            result = n1 - n2;
            break;
          case "*":
            result = n1 * n2;
            break;
          case "/":
            result = n1 / n2;
            break;
          default:
            throw new Exception("Invalid Operation, try: +, -, * or /");
        }

        System.out.println(result);
      } catch (NumberFormatException e) {
        System.out.println("Failed to parse number " + e.getMessage());
      } catch (Exception e) {
        System.out.println("Failed to calculate: " + e.getMessage());
      }
    }
  }
}

