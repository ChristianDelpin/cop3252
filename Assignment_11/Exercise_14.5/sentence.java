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
            StringBuilder fullSentence = new StringBuilder();
            
            String a = articles[random.nextInt(0, 5)];
            fullSentence.append(a.substring(0,1).toUpperCase()).append(a.substring(1));
            // lol just thought, alternatively I could just have the articles all capitalized, then .toLower() the result string on the 2nd usage. oh well

            
            fullSentence.append(" ").append(nouns[random.nextInt(0,5)]);

            fullSentence.append(" ").append(verbs[random.nextInt(0,5)]);
            
            fullSentence.append(" ").append(prepositions[random.nextInt(0,5)]);

            fullSentence.append(" ").append(articles[random.nextInt(0,5)]);

            fullSentence.append(" ").append(nouns[random.nextInt(0,5)]).append(".");
            System.out.println(fullSentence.toString());
        }
    }
}
