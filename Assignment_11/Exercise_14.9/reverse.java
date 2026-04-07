public class reverse
{
    public static void main(String[] args) 
    {
        // For now, going to hard-code the string because I'm not sure which option will be required in the end.
        
        String str = "The quick brown fox jumps over the lazy dog";
        String[] tokenized = str.split(" ");
        
        for(int i=tokenized.length-1; i>=0; i--)
        {
            System.out.print(tokenized[i] + " ");
        }
    }
}