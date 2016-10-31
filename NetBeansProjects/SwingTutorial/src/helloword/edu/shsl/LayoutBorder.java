/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author SHSL
 */
public class LayoutBorder extends JFrame {
    public LayoutBorder(){
        setTitle("Border Example");
        setSize(300,200);
        JPanel panel = new JPanel(new BorderLayout());
        JPanel top = new JPanel();
        top.setBackground(Color.red);
        top.setPreferredSize(new Dimension(250, 150));        
        panel.add(top);
        panel.setBorder(new EmptyBorder(new Insets(20, 40, 20, 20)));
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LayoutBorder();
    }
}
