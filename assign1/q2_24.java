/*
    2.24: Largest and Smallest Integers
    Accept 3 integers from the user, then determine and display the largest and smallest integers.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class q2_24
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

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}