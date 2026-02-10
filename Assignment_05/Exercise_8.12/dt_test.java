class dt_test
{
    public static void main(String[] args) 
    {
        DateAndTime dt = new DateAndTime(12, 31, 2014, 23, 59, 59);
        
        System.out.println("The initial date and time is: " + dt);
        
        dt.tick();
        
        System.out.println("After incrementing the second by one: " + dt);
    }
}