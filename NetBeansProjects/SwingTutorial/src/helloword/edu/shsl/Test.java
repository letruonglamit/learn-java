/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;

import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author SHSL
 */
public class Test extends JFrame{
    public Test(){
        setTitle("Grid Layout");
        
        
        
        JPanel panel = new JPanel();
        //panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setBorder(new EmptyBorder(new Insets(5, 10, 5, 5)));
        panel.setLayout(new GridLayout(3,2,5,5));

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        add(panel);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new Test();
    }
}
