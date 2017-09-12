package hw;


public class Main {

    public static void main(String[] args) {
        //	final HelloWorld instance = new HelloWorld();
        //	System.out.println(instance.getMessage());
        //	System.out.println(instance.getYear());

        //Saves first integer argument from command line to "n"
        int n = Integer.parseInt(args[0]);

        //Call the function fizzBuzzArray with the given argument
        fizzBuzzArray(n);


    }

    public static void fizzBuzzArray(final int n) {


        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else {
                System.out.println(i);
            }
        }

    }
}


