import java.util.*;
import java.util.concurrent.TimeUnit;

public class FibonacciSequence {

	public static void main(String args[]) {

		System.out.println("In mathehematics, the Fibonacci numbers, commonly denoted Fn, "
				+ "form a sequence, called the Fibonacci sequence,\n such that each number"
				+ " is the sum of the two preceding ones, starting from 0 and 1.\r\n");
		System.out.println("That is\r\n" + "    F0 = 0 , F1 = 1 \r\n" + "and\r\n" + "    Fn = Fn−1 + Fn−2  for n > 1.");
		System.out.println();
		System.out.println("This program show the first n numbers " + "of Fibonacci sequence.");

		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("Enter n: ");
		n = readNum(s);

		switch (n) {
		case 1:
			System.out.println("\nFirst number of Fibonacci sequence is 0.");
			break;
		case 2:
			System.out.println();
			System.out.println("\nFirst two numbers of Fibonacci sequence: 0, 1");
			break;
		default:
			showFib(n);
		}
		
		endProgram(s);
		s.close();
	}

	private static void showFib(int n) {
		int[] sirfib = new int[n];
		sirfib[0] = 0;
		sirfib[1] = 1;

		System.out.println("\nFirst " + n + " numbers of Fibonacci sequence:");
		System.out.print("0, 1");
		for (int i = 2; i < n; i++) {
			sirfib[i] = sirfib[i - 1] + sirfib[i - 2];
			System.out.print(", " + sirfib[i]);
		}
	}

	public static int readNum(Scanner s) {
		if (!s.hasNextInt()) {
			System.out.println("You must enter a number!");
			System.out.println("Enter the number: ");
			s.next();
			return readNum(s);
		}
		int n = s.nextInt();
		if (n <= 0) {
			System.out.println();
			System.out.println("\nIt has to be greater than zero!");
			System.out.print("Re-type the number: ");
			return readNum(s);
		}
		return n;
	}
	
	public static void endProgram(Scanner s) {
		System.out.println();
		System.out.println("If you want to exit the program, pres q!");
		String str = s.next();
		if (!str.contentEquals("q")) {
			endProgram(s);
		}
		System.out.println("Program terminated.");
// delaying 5 seconds before closing the program
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}