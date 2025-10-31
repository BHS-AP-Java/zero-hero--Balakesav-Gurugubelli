package edu.bhscs;

public class Renderer {
  public static String[][] initializeArray(int arraySize, String character) {
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

  public static String[][] initializeArray(int xSize, int ySize, String character) {
    String[][] array = new String[ySize][xSize];

    for (int y = 0; y < ySize; y++) {
      String[] row = new String[xSize];
      for (int x = 0; x < xSize; x++) {
        row[x] = character;
      }

      array[y] = row;
    }

    return array;
  }

  public static void printArray(String[][] array) {
    for (int y = 0; y < array.length; y++) {
      for (int x = 0; x < array.length; x++) {
        System.out.print(array[y][x]);
      }

      System.out.println();
    }
  }
}
