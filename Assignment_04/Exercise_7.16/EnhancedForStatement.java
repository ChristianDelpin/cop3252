public class EnhancedForStatement
{
    public static void main(String[] args)
    {
        if(args.length < 2)
        {
            System.out.println("Not enough arguments passed. \nUsage: `EnhancedForStatement <double> <double> [double] ...` where at least 2 arguments must be passed.");
            System.exit(1);
        }

        double sum = 0.0;
        for(String arg : args)
        {
            sum += Double.parseDouble(arg);
        }
        System.out.println("Sum: " + sum);
    }
}