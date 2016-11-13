
public class CounterVisitor implements Visitor{
    private int userCounter;
    private int groupCounter;
    public CounterVisitor() {
        userCounter = 0;
        groupCounter = 0;
    }
    public void usercount() {
        userCounter++;
    }
    public void groupcount() {
        groupCounter++;
    }
    //return usercounter or groupcounter depending on the parameter
    public int returnCounter(int decision) {
        if(decision == 0) {
            return userCounter;
        }
        else {
            return groupCounter;
        }
    }
}
