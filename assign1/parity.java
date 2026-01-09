/*
    2.25: Even or Odd
    Accept an integer from the user and determine whether it is even or odd.
*/

import java.util.Scanner;

public class parity
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        String result = (number % 2 == 0) ? "even" : "odd";

        System.out.println(number + " is " + result + ".");
    }
}