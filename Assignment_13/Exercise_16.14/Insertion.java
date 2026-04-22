import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class Insertion 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for(int i=0; i<25; i++)
        {
            list.add(r.nextInt(0,101));
        }

        System.out.println("Before sorting: ");
        for(int element : list)
        {
            System.out.print(element + " ");
        }

        list.sort(Comparator.naturalOrder());

        System.out.println("\nAfter sorting: ");

        for(int element : list)
        {
            System.out.print(element + " ");
        }
        System.out.println(); // so the prompt output is on its own line.
    }
}