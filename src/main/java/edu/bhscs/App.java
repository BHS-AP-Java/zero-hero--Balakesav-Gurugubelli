package edu.bhscs;

public class App {
  public static void main(String[] args){
    date10_27();
  }

  public static void date10_27() {
    Baker bob = new Baker("Bob");
    Table t = new Table(10, 20);
    Cake bDay = bob.bakes(10, "Suzzie");
    bDay.size = 5;
    bDay.setColor("#");
    bDay.draw(t);
  }
}
