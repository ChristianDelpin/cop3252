import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DupeFinder 
{
    public static void main(String[] args) 
    {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        input = scanner.nextLine();
        
        Map<String, Integer> m = new HashMap<>();

        String[] split = input.toLowerCase().split(" ");
        Boolean hasDupes = false;

        for(String c : split)
        {
            int count = m.get(c) != null ? m.get(c) : 0;
            m.put(c,count+1);
        }
        for(Map.Entry<String, Integer> entry : m.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicate found " + entry.getValue() + " times: " + entry.getKey()); // had to use println instead of printf since I got an IllegalFormatException
                hasDupes = true;
            }
        }
        if(!hasDupes)
            System.out.println("No duplicates found.");
        scanner.close();
    }
}
