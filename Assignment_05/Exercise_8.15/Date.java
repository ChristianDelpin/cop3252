class Date
{
    private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int year, month, day;
    
    public Date()
    {
        this(2000,1,1);
    }
    
    public Date(int year)
    {
        this(year, 1,1);
    }
    
    public Date(int year, int month)
    {
        this(year, month,1);
    }

    public Date(int year, int month, int day)
    {
        if (month <= 0 || month > 12) 
        {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }
        
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) 
        {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) 
        {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        if (year<0)
        {
            throw new IllegalArgumentException("year (" + year + ") must be non-negative.");
        }
   
      this.month = month;
      this.day = day;
      this.year = year;
    }

    public String toString()
    {
        String[] monthName = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        String t = String.format("%02d/%02d/%04d", month, day, year);
        t = t + "\n" + String.format("%s %01d, %01d", monthName[month], day, year);
        int numDaysInYear = day;
        for(int i=1; i<month; i++)
        {
            numDaysInYear+=daysPerMonth[month];
        }
        t = t + "\n" + String.format("%03d %04d", numDaysInYear, year);
        return t;
    }
}