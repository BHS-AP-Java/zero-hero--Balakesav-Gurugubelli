// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: A customer class for Mr. Reiber's baker.
 *
 * INPUT: Name, Type of Cake, Amount of money paid
 * OUTPUT: What cake the customer got and how much it paid
 * Edge Case: N/A
 */
package edu.bhscs;

// Reiber Baker Wrapper
public class Customer {
  public String name;

  public Customer(String name) {
    this.name = name;
  }

  public int pay(int money) {
    System.out.println("I, " + name + ", the customer am paying $" + money + " for this!");
    return money;
  }

  public void takeCake(Cake cake) {
    System.out.println("I got a " + cake.type + " cake! It would rate it " + cake.quality + "/10.");
  }
}
