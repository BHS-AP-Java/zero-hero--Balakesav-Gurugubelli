// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/29

/*
 * DESCRIPTION: A PTSA that inherits money from the customers after the cake is killed.
 *
 * INPUT: The amount of starting money, and the name of the leader
 * OUTPUT: Prints how much money the PTSA has
 * Edge Case: Negative money
 */

package edu.bhscs;

public class PTSA {
  int money;
  String leader;

  // PTSA Constructor
  public PTSA(int money, String leader) {
    this.money = money;
    this.leader = leader;
  }

  // Method to print the amount of money the PTSA leader has.
  public void printMoneyLevel() {
    System.out.println(leader + ", the PTSA leader has " + money + " dollars!");
  }
}
