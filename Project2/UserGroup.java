
import java.util.ArrayList;
import java.util.List;


public class UserGroup{
    private List<User> users;
    private List<UserGroup> groups;
    private final String ID;
    
    public UserGroup(String ID) {
        this.ID = ID;
        users = new ArrayList<User>();
        groups = new ArrayList<UserGroup>();
    }
    public void add(User user) {
        users.add(user);
    }
    public void add(UserGroup group) {
        groups.add(group);
    }
    @Override
    public String toString() {
        return ID;
    }
}
