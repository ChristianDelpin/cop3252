class DateTest
{
    public static void main(String[] args)
    {
        Date d1 = new Date();
        Date d2 = new Date(2001);
        Date d3 = new Date(2002, 02);
        Date d4 = new Date(2003, 03, 03);

        System.out.println(d1 + "\n");
        System.out.println(d2+ "\n");
        System.out.println(d3+ "\n");
        System.out.println(d4);
    }
}