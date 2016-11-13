
//singleton pattern
public class AdminControlPanel {
    protected static AdminControlPanel instance;
    protected AdminControlPanel() {}
    
    public static AdminControlPanel getInstance() {
        if(instance == null) {
            instance = new AdminControlPanel();
        }
        return instance;
    }
    
    //run the GUI
    public void GUI() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TreeComposite a = new MiniTwitterUI();
                a.display();
            }
        });
    }
}
