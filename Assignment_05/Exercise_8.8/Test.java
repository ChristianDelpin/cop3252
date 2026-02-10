class Test
{
    public static void main(String[] args)
    {
        Date date = new Date(1,1,2000);
        
        for (int i = 0; i < 1461; i++)
        {
            date.nextDay();
            System.out.println(date);
        }
    }
}