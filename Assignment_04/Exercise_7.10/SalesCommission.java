public class SalesCommission
{
    public static void main(String[] args)
    {
        //sales reps receive $200 + 9% gross sales for the week

        int[] salesArray = {5000,7000,5500,10500,2000,4000,4500,8000,11000,6000};
        int baseSalary = 200;
        double commissionRate = 0.09;

        /*
            ranges
           [0] $200-$299
           [1] $300-$399
           [2] $400-$499
           [3] $500-$599
           [4] $600-$699
           [5] $700-$799
           [6] $800-$899
           [7] $900-$999
           [8] $1000 and over
         */
        int[] salaryRanges = new int[9]; // holds the num of reps who make sales in respective ranges

        for(int sale : salesArray)
        {
            int total = baseSalary + (int)(sale*commissionRate);
            if(total >= 1000)
                salaryRanges[8]++;
            else
            {
                int index = (total - 200) / 100;
                salaryRanges[index]++;
            }
            
        }

        //results
        System.out.println("Range      |   Num\n------------------");
        for(int i = 0; i < salaryRanges.length; i++)
        {

            switch(i)
            {
                case 0:
                    System.out.print("$200-299");
                    break;
                case 1:
                    System.out.print("$300-399");
                    break;
                case 2:
                    System.out.print("$400-499");
                    break;
                case 3:
                    System.out.print("$500-599");
                    break;
                case 4:
                    System.out.print("$600-699");
                    break;
                case 5:
                    System.out.print("$700-799");
                    break;
                case 6:
                    System.out.print("$800-899");
                    break;
                case 7:
                    System.out.print("$900-999");
                    break;
                case 8:
                System.out.print("$1000+  ");
                    break;
            }
            System.out.println("   |   " + salaryRanges[i]);
        }
    }
}