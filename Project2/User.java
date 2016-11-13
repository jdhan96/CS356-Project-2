
import java.util.ArrayList;


public class User extends Subject implements Observer{
    private final String ID;
    private ArrayList<User> followers;
    private ArrayList<User> followings;
    private ArrayList<String> newsfeed;
    private ArrayList<String> selftweet;
    
    public User(String ID) {
        this.ID = ID;
        followers = new ArrayList<User>();
        followings = new ArrayList<User>();
        newsfeed = new ArrayList<String>();
        selftweet = new ArrayList<String>();
    }
    public String toString() {
        return ID;
    }
    public void Follow(User ID) {
        followings.add(ID);
        ID.attach(this);
    }
    public void beFollowed(User ID) {
        followers.add(ID);
    }
    public ArrayList<User> getFollowing() {
        return followings;
    }
    public ArrayList<String> newsfeed() {
        return newsfeed;
    }
    public void tweet(String news) {
        newsfeed.add(0,news);
        selftweet.add(news);
        notifyObserver();
    }
    public boolean checkFollowings(String name) {
        for(int i = 0; i < followings.size(); i++) {
            if(name.equals(followings.get(i).toString())) {
                return false;
            }
        }
        return true;
    }
    public String gettweet() {
        return newsfeed.get(0);
    }
    public void update(Subject subject) {
        newsfeed.add(0,((User)subject).gettweet());
    }

}
