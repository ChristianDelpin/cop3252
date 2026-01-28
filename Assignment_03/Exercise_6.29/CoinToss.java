public class CoinToss
{
    public enum CoinSide
    {
        HEADS,
        TAILS
    }

    public static CoinSide flip()
    {
        if (Math.random() < 0.5)
            return CoinSide.HEADS;
        else
            return CoinSide.TAILS;
    }

    public static void main(String[] args)
    {
        int choice = -1;

        while (choice != 0)
        {
            System.out.println("Menu:");
            System.out.println("0 - Exit");
            System.out.println("1 - Toss coin");
            System.out.print("Enter your choice: ");
            choice = new java.util.Scanner(System.in).nextInt();
            switch (choice)
            {
                case 0:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Coin toss result: " + flip());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}