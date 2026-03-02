// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
   public static void main(String[] args) 
   {                                        
      SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, new Date(01,15,1985));    
      HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, new Date(05,20,1990));  
      CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06, new Date(12,10,1988));                      
      BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Date(07,22,1987));                  

      Date currentDate = new Date(01,01,2024);
      
      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee,           "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",   hourlyEmployee,             "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",   commissionEmployee,         "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",   basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

      Employee[] employees = new Employee[4]; 

      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");
      for (Employee currentEmployee : employees) 
      {
         System.out.println(currentEmployee);
         if (currentEmployee instanceof BasePlusCommissionEmployee) 
         {
            BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
            employee.setBaseSalary(1.10 * employee.getBaseSalary());
            System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
         }
         System.out.printf("Weekly earnings: $%,.2f%n", currentEmployee.earnings());
         double empEarnings = currentEmployee.earnings()*4;
         if(currentEmployee.getBirthDate().getMonth() == currentDate.getMonth())
         {
            empEarnings += 100.00;
            System.out.printf("\t** Happy birthday, %s! Enjoy your $100.00 bonus for this month's pay! **%n", currentEmployee.getFirstName());
         }
         System.out.printf("earned $%,.2f for this month.%n%n", empEarnings);
      } 
      for (int j = 0; j < employees.length; j++) 
      {
         System.out.printf("Employee %d is a %s%n", j,  employees[j].getClass().getName());         
      }                                                 
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
