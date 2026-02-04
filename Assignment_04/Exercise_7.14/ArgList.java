public class ArgList
{
    public static void main(String[] args)
    {
        if(args.length < 2)
        {
            System.out.println("Not enough arguments passed. \nUsage: `ArgList <int> <int> [int] ...` where at least 2 arguments must be passed. ");
            System.exit(1);
        }
        int total = Integer.parseInt(args[0]);
        for(int i=1;i<args.length;i++)
        {   
            total = product(total, Integer.parseInt(args[i]));
        }
        System.out.println("The total is: " + total);
    }
    public static int product(int a, int b)
    {
        return a*b;
    }
}