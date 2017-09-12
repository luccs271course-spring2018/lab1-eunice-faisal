# Lab 1



### Discussion 1

What would be a really simple solution if n were not an argument, i.e., if it were always 17?

set a variable to hold n's value and pass it to the function.


##

### Discussion 2:
Discussion: How could you have automatically tested your initial
solution from part 2?

We couldn't figure out how to test using asserts. However, passing an array holding the arguments
to the function in a for loop could be a similar yet a least conveniant solution.

##
### Discussion 3:
What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?

The main code for all the parts stayed the same, we altered the structure but not the behavior.
For part 2 we had to prints the fizz buzz sequence up to n, one number per line, on the standard output but for part 3, we converted the command-line argument to a number and we used an array.
Also, since we are using arrays, we can't add to it after its size have been filled.
For part 4 we refactored our solution in part 3 by creating a list. The main differance between part 2 and part 3 and 4 is that in part 2 only prints the solution vs part 3 and 4 that prints and stores the solution.
We believe that it doesnt matter what list implementation we choose because they all have the same purpose, but we choose to use an ArrayList because with this lab we are adding to the list.
