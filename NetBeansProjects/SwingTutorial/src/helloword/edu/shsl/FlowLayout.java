/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author SHSL
 */
public class FlowLayout extends JFrame {
public FlowLayout() {
setTitle("FlowLayout Example");
JPanel panel = new JPanel();
JTextArea area = new JTextArea("text area");
area.setPreferredSize(new Dimension(100, 100));
JButton button = new JButton("button");
panel.add(button);
JTree tree = new JTree();
panel.add(tree);
panel.add(area);
add(panel);
pack();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}
public static void main(String[] args) {
new FlowLayout();
}
}
