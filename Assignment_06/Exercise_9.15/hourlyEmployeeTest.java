public class hourlyEmployeeTest
{
    public static void main(String[] args)
    {
        HourlyEmployee e1 = new HourlyEmployee(
            "Alice",
            "Doe", 
            "123-45-6789", 
            40, 
            15.0);

        HourlyEmployee e2 = new HourlyEmployee(
            "Bob",
            "Smith",
            "000-00-0000",
            0,
            20.50);
        System.out.println("--- e1 ---\n" + e1);
        System.out.println("Earnings for e1:\n" + e1.earnings());

        System.out.println("\n--- e2 ---\n" + e2);
        System.out.println("\n\nEarnings for e2:\n" + e2.earnings());
        

        // Overtime; should = 40*wage + 60*wage
        e2.setHours(100);
        
        System.out.println("\n--- e2 ---\n" + e2);
        System.out.println("Earnings for e2 with  60h overtime:\n" + e2.earnings());

        // Invalid cases. Comment out each line to test further cases.

        //Negative Values
        e2.setHours(-1);
        e2.setWage(-1);

        //Too-large values
        e2.setHours(169);

    }
}