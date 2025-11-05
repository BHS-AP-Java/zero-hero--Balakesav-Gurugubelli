// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: The baker class used in the main program, with HP and an attack value to be able to fight the cake in the main scenario.
 *
 * INPUT: Health, name, attack damage
 * OUTPUT: Prints that it baked a cake
 * Edge Case: Nothing happens if the baker has 0 HP.
 */

package edu.bhscs;

public class MyBaker {
  public int HP;
  public String name;
  int attackStrength;

  // baker constructor
  public MyBaker(int HP, String name, int attackStrength) {
    this.HP = HP;
    this.name = name;
    this.attackStrength = attackStrength;
  }

  // print that the baker baked a cake
  public void bake(MyCake cake) {
    System.out.println("I, " + name + " baked a " + cake.getReadableName() + "!");
  }
}
