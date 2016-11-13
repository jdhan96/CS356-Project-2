
public class MessageVisitor implements Visitor{
    private int tweetCounter;
    private int positive;
    private String[] positiveWords = {"good", "great", "excellent", "perfect"};
    
    //initialize tweetcounter and positive
    public MessageVisitor() {
        tweetCounter = 0;
        positive = 0;
    }
    //increment the tweetcounter and check if it contains a positive word
    public void addTweet(String tweet) {
        tweetCounter++;
        String[] words = tweet.split("\\W+");
        
        //convert everything to lowercase
        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        
        //check for the positive word
        for (String word : words) {
            for (String positiveWord : positiveWords) {
                if (word.equals(positiveWord)) {
                    positive++;
                    break;
                }
            }
        }
    }
    
    //return either the tweetCounter or positive depending on the parameter
    public int returnCounter(int decision) {
        if(decision == 0) {
            return tweetCounter;
        }
        else {
            return positive;
        }
        
    }
}
