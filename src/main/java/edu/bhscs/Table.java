package edu.bhscs;

// reiber date10_27
public class Table {
  public int height;
  public int legs;

  public String legCharacter;
  public String topCharacter;

  public Table(int height, int legs) {
    this.height = height;
    this.legs = legs;
  }

  // why is it called set legs and not set leg character cuz were not setting the legs
  public void setLegs(String legCharacter){
    this.legCharacter = legCharacter;
  }

  public void setTop(String topCharacter){
    this.topCharacter = topCharacter;
  }

  public void verify(){
    if(legCharacter == null){
      legCharacter = "|";
    }

    if(topCharacter == null){
      topCharacter = "_";
    }
  }
}
