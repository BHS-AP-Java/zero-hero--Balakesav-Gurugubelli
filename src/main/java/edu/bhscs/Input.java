// Balakesav Gurugubelli
// P2
// Bake Sale
// 10/6

/*
 * DESCRIPTION: An input class to encapsulate the scanner used in the main program
 *
 * INPUT: User Input
 * OUTPUT: N/A
 * Edge Case: User types something that does not answer the question asked
 */

package edu.bhscs;

import java.util.Scanner;

public class Input {
  public static Scanner scanner;

  public static void initialize() {
    scanner = new Scanner(System.in);
  }

  public static String getInput() {
    return scanner.nextLine();
  }

  public static void closeScanner() {
    scanner.close();
  }
}
