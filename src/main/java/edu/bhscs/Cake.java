// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: A cake that a) can be drawn b) has required properties for Mr. Reiber's baker class
 *
 * INPUT: The type of cake, the flour class, and an integer quality, the size, the character used to draw, and the character used for frosting
 * OUTPUT: Prints a cake pattern
 * EDGE CASE: Big enough cakes don't fit in terminal
 */

package edu.bhscs;

public class Cake {
  // useless
  Flour flour;
  String type;
  int quality;

  // useful
  int size;
  String color;
  String frosting; // unused right now

  public Cake(String type, Flour flour, int quality, int size, String color, String frosting) {
    this.type = type;
    this.flour = flour;
    this.quality = quality;
    this.size = size;
    this.color = color;
    this.frosting = frosting;
  }

  public void draw() {
    int arraySize = size * 2 + 1;

    // initialize array
    String[][] viewArray = initializeArray(arraySize, " ");

    // create circle using sin and cosine
    for (int angle = 0; angle < 360; angle++) {
      int x = (int) Math.round(Math.cos(angle) * size) + size;
      int y = (int) Math.round(Math.sin(angle) * size) + size;

      viewArray[y][x] = this.color;
    }

    // slices
    for (int angle = 0; angle < 360; angle += 30) {
      for (float i = 0; i < size; i += 0.1) {
        int x = ((int) Math.round(Math.cos(angle) * i)) + size;
        int y = ((int) Math.round(Math.sin(angle) * i)) + size;

        viewArray[y][x] = this.color;
      }
    }

    // print cake
    printArray(viewArray);
  }

  String[][] initializeArray(int arraySize, String character) {
    String[][] array = new String[arraySize][arraySize];

    for (int y = 0; y < arraySize; y++) {
      String[] row = new String[arraySize];
      for (int x = 0; x < arraySize; x++) {
        row[x] = character;
      }

      array[y] = row;
    }

    return array;
  }

  void printArray(String[][] array) {
    for (int y = 0; y < array.length; y++) {
      for (int x = 0; x < array.length; x++) {
        System.out.print(array[y][x]);
      }

      System.out.println();
    }
  }

  String duplicateCharacters(String character, int count) {
    String output = "";

    for (int i = 0; i < count; i++) {
      output += character;
    }

    return output;
  }
}
