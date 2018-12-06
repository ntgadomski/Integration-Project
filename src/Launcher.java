/*
 * Created by: Nickolas Gadomski This program is a launcher that will launch the required
 * instructions of the whole integration project. Show cases concepts and Java code learned from COP
 * 2006
 */
import java.util.Scanner;

/**
 * Starts scanner and launches code also utilizes exception
 * 
 * @author Nikolas Gadomski
 *
 */
public class Launcher {
  /**
   * main method
   */
  public static Scanner kb = new Scanner(System.in);

  /**
   * utilizes scanner object
   * @param args
   */
  public static void main(String[] args) {


    int key;
    System.out.println("HI VANSELOW!, WELCOME TO THE INTEGRATION PROJECT.");
    System.out.println("Enter 1 for PART ONE \nEnter 2 for PART TWO");

    try {
      while (true) {
        key = kb.nextInt();
        if (key == 1) {
          PartOne.main(args);
        } else if (key == 2) {
          PartTwo.main(args);
        } else {
          System.out.println("There are only two options, TRY AGAIN");
        }
      } // try

    } catch (Exception e) {
      System.err.println("ERROR ENTRY MUST BE INT RUN PROGRAM AGAIN");
      PartOne.main(args);

    } // catch
  }
}
