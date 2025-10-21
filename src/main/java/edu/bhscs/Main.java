// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: A bake sale, with a baker, cake, customer, and PTSA.
 * The user plays as the baker and kills the evil cake.
 * Then, the customers come in because they are no longer scared of the cake and donate
 * money to the PTSA. Mr. Reiber is the head of the PTSA and gets the money.
 *
 * INPUT: User Input about what they want to do in the bakery
 * OUTPUT: Print the output based on what the user does
 * EDGE CASE: User types a non-integer value for the number of dollars.
 */

package edu.bhscs;

public class Main {
  public static void main(String[] args) {
    // Create a input class to get user input
    Input.Initialize();

    // Draw a test cake
    System.out.print("Cake Size: ");
    int size = Integer.parseInt(Input.GetInput());

    System.out.print("Cake Color: ");
    String color = Input.GetInput();

    Cake testcake = new Cake("chocolate", new Flour(10), 10, size, color, "~");

    // Initialize a cake with one of the CakeTypes enum values
    MyCake cake = new MyCake("round", CakeTypes.Vanilla, 10);

    // Initialize the baker
    MyBaker baker = new MyBaker(10, "Bob", 2);
    baker.Bake(cake);

    System.out.println("The cake is evil!");

    // A variable to tell the while loop when to stop executing the main game loop
    Boolean continueGame = true;

    // Print an introduction to the game for the user
    System.out.println("You are fighting a " + cake.getReadableName() + ".");
    System.out.println("'a'/'slash' for Slash, 's'/'shoot' for Shoot, 'quit' for Quit.");

    // Main game loop
    while (continueGame) {
      // Prompt user
      System.out.print("Choose your move: ");

      // Get user input
      String move = Input.GetInput();

      // Choose to either attack or quit based on what the user wants to do
      if (move.equals("a") || move.equals("slash")) {
        System.out.println("Swinging at the cake!");

        cake.HP -= baker.attackStrength;
        System.out.println("Cake HP remaining: " + cake.HP);
      } else if (move.equals("s") || move.equals("shoot")) {
        System.out.println("Shooting at the cake!");

        cake.HP -= baker.attackStrength;
        System.out.println("Cake HP remaining: " + cake.HP);
      } else if (move.equals("quit")) {
        System.out.println("Quitting.");
        continueGame = false;
      }
      // Check if the user did not pick a valid option
      else {
        System.out.println("That is not an option!");
      }

      // Check if the cake is dead
      if (cake.HP == 0) {
        // Start end scene
        System.out.println("Cake is dead! You win.");

        System.out.println("Here come the customers!");
        // Initialize a customer as it walks in the door. It arrives with a message for the baker.
        MyCustomer customer =
            new MyCustomer(
                "Thanks for killing the cake! I'm going to donate a magical number of dollars to the PTSA.");

        System.out.println();
        System.out.print("Here's what the customer has to say: ");
        customer.PrintMessage();

        System.out.print("Choose how much money to donate: ");
        String money = Input.GetInput();

        // Initialize a PTSA with the amount of money donated
        PTSA ptsa = new PTSA(Integer.parseInt(money), "Mr. Reiber");
        ptsa.PrintMoneyLevel();

        // Tell the outer loop to stop executing the loop
        continueGame = false;
      }
    }

    // Here is Mr. Reiber's baker class
    Player reiberPlayer = new Player();
    Baker reiberBaker = new Baker(reiberPlayer, "Benjamin");
    Customer reiberCustomer = new Customer("Chris");
    Store reiberStore = new Store("My House");

    reiberBaker.takeJob(reiberStore);
    reiberBaker.takeOrder(10, reiberCustomer);

    // Close our scanner
    Input.CloseScanner();
  }
}
