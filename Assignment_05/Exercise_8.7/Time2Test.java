// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.

public class Time2Test {
   public static void main(String[] args) {
      Time2 t1 = new Time2();
      Time2 t2 = new Time2(23, 59, 59);
      Time2 t3 = new Time2(t2);
      Time2 t4 = new Time2(t2);

      displayTime("t1: all arguments defaulted", t1);
      displayTime("t2: hour specified; minute and second defaulted", t2);

      t1.tick();
      displayTime("t1 after tick()", t1);

      t2.incrementMinute();
      displayTime("t2 after incrementing minute", t2);

      t3.incrementHour();
      displayTime("t3 after incrementing hour", t3);

      t4.tick();
      t4.incrementMinute();
      t4.incrementHour();
      displayTime("t4 after incrementing hour, minute and second", t4);

   } 

   // displays a Time2 object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time2 t) {
      System.out.printf("%s%n   %s%n   %s%n",
         header, t.toUniversalString(), t.toString());
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
