/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;


public class LayoutBoxExample extends JFrame {
 
    public LayoutBoxExample() {
        setTitle("True Button");
        setSize(300,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        JPanel basic = new JPanel();
        basic.setLayout(new BoxLayout(basic,BoxLayout.Y_AXIS));
        add(basic);
        basic.add(Box.createVerticalGlue());
        
        JPanel bottom = new JPanel();
        bottom.setAlignmentX(1f);
        bottom.setLayout(new BoxLayout(bottom,BoxLayout.X_AXIS));
        
        JButton ok = new JButton("OK");
        JButton close = new JButton("Close");
        bottom.add(ok);
        bottom.add(Box.createRigidArea(new Dimension(5,0)));
        bottom.add(close);
        bottom.add(Box.createRigidArea(new Dimension(10,0)));
        
        
        basic.add(bottom);
        basic.add(Box.createRigidArea(new Dimension(40,20)));
        
    } 
    public static void main(String[] args) {
        new LayoutBoxExample();
    }
}