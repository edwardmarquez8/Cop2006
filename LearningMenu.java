//Edward Marquez

public class LearningMenu {
  private static int arrayLength = 4;

  static void demoConsole() {
    System.out.println("Printing to console is simply written.");
    System.out.println("To write to console you" + " must first however learn to create a class file");
    System.out.println("which all you need to do is " + "have a public class (name) written on ");
    System.out.println("top with {} after and after" + " that write out public static void main(args)");
    System.out.println("once then inside of " + "main {} you can write System.out.println();");
    System.out.println("this line will print out to the screen");
    System.out.println("however depending on inside the () it can be anything ");
    System.out.println("from a string to a variable");
    System.out.println("");
    System.out.println("Please press enter to continue...");
    System.out.println("");

  }

  static void demoVariable() {
    System.out.println("All variables must be declared before they can be used");
    System.out.println("for example I will declare a integer and name it " + "number");
    System.out.println("and assign it the number 0 to start");
    int number = 0;
    System.out.println("integer # is : " + number);
    System.out.println("This is one example of what is know as primitive data " + "types.");
    System.out.println("there are 8 primitive data types: ");
    System.out.println("");
    System.out.println("1. byte: 8-bit signed two's complement integer, ");
    System.out.println("minimum value of -128 and max value of 127 (inclusive), ");
    System.out.println("useful for saving memory in large arrays, ");
    System.out.println("limits help you clarify your code");
    System.out.println("");
    System.out.println("2. short: 16-bit two's complement integer, ");
    System.out.println("minimum value of -32,768 and max value of " + "32,767. ");
    System.out.println("useful to save memory in large array's");
    System.out.println("");
    System.out.println("3. Integer: 32-bit-signed two's complement integer, ");
    System.out.println("minimum value of -2^31 and max value is 2^31 - 1 ");
    System.out.println("use the integer class to use int data type as an " + "unsigned integer,");
    System.out.println("use of static methods like comparing unsigned, " + "divid unsigned");
    System.out.println("etc, are in Integer class to support arithmetic " + "operations.");
    System.out.println("");
    System.out.println("4. long: 64 bit two's complement integer.");
    System.out.println("min value is -2^63");
    System.out.println("max value is 2^36 - 1");
    System.out.println("use when need a range of values wider " + "then those provided by int.");
    System.out.println("long class contains methods like compare unsigned, " + "divide unsigned, ");
    System.out.println("etc, to support arithmetic operations.");
    System.out.println("");
    System.out.println("5. float: single-perciion 32 bit IEEE 754 floating point.");
    System.out.println("specified in floating-point types, formats, " + "and values.");
    System.out.println("use float (instead of double) if you need " + "to save memory in large arrays.");
    System.out.println("this data type should never be used for precise values " + "such as currency.");
    System.out.println("for that use the java.math.BigDecimal class instead.");
    System.out.println("");
    System.out.println("Please press enter to continue...");
    System.out.println("");

  }

  static void demoOperators() {
    System.out.println(" Operators are used for math operations");
    System.out.println("all of this consist of adding, " + "subtracting, multiplying, and dividing");
    // Three variables..
    System.out.println("collecting data for the integer's...");
    int a = 6;
    int b = 3;
    System.out.println("doing adding, subtracting, dividing, and" + " multiplying,");
    System.out.println("a, and b calculating results for solution...");
    int c = a + b;
    System.out.println("addition result:" + c);
    c = a - b;
    System.out.println("subtracting result:" + c);
    c = a / b;
    System.out.println("division result:" + c);
    c = a * b;
    System.out.println("multiplication result: " + c);
    System.out.println("Java also has the ability to increment");
    System.out.println("a data type such as int a = 6 to" + " be a value of 7 by using ++");
    System.out.println("incrementing....");
    a++;
    System.out.println("value of a: " + a);
    System.out.println("you can decrement by" + " subtracting by one by using --");
    a--;
    System.out.println("value of a: " + a);
    System.out.println("you can use also <(less than)" + " , >(greater than) ,");
    System.out.println("<= (less then equal to) , >=(greater than equal too)");
    System.out.println("or ==(Comparing variables)");
    System.out.println("");
    System.out.println("Please press enter to continue...");
    System.out.println("");

  }

  static void demoIntegerDivision() {
    System.out.println("an integer is a number such as 1, 2 , 3.etc. ");
    System.out.println("when divided such as 2/3 it should" + " give you a decimal correct?");
    System.out.println("Well when the data type is an integer" + " it only gives back an integer");
    System.out.println("the way to get those extra numbers" + " you are missing is to use a Double or Float");
    System.out.println("for example: 2/3");
    double num1 = 2;
    double num2 = 3;
    System.out.println("Calculating...");
    double answe = num1 / num2;
    System.out.println("Answer:" + answe);
    System.out.println("Please press enter to continue...");
    System.out.println("");
  }

  static void demoClasses() {
    System.out.println("*Modifiers—such as public, private," + " and others you will learn about later");
    System.out.println("The return type—the data type of the value returned by the method, or");
    System.out.println("void if the method does not return a value.");
    System.out.println("*The method name—the rules for field names apply to method names ");
    System.out.println("as well, but the convention is a little different.");
    System.out.println("The parameter list in parenthesis—a comma-delimited list of input parameters");
    System.out.println("preceded by their data types, enclosed by parentheses, ().");
    System.out.println("if there are no parameters, you must use empty parentheses.");
    System.out.println("An exception list");
    System.out.println("");
    System.out.println("Please press enter to continue...");
    System.out.println("");
  }

  static void demoForWhileLoop() {
    System.out.println("A while loop evaluates expression" + ", which must return a boolean value.");
    System.out.println("if the expression evaluates to" + "true, the statement continues testing.");
    System.out.println("the expression and executing its block until the expression evaulates to false.");
    System.out.println("");
    System.out.println("The Diffrence between a while and a do-while loop is that do while evaluates ");
    System.out.println("its expressions at the bottom of the loop instead of the top");
    System.out.println("a fun fact that you should know is that the 'do' will always be exucated " + "atleast once.");
    System.out.println("");
    System.out.println("The for statement provides a compact way to iterate over a range of values.");
    System.out.println(
        "the reason for the name for loop is because it repeatedly loops until a particular condition is satisfied");
    System.out.println("When using this version of the for statement, keep in mind that:");
    System.out.println("The initialization expression initializes the loop; it's executed once, as the loop begins,");
    System.out.println("When the termination expression evaluates to false, the loop terminates,");
    System.out.println("and The increment expression is invoked after each iteration through the loop;");
    System.out.println("it is perfectly acceptable for this expression to increment or decrement a value.");
    System.out.println("");
    System.out.println("Please press enter to continue...");
    System.out.println("");
  }

  static void demoArrays() {
    System.out.println("An array is a container object that holds a fixed number of values of a single type.");
    System.out.println("The length of an array is established when the array is created.");
    System.out.println("After creation, its length is fixed.");
    System.out.println("");
    System.out.println("An example of how an array is used with 4 integers 4,5,6,7");
    System.out.println("creating an array of the integers.");
    System.out.println("");
    int[] anArray = new int[LearningMenu.getArrayLength()];
    anArray[0] = 5;
    anArray[1] = 7;
    anArray[2] = 4;
    anArray[3] = 6;
    System.out.println("outputting the array! ");
    System.out.println("");
    for (int k = 0; k < LearningMenu.getArrayLength(); k++) {
    System.out.println(anArray[k] + " At postion " + k);
    }
    System.out.println("");
    System.out.println("Searching for 6 in the array!");
    LearningMenu.findNumber(6, anArray);
    System.out.println("Searching for 8 in the array!");
    LearningMenu.findNumber(8, anArray);
    System.out.println("finding Smallest Value in the Array!");
    LearningMenu.findSmallestValue(0, anArray);
    System.out.println("Finding Sum of values in the Array!");
    LearningMenu.sumOfArray(0, anArray);
    System.out.println("");
    System.out.println("Please press enter to continue...");
    System.out.println("");
  }

  static void demoGetterSetter() {
    System.out.println("There are Getters also known as Accessors.");
    System.out.println("and Setters which are also known as Mutators.");
    System.out.println("With java Getters and Setters are completely ordinary functions.");
    System.out.println("Getters: will get the value from the class and return it");
    System.out.println("Setters: will set the value from the class to the passed in argument.");
    System.out.println("An example of this is when i set a array length on private and have to set a getter");
    System.out
        .println("and setter for it so that the amount can changed or be munipulated but the array is protected.");
    System.out.println("");
    System.out.println("Please press enter to continue...");
    System.out.println("");
  }

  public static int getArrayLength() {
    return arrayLength;
  }

  public void setArrayLength(int arrayLength) {
    LearningMenu.arrayLength = arrayLength;
  }

  public static int findNumber(int a, int aArray[]) {
    boolean found = false;
    int i = 0;
    for (i = 0; i < LearningMenu.getArrayLength(); i++) {
    if (aArray[i] == a) {
    System.out.println("found " + a + "!");
    found = true;
    break;
    }

    }
    if (found) {
    System.out.println("Found " + a + " at position " + i + ".");
    } else {
    System.out.println(a + " is not found in array!");
    }
    return a;

  }

  public static int findSmallestValue(int value, int aArray[]) {
    value = aArray[0];
    int position = 0;
    int i;
    for (i = 0; i < LearningMenu.getArrayLength(); i++) {
    if (value > aArray[i]) {
    value = aArray[i];
    position = i;
    }
    }
    System.out.println("Smallest number in array is " + value + " at Position " + position);
    return value;
  }

  public static int sumOfArray(int a, int aArray[]) {
    int sum = 0;
    int i;
    for (i = 0; i < LearningMenu.getArrayLength(); i++) {
    sum = sum + aArray[i];
    }
    System.out.println("Sum of the array is " + sum);
    return a;

  }

  public static void stringProssesDemo() {
    System.out.println("Finding the Length of a String:");
    System.out.println("Creating a String name bandName with 'the who' stored in it.");
    String bandName = "The Who";
    System.out.println("Calculating Length of bandName");
    System.out.println("the Length of bandname is " + (bandName.length()));
    System.out.println("");
    System.out.println("Finding a Substring:");
    System.out.println("I will be using the bandName variable to seach for the the string 'Who'");
    int index = bandName.indexOf("Who");
    System.out.println("Please wait while Searching...");
    // used substring method after finding the index number.
    String newBandName = bandName.substring(0, index);
    System.out.println(" Found" + newBandName + " in the newBandName.");

    System.out.println("");
    System.out.println("Please press enter to continue...");
    System.out.println("");
  }
}
