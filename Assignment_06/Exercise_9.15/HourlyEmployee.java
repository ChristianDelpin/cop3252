public class HourlyEmployee extends Employee
{
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) 
    {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }
    public void setWage(double wage)
    {
        if(wage >= 0.0)
            this.wage = wage;
        else
            throw new IllegalArgumentException("Wage must be >= 0.0");
    }
    public double getWage()
    {
        return wage;
    }

    public void setHours(double hours)
    {
        if(hours >= 0.0 && hours <= 168.0)
            this.hours = hours;
        else
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
    }

    public double getHours()
    {
        return hours;
    }

    public double earnings()
    {
        if(hours <= 40)
            return wage * hours;
        else
            return (40 * wage) + ((hours - 40) * wage * 1.5);
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
         "hourly employee", getFirstName(), getLastName(),
         "social security number", getSocialSecurityNumber(),
         "hourly wage", getWage(),
         "hours worked", getHours());
    }
}