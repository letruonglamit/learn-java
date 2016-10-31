/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author SHSL
 */
public class Menu extends JFrame {
    private final Toolkit toolkit;
    public Menu(){
        setSize(600,400);
        setTitle("Menu demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon iconclose = new ImageIcon("close.png");
        
        JMenuBar menubar = new JMenuBar();
        
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
        
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenuItem fileclose = new JMenuItem("Close application",iconclose);
        fileclose.setMnemonic(KeyEvent.VK_C);
        fileclose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
//        fileclose.addActionListener((ActionEvent e) -> {
//            System.exit(0);
//        });
        file.add(fileclose);
        menubar.add(file);
        setJMenuBar(menubar);
        
    }
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
