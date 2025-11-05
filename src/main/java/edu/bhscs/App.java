package edu.bhscs;

public class App {
  public static void main(String[] args){
    date10_27();
  }

  public static void date10_27() {
    Baker bob = new Baker("Bob");
    Table t = new Table(3, 30);
    Cake bDay = bob.bakes(10, "Suzzie");
    bDay.draw(t);
  }
}
