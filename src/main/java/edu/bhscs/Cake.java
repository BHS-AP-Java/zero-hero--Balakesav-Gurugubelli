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

  public void draw(){
    draw(0);
  }

  // reiber date10_27
  // why is the cake drawing the table???
  // the cake isn't really drawing itself "on top" of the table, the cake is simply adjusting its
  // size to match the table which it's placed on.
  public void draw(Table table) {
    int widthPerLeg = table.width / table.legs;
    int modifiedWidth = table.width - (table.width % table.legs);

    // we are setting the cake color, rather than using the properties, because the
    // required 10_27 code does not construct the cake using a color parameter
    this.color = "#";

    int cakeSize = size * 2;

    int tableOffset = 0;

    // calculate offsets and draw cake
    if(cakeSize <= modifiedWidth){
      draw((modifiedWidth - cakeSize) / 2);
    }
    else{
      tableOffset = (cakeSize - modifiedWidth) / 2;
      draw();
    }

    // draw table
    String[][] viewArray = Renderer.initializeArray(modifiedWidth, " ");

    table.verify();

    for (int i = 0; i < table.legs; i++) {
      for (int y = 0; y < table.height; y++) {
        viewArray[y][i * widthPerLeg + (widthPerLeg / 2)] = table.legCharacter;
      }
    }

    for (int x = 0; x < modifiedWidth; x++) {
      viewArray[0][x] = table.topCharacter;
    }

    Renderer.printArray(viewArray, tableOffset);
  }
}
