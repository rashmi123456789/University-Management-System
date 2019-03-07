
public class Main extends FrontPage{     //main class
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
                
            }
        });
    }
}
