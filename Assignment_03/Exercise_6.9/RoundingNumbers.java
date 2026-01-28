import java.util.Scanner;

public class RoundingNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to round: ");
        double number = input.nextDouble();
        double roundedNumber = Math.floor(number + 0.5);
        System.out.println("The rounded number is: " + roundedNumber);
        System.out.println("The original number is: " + number);
    }
}