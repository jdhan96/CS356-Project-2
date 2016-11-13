
import javax.swing.JOptionPane;

public class DisplayMessage implements TreeComposite{
    String hold;
    public DisplayMessage(String message) {
        hold = message;
    }
    public void display() {
        JOptionPane.showMessageDialog(null, hold);
    }
}
