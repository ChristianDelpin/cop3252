import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates 
{
    public static void main(String[] args) 
    {
        ArrayList<String> arrList = new ArrayList<>();
        if(args.length == 0)
        {
            System.out.println("No names passed. Using default list: Aaron, George, Jill, Judy, Aaron, Jack, Mary, Jill, Aaron, Mary.\n");
            arrList.add("aaron");
            arrList.add("george");
            arrList.add("jill");
            arrList.add("judy");
            arrList.add("aaron");
            arrList.add("jack");
            arrList.add("mary");
            arrList.add("jill");
            arrList.add("aaron");
            arrList.add("mary");
        }
        else
        {
            for( String arg : args)
            {
                arrList.add(arg.toLowerCase());
            }
        }
        // Converting arraylist to set automatically removes any duplicates
        Set<String> unique = new HashSet<>(arrList);

        // Searching for first name
        String search = "";
        Scanner input = new Scanner(System.in);
        System.out.println("--- Beginning name search. Enter \'q\' to quit, \'p\' to print set ---\n");
        while(!search.toLowerCase().strip().equals("q"))
        {
            System.out.print("Enter name or command: ");
            search = input.nextLine().toLowerCase().strip();
            if(search.toLowerCase().strip().equals("p"))
            {
                System.out.println(unique);
            }
            else if(unique.contains(search))
            {
                System.out.printf("Found %s in the set.%n%n", search);
            }
            else if(!search.toLowerCase().strip().equals("q")) // removes not found msg when trying to quit
            {
                System.out.printf("Uh oh, %s was not in the set.%n%n",search);
            }
        }
        input.close();

    }   
}
