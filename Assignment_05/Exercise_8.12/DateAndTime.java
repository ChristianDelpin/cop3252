class DateAndTime
{
   
   private int year, month, day, hour, minute, second;

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   public DateAndTime()
   {
      this(1, 1, 2000, 0, 0, 0);
   }

   public DateAndTime(int year)
   {
      this(year, 1, 1, 0, 0, 0);
   }

   public DateAndTime(int year, int month)
   {
      this(year, month, 1, 0, 0, 0);
   }

   public DateAndTime(int year, int month, int day)
   {
      this(month, day, year, 0, 0, 0);
   }

   public DateAndTime(int year, int month, int day, int hour)
   {
      this(year, month, day, hour, 0, 0);
   }

   public DateAndTime(int year, int month, int day, int hour, int minute)
   {
      this(year, month, day, hour, minute, 0);
   }

   public DateAndTime(int year, int month, int day, int hour, int minute, int second)
   {
      this.year = year;
      this.month = month;
      this.day = day;
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }

   public void nextDay()
   {
      if (day < daysPerMonth[month] || (month == 2 && day == 28 && isLeapYear())) {
         day++;
      } else {
         day = 1;
         if (month == 12) {
            month = 1;
            year++;
         } else {
            month++;
         }
      }
   }

   private boolean isLeapYear()
   {
      if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void tick()
   {
      if(second < 59)
         second++;
      else {
         second = 0;
         incrementMinute();
      }
   }

   public void incrementMinute()
   {
      if(minute < 59)
         minute++;
      else {
         minute = 0;
         incrementHour();
      }
   }

   public void incrementHour()
   {
      if(hour < 23)
         hour++;
      else
         hour = 0;
         nextDay();
   }

   public String toString() {
      return String.format("%02d/%02d/%04d %02d:%02d:%02d", month, day, year, hour, minute, second); 
   } 
}