// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: A cake used in the main scenario
 *
 * INPUT: Shape, Cake Type, Health
 * OUTPUT: Can output a readable string that involves the cakes type and shape.
 * Edge Case: N/A
 */
package edu.bhscs;

public class MyCake {
  public String shape;
  public CakeTypes cakeType;
  public int HP;

  // Cake Constructor
  public MyCake(String shape, CakeTypes cakeType, int HP) {
    this.shape = shape;
    this.cakeType = cakeType;
    this.HP = HP;
  }

  // return a string describing the cake in english
  public String getReadableName() {
    return shape + " " + cakeType.toString().toLowerCase() + " cake";
  }
}
