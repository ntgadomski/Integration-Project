//Nickolas Gadomski

import java.util.ArrayList;
import java.util.List;

public class PartTwo {

	public static void main(String[] args) {

		// while loop
		int count = 5;
		int iteration = 1;
		while (count != 0) {

			System.out
					.printf("(WHILE) This is iteration #%2d , variable count is %2d \n",
							iteration, count);
			iteration++;

			count--;
		}

		System.out.println("The loop finished when count == 0");
		iteration = 1;

		// Do while loop
		iteration = 1;
		count = 5;
		do {

			System.out
					.printf("(DO-WHILE) This is iteration #%2d , variable count is %2d \n",
							iteration, count);
			count--;
			iteration++;
		} while (count != 0);

		System.out.println("The DO-WHILE loop finished when count == 0");

		count = 12;

		// for loop
		for (int i = 0; i < 5; i++) {
			System.out.printf(
					"(FOR) This is iteration #%2d , variable i is %2d \n",
					iteration, i);

		}

		System.out.println("The FOR loop finished when i == 0");

		// For each
		int[] numbersBreak = { 10, 20, 30, 40, 50 };
		for (int x : numbersBreak) {
			if (x == 50) {
				break;
			}
			System.out.print(x);
			System.out.print("\n");

		}

		System.out.println("The foreach loop finished "
				+ "at the third index [2]. If x = 50 then break.");
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int xx : numbers) {
			if (xx == 50) {
				continue;
			}
			System.out.print(xx);
			System.out.print("\n");

		}
		System.out.println("The foreach loop finished completely "
				+ "If x = 50 then continue.");

		// Array to get sum and smallest value
		int arr[] = { 62, 84, 6, 25, 55 };
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
		System.out
				.println("This line above me, searched all cells that contain 6");

		String firstName = "Nickolas";
		String lastName = "Gadomski";

		SeparateFile myNameNick = new SeparateFile(firstName, lastName); // instantiate
		System.out.println(myNameNick.getFirstName()
				+ " from getter getFirstName().");
		System.out.println(myNameNick.getLastName()
				+ " from getter getLastName().");
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
		Rectangle myRect = new Rectangle(len, high); // instantiated a subclass
														// that will use methods
														// from superclass
		System.out
				.println(myRect.getArea()
						+ " the subclass Rectangle used getArea() from the superclass Square.");

	}

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

	public static int getArraySum(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i]; // accumulator
		}

		return total;

	}

	public static void searchArrays(int[][] a, int k) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == k)
					System.out.printf(a[i][j] + " (%d,%d) \n", i, j);
			}
		}
	}

} // main class

class Square {

	private double x;
	private double y;
	private double z;

	public Square(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;

	}

	public Square(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public Square(double x) {
		this.x = x;

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getArea() {
		return this.x * this.y;
	}

}

// polymorphism
class Rectangle extends Square {

	public Rectangle(double x, double y) {
		super(x, y); // polymorphism

	}

	public Rectangle(double x) {
		super(x);

	}

}

class Solve {

}
