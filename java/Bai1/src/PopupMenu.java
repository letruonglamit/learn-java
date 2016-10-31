import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author SHSL
 */
public class PopupMenu {
    private JPopupMenu menu;
    private Toolkit toolkit;
    public PopupMenu(){
        JFrame frame = new JFrame("JPopupMenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toolkit = frame.getToolkit();
        menu = new JPopupMenu();
        JMenuItem menuItemBeep = new JMenuItem("Beep");
        menuItemBeep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                toolkit.beep();
            }
        });
        menu.add(menuItemBeep); 
        JMenuItem menuItemClose = new JMenuItem("Close");
        menuItemClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(menuItemClose);
        
        frame.addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent e){
                if(e.getButton() == e.BUTTON3) {
                    menu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        frame.setSize(250,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new PopupMenu();
    }
}