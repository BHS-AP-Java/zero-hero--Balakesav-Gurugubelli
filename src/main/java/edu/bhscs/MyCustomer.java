// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: The customer, involved in the main scenario
 *
 * INPUT: What the customer will say when interacted with
 * OUTPUT: Prints the message
 * Edge Case: Can't have multiple messages or take input
 */

package edu.bhscs;

public class MyCustomer {
  String customerMessage;

  // PTSA Constructor
  public MyCustomer(String customerMessage) {
    this.customerMessage = customerMessage;
  }

  // Method to print the customers message
  public void printMessage() {
    System.out.println(customerMessage);
  }
}
