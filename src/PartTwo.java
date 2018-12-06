// Nickolas Gadomski

import java.util.ArrayList;
import java.util.List;


/**
 * second term concepts and java code
 * 
 * @author Nickolas Gadomski
 *
 */
public class PartTwo {
  /**
   * main method code demonstrates the following concepts,
   * <p>
   * while, do while, and for loops
   * <p>
   * arrays
   * <p>
   * poly-morphism
   * <p>
   * inheritance
   * <p>
   * constructors
   * 
   * @param <Triangle>
   * 
   * @param args
   */
  public static void main(String[] args) {

    // while loop
    int count = 5;
    int iteration = 1;
    while (count != 0) {

      System.out.printf("(WHILE) This is iteration #%2d , variable count is %2d %n", iteration,
          count);
      iteration++;

      count--;
    }

    System.out.println("The loop finished when count == 0");
    iteration = 1;

    // Do while loop
    iteration = 1;
    count = 5;
    do {

      System.out.printf("(DO-WHILE) This is iteration #%2d , variable count is %2d %n", iteration,
          count);
      count--;
      iteration++;
    } while (count != 0);

    System.out.println("The DO-WHILE loop finished when count == 0");

    count = 12;

    // for loop
    for (int i = 0; i < 5; i++) {
      System.out.printf("(FOR) This is iteration #%2d , variable i is %2d %n", iteration, i);

    }

    System.out.println("The FOR loop finished when i == 0");

    // For each
    int[] numbersBreak = {10, 20, 30, 40, 50};
    for (int x : numbersBreak) {
      if (x == 50) {
        break;// breaks out of outer loop
      }
      System.out.print(x);
      System.out.print("\n");

    }

    System.out.println("The foreach loop finished "
        + "at the third index [2]. If x = 50 then break.");
    int[] numbers = {10, 20, 30, 40, 50};
    for (int xx : numbers) {
      if (xx == 50) {
        continue; // skips current iteration of loop
      }
      System.out.print(xx);
      System.out.print("\n");

    }
    System.out.println("The foreach loop finished completely " + "If x = 50 then continue.");

    // Array to get sum and smallest value
    int arr[] = {62, 84, 6, 25, 55};
    System.out.println("int arr[] = {62, 84, 6, 25, 55}");
    int smallest = getSmallest(arr); // smallest value
    System.out.println("smallest value of arr[] = " + smallest);
    int sumOfArray = getArraySum(arr); // sum of array
    System.out.println("sum of arr[] = " + sumOfArray);

    // Two-dimensional Array
    int[][] mrr = new int[4][7];

    System.out.println("int[][] mrr = new int[4][7] MEANS 4 ROW 7 COLUMNS");
    for (int i = 0; i < mrr.length; i++) {
      for (int j = 0; j < mrr[i].length; j++) {
        mrr[i][j] = j;

        System.out.print(mrr[i][j] + " ");
      } // for nested
      System.out.println("");
    } // for
    List<String> stringList = new ArrayList<String>();

    stringList.add("Nick");
    stringList.add("is");
    stringList.add("Male");
    stringList.add("I am the last value.");

    java.util.Iterator<String> iterate = stringList.iterator();

    while (iterate.hasNext()) {
      System.out.println(iterate.next());
    }

    searchArrays(mrr, 6);
    System.out.println("This line above me, searched all cells that contain 6");

    String firstName = "Nickolas";
    String lastName = "Gadomski";

    SeparateFile myNameNick = new SeparateFile(firstName, lastName); // instantiate
    System.out.println(myNameNick.getFirstName() + " from getter getFirstName().");
    System.out.println(myNameNick.getLastName() + " from getter getLastName().");
    myNameNick.printName();
    System.out.println(" from calling the void method printName() \n");

    firstName = "Joshua";
    SeparateFile myNameJosh = new SeparateFile(firstName); // calling
    // overloaded
    // constructor
    myNameJosh.printName();
    System.out.println("from calling the void method printName() \n");

    myNameJosh.setLastName("Gadomski");
    myNameJosh.printName();

    SeparateFile myNameNull = new SeparateFile();
    System.out.println(myNameNull.getFirstName()); // calling no args
    // constructor

    int len = 12;
    int high = 13;
    int base = 14;
    Rectangle myRect = new Rectangle(len, high); // instantiated a subclass that will use methods
                                                 // from superclass (very important indeed)
    Triangle myTri = new Triangle(len, high, base);

    System.out.println(myRect.getArea()
        + " the subclass Rectangle used getArea() from the superclass Polygon.");
    System.out.println(myTri.getArea()
        + " the subclass Triangle used getArea() from the superclass Polygon.");

    Polygon[] polys = {myRect, myTri}; // polymorphism - store related objects in an array



    for (Polygon poly : polys) {
      System.out.println(poly.getArea() + " from polymorphism array foreach loop.");
    }
  } // polymorphism


  /**
   * array for finding smallest integer
   * 
   * @param a
   * @return smallest integer
   */
  public static int getSmallest(int[] a) {
    int temp;
    for (int i = 0; i < a.length - 1; i++) // selection sort gets smallest
    // by first index
    {
      for (int j = i + 1; j < a.length - 1; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    return a[0];
  }

  /**
   * array for finding sum
   * 
   * @param a
   * @return total sum of array
   */
  public static int getArraySum(int[] a) {
    int total = 0;
    for (int i = 0; i < a.length; i++) {
      total = total + a[i]; // accumulator
    }

    return total;

  }

  /**
   * method to search arrays
   * 
   * @param a
   * @param k
   */
  public static void searchArrays(int[][] a, int k) {

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == k)
          System.out.printf(a[i][j] + " (%d,%d) \n", i, j);
      }
    }
  }
}


// main class
/**
 * polygon class to set dimensions
 * 
 * @author Nickolas Gadomski
 *
 */

class Polygon {

  private double base;
  private double width;
  private double height;


  public Polygon(double x, double y, double z) {
    this.base = x;
    this.width = y;
    this.height = z;

  }


  public Polygon(double x, double y) {
    this.base = x;
    this.width = y;

  }

  public Polygon(double x) {
    this.base = x;

  }

  public double getBase() {
    return base;
  }

  public void setBase(double x) {
    this.base = x;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double y) {
    this.width = y;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double z) {
    this.height = z;
  }

  public double getArea() {
    return this.base * this.width;
  } // rectangle

}


/**
 * Rectangle is a subclass of Polygon.
 */
class Rectangle extends Polygon { // inheritance means you don't have to declare methods that can be
                                  // recycled!


  public Rectangle(double x, double y) {
    super(x, y);


  }

  public Rectangle(double x) {
    super(x);


  }



}


/**
 * subclass of Polygon. A Triangle is a Polygon.
 */
class Triangle extends Polygon {

  public Triangle(double x, double y, double z) {
    super(x, y, z);
  }

  public double getArea() {
    return (.5 * (getBase() * getHeight()));
  }

}
