import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SHSL
 */
public class CenteringWindow extends JFrame{
    private Toolkit toolkit;
    public CenteringWindow(){
        setSize(600,600);
        setTitle("centerOnScreen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        //panel.setToolTipText("A panel container");
        JButton beep = new JButton("Beep");
        beep.setBounds(200, 200, 100, 100);
        beep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                toolkit.beep();
            }
        });
        
        JButton close = new JButton("Close");
        close.setBounds(200,275,100,50);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "My Goodness, this is so concise");
                //System.exit(0);
            }
        });
        
        panel.add(close);
        panel.add(beep);
    }
    public static void main(String[] args){
        CenteringWindow c = new CenteringWindow();
        c.setVisible(true);
    }
}
