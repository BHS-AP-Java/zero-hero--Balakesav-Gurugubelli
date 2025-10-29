package edu.bhscs;

// reiber date10_27
public class Table {
  public int height;
  public int legs;
  public int width;

  public String legCharacter;
  public String topCharacter;

  public Table(int legs, int width) {
    this.width = width;
    this.legs = legs;

    height = 5;
  }

  // why is it called set legs and not set leg character cuz were not setting the legs
  public void setLegs(String legCharacter) {
    this.legCharacter = legCharacter;
  }

  public void setTop(String topCharacter) {
    this.topCharacter = topCharacter;
  }

  public void setWidthPerLeg(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  // set default values for table leg and table top
  public void verify() {
    if (legCharacter == null) {
      legCharacter = "|";
    }

    if (topCharacter == null) {
      topCharacter = "_";
    }
  }
}
