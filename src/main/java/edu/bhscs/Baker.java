// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/26

/*
 * DESCRIPTION: Mr. Reiber's baker class
 *
 * INPUT: Questions about the cake and where the baker lives
 * OUTPUT: Print where the baker works
 * EDGE CASE: User types something other than yes or no
 */

package edu.bhscs;

// :(

public class Baker {
  // PROPERTIES AND FIELDS
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;
  String name;
  int skill;

  // CONSTRUCTOR
  Baker(Player p, String name) {
    this.p = p;
    this.name = name;
  }

  public Baker(String name) {
    this.p = new Player();
    this.name = name;
  }

  // METHODS
  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you you want?");
    return new Cake(5, "#", "~", answer, this.f, skill);
  }

  // reiber date10_27
  Cake bakes(int width, String name) {
    return new Cake(width, name);
  }

  public void gainSkill(int amount) {
    skill += amount;
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere =
        this.p.giveAnswer("Do you want to work at " + bakery.getName() + "? (y/n)");
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }
}
