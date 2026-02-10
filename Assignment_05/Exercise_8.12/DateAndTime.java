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
         nextDay();
   }

   public String toString() {
      return String.format("%d/%d/%d %d:%02d:%02d", month, day, year, hour, minute, second); 
   } 
}






/*
class Time2 {
   private int hour; 
   private int minute; 
   private int second; 

   
   public Time2() {                                             
      this(0, 0, 0); 
   } 

   
   public Time2(int hour) {                                               
      this(hour, 0, 0); 
   } 


   public Time2(int hour, int minute) {
      this(hour, minute, 0); 
   } 

   
   public Time2(int hour, int minute, int second) {                    
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      } 

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      } 

      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      } 

      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
   } 

       
   public Time2(Time2 time) {                                   
      this(time.hour, time.minute, time.second);
   } 

   
   public void setTime(int hour, int minute, int second) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      } 

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      } 

      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      } 

      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
   } 

   
   public void setHour(int hour) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      this.hour = hour;
   } 

   
   public void setMinute(int minute) {
      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      this.minute = minute; 
   } 


   public void setSecond(int second) {
      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      this.second = second;
   } 

        
   public int getHour() {return hour;}

       
   public int getMinute() {return minute;} 

         
   public int getSecond() {return second;}   



   


   
   public String toUniversalString() {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   } 

   
   public String toString() {
      return String.format("%d:%02d:%02d %s", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   } 
} 

















class Date {
   private int month; 
   private int day; 
   private int year; 

   
   
   public Date(int month, int day, int year) {
      if (month <= 0 || month > 12) {
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
      }

      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
         throw new IllegalArgumentException("day (" + day + 
            ") out-of-range for the specified month and year");
      }

      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0))) {
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
      }

      if (year<0)
      {
         throw new IllegalArgumentException("year (" + year + ") must be non-negative.");
      }
   
      this.month = month;
      this.day = day;
      this.year = year;

      System.out.printf("Date object constructor for date %s%n", this);
   } 

   
   
   public String toString() {
      return String.format("%d/%d/%d", month, day, year); 
   } 

   
}

*/