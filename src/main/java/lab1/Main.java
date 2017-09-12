package lab1;


public class Main {

    public static void main(String[] args) {
        //	final HelloWorld instance = new HelloWorld();
        //	System.out.println(instance.getMessage());
        //	System.out.println(instance.getYear());


		//Comment to grader: at this point, I had to eddit build.gradle adding a "run"
		//					 branch and then running the project using command:-
		//					 > ./gradlew run -PappArgs="['17']"
		//					 in order to build successfully.
		
		
        //Saves first integer argument from command line to "n"
        int n = Integer.parseInt(args[0]);

        //Call the function fizzBuzzArray with the given argument
        //fizzBuzzArray(n);

        //Create string array to take the returned value from fizzBuzzArray(n)
        String[] myArray1;
        myArray1 = fizzBuzzArray(n);

		/*
		//testing with assert
		testArray = [-10,-1,0,1,7,17];
		
		for(int i = 0; i <= testArray.length; i++){
            assert fizzBuzzArray(testArray[i]) ==;
        }*/
    }

    public static String[] fizzBuzzArray(final int n) {

        
        // Check if n is valid
        if (n < 0){
            	System.out.println("Please enter valid number. ");
        }else{
        	
        	//create empty local array
        	String[] myArray;
        	
        	//set its size to endpoint of numbers + 1 (n+1)
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
        
			//prints array items just to debug
        	for(int j = 0; j <= n; j++){
            	System.out.println(myArray[j]);
        	}
        	return myArray;

		}
		return null;
    }
}


