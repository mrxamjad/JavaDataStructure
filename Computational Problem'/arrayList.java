import java.util.Scanner;
import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);

		// System.out.println("How many Number do you want to enter");
		// int n = sc.nextInt();

		ArrayList<String> arr = new ArrayList<String>(10);
		// System.out.println("Now Enter " + n + " String");

		// for (int i = 0; i < n; i++) {

		// arr.add(sc.nextLine());
		// }

		arr.add("Amjad");
		arr.add("Rustam");
		arr.add("Khushal");
		arr.add("Saddam");
		arr.add("Sahil");
		arr.add("Saif");
		arr.add("Irshad");
		arr.add("Zamal");
		arr.add("Afroz");
		arr.add("Tausif");

		// add the element by index
		// arr.add(11, "MRX");

		// Remove
		arr.remove("Tausif");

		// clear
		// arr.clear();

		// get the index
		System.out.println(arr.get(8));

		// set the value
		System.out.println(arr.set(7, "Rosy"));

		System.out.println(arr);

		System.out.println("Printing the ArrayList using iteration");
		// Iterator itr = arr.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		// }

		System.out.println(arr.contains("Amjad"));
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());

		System.out.println("Printing the ArrayList using for Loop");
		for (String x : arr) {
			System.out.println(x);
		}

		sc.close();
	}
}