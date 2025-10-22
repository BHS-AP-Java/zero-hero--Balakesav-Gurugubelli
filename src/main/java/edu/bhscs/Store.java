// Balakesav Gurugubelli
// P2
// Bake Sale
// 10/7

/*
 * DESCRIPTION: A store object used in Mr. Reiber's baker class.
 *
 * INPUT: Store name
 * OUTPUT: The name of the store
 * Edge Case: N/A
 */

package edu.bhscs;

// Reiber Baker Wrapper
public class Store {
  String name;

  public Store(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
