
//Edward Marquez
import java.util.Scanner;

public class Intergrate {
  // variables the location of memory
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numberSwitch;
    boolean out = true;
    int count = 0;
    while (out == true) {
    count++;
    // checking to see if the count is equal to 1 if it is say one thing else
    // say another thing
    // Menu starting:
    if (count == 1) {
    System.out.println("What would you like to Learn about Java Today!?");
    } else {
    System.out.println("What else would you like to learn?");
    }

    System.out.println("Type in a number 1 - 10 to " + "choose what you would like to learn...");
    System.out.println("or 11 to leave the program!");
    System.out.println("1. How printing out to console works.");
    System.out.println("2. What is a variable and how it works.");
    System.out.println("3. Math Operators.");
    System.out.println("4. Integer Division");
    System.out.println("5. Classes and Methods");
    System.out.println("6. While and For Loops");
    System.out.println("7. Array's");
    System.out.println("8. Accessors and Mutators");
    System.out.println("9. String Processing");
    System.out.println("10");
    System.out.println("11. Exit");
    System.out.print("Number : ");
    numberSwitch = scan.nextInt();
    System.out.println("");

    switch (numberSwitch) {
      // explain of how printing to console works.
      case 1:
        /* this is a call */ LearningMenu.demoConsole/* this is a argument */();
        break;

      // explain of what a Variable is and how a variable is the location of
      // memory
      case 2:
        LearningMenu.demoVariable();
        break;

      // Explain of what the Operators are and how they are used
      case 3:
        LearningMenu.demoOperators();
        break;

      // Learning about integer division
      case 4:
        LearningMenu.demoIntegerDivision();
        break;

      // Learned about classes and pointers
      case 5:
        LearningMenu.demoClasses();
        break;
      // Learned about For and do-while loops
      case 6:
        LearningMenu.demoForWhileLoop();
        break;
      // Learned about arrays and how they are used
      case 7:
        LearningMenu.demoArrays();
        break;
      // Learned the importance of getters and setters.
      case 8:
        LearningMenu.demoGetterSetter();
        break;

      case 9:
        LearningMenu.stringProssesDemo();
        break;

      case 10:
        break;

      case 11:
        System.out.println("Thank you for using my program! ");
        out = false;
        break;

      default:
        System.out.println("Did not recongnize value, please try again. ");
        System.out.println("");
        System.out.println("Please press enter to continue...");
        System.out.println("");
        break;
    }
    scan.nextLine();
    scan.nextLine();
    }
    scan.close();
  }

}