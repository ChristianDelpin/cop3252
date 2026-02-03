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
            // given input: 1 2 3 4 5 
            // do I calculate 1*2*3*4*5
            // or do I calculate 1*2 2*3 3*4 4*5
            // or do I do 1*2 3*4
            
            //for now gonna do 1*2*3*4*5
            
            total = new ArgList().product(total, Integer.parseInt(args[i]));

        }
        System.out.println("The total is: " + total);
    }
    public int product(int a, int b)
    {
        return a*b;
    }
}