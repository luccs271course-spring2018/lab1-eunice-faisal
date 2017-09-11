package hw;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	//	final HelloWorld instance = new HelloWorld();
	//	System.out.println(instance.getMessage());
	//	System.out.println(instance.getYear());

		int n = Integer.parseInt(args[0]);
		//String[] myArray;
		//myArray = fizzBuzzArray(n);
		fizzBuzzList(n);

		/*final String[] abc = { "-10", "b", "c" };
		assertEquals(new String[] { "a", "b" },
				Arrays.asList(Arrays.copyOfRange(abc, 0, 2)));
*/
	}
	public static List<String> fizzBuzzList(final int n) {
		List myList = new ArrayList();

		for(int i = 0; i <= n; i++) {

			if (i % 3 == 0 && i % 5 != 0) {
				myList.add("fizz");
			} else if (i % 5 == 0 && i % 3 != 0) {
				myList.add("buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				myList.add("fizzbuzz");
			} else {
				myList.add(Integer.toString(i));
			}
		}
		return myList;
	}

	}

	/*
	public static String[] fizzBuzzArray(final int n) {

		String[] myArray;
		myArray = new String[n+1];

		for(int i = 0; i <= n; i++) {

			if (i % 3 == 0 && i % 5 != 0) {
				myArray[i] = "fizz";
			} else if (i % 5 == 0 && i % 3 != 0) {
				myArray[i] = "buzz";
			} else if (i % 3 == 0 && i % 5 == 0) {
				myArray[i] = "fizzbuzz";
			} else {
				myArray[i] = Integer.toString(i);
			}
		}

		/*for(int j = 0; j <= n; j++){
			System.out.println(myArray[j]);
		}*/
	//	return myArray;
	//}


