/*
    2.17: Arithmetic, Smallest, and Largest
    Accept 3 integers from the user, then display the following:
    - Sum of all numbers
    - Average of all numbers
    - Product of all numbers
    - Smallest number
    - Largest number
*/

// Tentatively complete. Not sure if Lists are allowed.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class q2_17
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(3);

        while(numbers.size() < 3)
        {
            System.out.print("Enter number " + (numbers.size() + 1) + ": ");
            numbers.add(input.nextInt());
        }
        
        // sum
        int sum = 0;
        for(int num : numbers)
        {
            sum += num;
        }

        // average
        int avg = sum/numbers.size();

        // product
        int product = 1;
        for(int num : numbers)
        {
            product *= num;
        }

        // smallest
        int smallest = numbers.get(0);
        for(int num : numbers)
        {
            if(num < smallest)
            {
                smallest = num;
            }
        }

        // largest
        int largest = numbers.get(0);
        for(int num : numbers)
        {
            if(num > largest)
            {
                largest = num;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}