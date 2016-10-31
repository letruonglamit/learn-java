/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

/**
 *
 * @author SHSL
 */
public class ToolBar extends JFrame {
    public ToolBar(){
        setTitle("SimpleToolbar");
        //JMenuBar menubar = new JMenuBar();
        //JMenu file = new JMenu("File");
        //menubar.add(file);
        //setJMenuBar(menubar);
        JToolBar toolbar = new JToolBar();
        //ImageIcon icon = new ImageIcon("user_24x24.png");
        JButton exit = new JButton("close");
        toolbar.add(exit);
//        exit.addActionListener(new ActionListener() {
//        public void actionPerformed(ActionEvent event) {
//            System.exit(0);
//            }            
//        });
        add(toolbar, BorderLayout.NORTH);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new ToolBar();
        
    }
}
