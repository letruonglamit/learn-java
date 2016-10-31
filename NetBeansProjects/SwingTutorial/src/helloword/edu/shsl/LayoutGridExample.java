/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class LayoutGridExample extends JFrame {
public LayoutGridExample() {
setTitle("GridLayout");
JPanel panel = new JPanel();
panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
panel.setLayout(new java.awt.GridLayout(5, 4, 5, 5));
String[] buttons = {
"Cls", "Bck", "", "Close", "7", "8", "9", "/", "4","5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"
};
for (int i = 0; i < buttons.length; i++) {
if (i == 2)
panel.add(new JLabel(buttons[i]));
else
panel.add(new JButton(buttons[i]));
}
add(panel);
setSize(350, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}
public static void main(String[] args) {
new LayoutGridExample();
}
}