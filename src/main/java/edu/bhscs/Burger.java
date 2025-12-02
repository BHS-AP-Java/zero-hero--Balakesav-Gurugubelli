// Balakesav Gurugubelli
// P2
// Bake Sale
// 10/10

/*
 * DESCRIPTION: A burger that can be captured
 *
 * INPUT: No Input
 * Output: Prints an image of the burger
 * EDGE CASE: No edge case
 */

package edu.bhscs;

public class Burger {
  int name;

  public Burger(int name) {
    this.name = name;
  }

  void draw() {
    System.out.println(duplicateCharacters(" ", 9));
    System.out.println("  " + duplicateCharacters("#", 5) + "  ");
    System.out.println(duplicateCharacters("#", 9));
    System.out.println("  " + duplicateCharacters("#", 5) + "  ");
    System.out.println(duplicateCharacters(" ", 9));
  }

  String duplicateCharacters(String character, int count) {
    String output = "";

    for (int i = 0; i < count; i++) {
      output += character;
    }

    return output;
  }
}
