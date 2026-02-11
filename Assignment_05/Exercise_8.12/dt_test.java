class dt_test
{
    public static void main(String[] args) 
    {
        DateAndTime dt = new DateAndTime(2000, 12, 31, 23, 59, 59);
        
        System.out.println("Initial Date and Time:\t" + dt);
        
        dt.tick();
        
        System.out.println("After tick():\t\t" + dt);

    }
}