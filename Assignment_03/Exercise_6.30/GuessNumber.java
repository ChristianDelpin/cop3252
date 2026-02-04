import java.util.Scanner;
public class GuessNumber
{
    public static void main(String[] args)
    {
        int secretNumber = (int)(Math.random() * 1000) + 1; // Random number between 1 and 1000
        int guess = -1;
        Scanner input = new Scanner(System.in);
        while(guess != secretNumber)
        {
            System.out.print("\nEnter your guess (1-1000): ");
            guess = input.nextInt();
            if(guess>secretNumber)
            {
                System.out.println("Too high, try again");
            }
            else if(guess<secretNumber)
            {
                System.out.println("Too low, try again.");
            }
        }
        System.out.println("Congratulations! You guessed the number!");
    }
}