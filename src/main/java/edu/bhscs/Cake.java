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

  String name;

  // useful
  int size;
  String color;
  String frosting; // not implemented

  public Cake(int size, String color, String frosting) {
    this.type = "vanilla";
    this.flour = new Flour(0);
    this.quality = 0;
    this.size = size;
    this.color = color;
    this.frosting = frosting;
  }

  public Cake(int size, String color, String frosting, String type, Flour flour, int quality) {
    this.type = type;
    this.flour = flour;
    this.quality = quality;
    this.size = size;
    this.color = color;
    this.frosting = frosting;
  }

  public Cake(int width, String name) {
    this.size = width;
    this.name = name;
  }

  public void draw(int offset) {
    int arraySize = size * 2 + 1;

    // initialize array
    String[][] viewArray = Renderer.initializeArray(arraySize, " ");

    // create circle using sin and cosine functions -,mp[ ]
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
    Renderer.printArray(viewArray, offset);
  }

  public void draw() {
    draw(0);
  }

  // reiber date10_27
  // why is the cake drawing the table???
  // the cake isn't really drawing itself "on top" of the table, the cake is simply adjusting its
  // size to match the table which it's placed on.
  public void draw(Table table) {
    // we are setting the cake color, rather than using the properties, because the
    // required 10_27 code does not construct the cake using a color parameter
    this.color = "#";

    // [cakeOffset, tableOffset]
    int[] offsets = calculateOffsets(table);

    // draw table
    table.verify();

    draw(offsets[0]);
    table.draw(offsets[1]);
  }

  public int[] calculateOffsets(Table table) {
    int cakeSize = size * 2 + 1;
    int modifiedTableWidth = table.width - (table.width % table.legs);

    int cakeOffset = 0;
    int tableOffset = 0;

    // calculate offsets
    int offset = Math.abs(modifiedTableWidth - cakeSize) / 2;

    if (cakeSize <= modifiedTableWidth) {
      cakeOffset = offset;
    } else {
      tableOffset = offset;
    }

    int[] offsets = new int[] {cakeOffset, tableOffset};

    return offsets;
  }
}
