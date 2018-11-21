/*
 * Created by: Nickolas Gadomski
 * This program is a launcher that will
 * launch the required instructions of
 * the whole integration project.
 */
import java.util.Scanner;

public class Launcher {

	public static Scanner kb = new Scanner(System.in);

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