import java.util.Random;

public class sentence
{
    public static void main(String[] args) 
    {
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        //a n v p a n
        Random random = new Random();

        for(int i=0; i<20; i++)
        {
            String fullSentence = "";
            
            String a = articles[random.nextInt(0, 5)];
            fullSentence+= a.substring(0,1).toUpperCase() + a.substring(1);
            // lol just thought, alternatively I could just have the articles all capitalized, then .toLower() the result string on the 2nd usage. oh well

            
            fullSentence+= " " + nouns[random.nextInt(0,5)];

            fullSentence+= " " + verbs[random.nextInt(0,5)];
            
            fullSentence+= " " + prepositions[random.nextInt(0,5)];

            fullSentence+= " " + articles[random.nextInt(0,5)];

            fullSentence+= " " + nouns[random.nextInt(0,5)] + ".";
            System.out.println(fullSentence);
        }
    }
}
