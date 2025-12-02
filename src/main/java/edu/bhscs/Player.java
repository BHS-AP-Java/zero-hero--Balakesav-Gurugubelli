// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: A player class used in Mr. Reiber's baker class. It uses the Input class to perform a simple operation, asking a question to the user.
 *
 * INPUT: User Input, Message
 * OUTPUT: What the user types
 * Edge Case: Does not validate user input
 */

package edu.bhscs;

// Wrapper for Reiber Baker
public class Player {
  public Player() {
    if (Input.scanner == null) {
      Input.initialize();
    }
  }

  public String giveAnswer(String message) {
    System.out.println(message);
    return Input.getInput();
  }
}
