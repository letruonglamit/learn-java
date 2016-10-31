/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;


/**
 *
 * @author SHSL
 */
public class SubMenu extends JFrame {
    private JLabel statusbar;
    public SubMenu(){
        setSize(600,400);
        setTitle("Menu demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);           
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
        
        JMenuBar menubar = new JMenuBar();        
        JMenu file = new JMenu("File");         
        JMenu importfile = new JMenu("Imports");        
        JMenu view = new JMenu("View");
        JMenu editors = new JMenu("Editors");
        JMenuItem newfile = new JMenuItem("New file");
        JMenuItem save = new JMenuItem("Save as");        
        JMenuItem eclipse = new JMenuItem("Eclipse Project...");
        JMenuItem fromzip = new JMenuItem("From Zip...");
        JCheckBoxMenuItem sources = new JCheckBoxMenuItem("Sources"); 
        sources.setState(true);
        JCheckBoxMenuItem history = new JCheckBoxMenuItem("History");
        JCheckBoxMenuItem showlinenuber = new JCheckBoxMenuItem("Show line number");
        JCheckBoxMenuItem statusItem = new JCheckBoxMenuItem("Show statusbar");
        
        file.setMnemonic(KeyEvent.VK_F);
        importfile.setMnemonic(KeyEvent.VK_I);
        newfile.setMnemonic(KeyEvent.VK_N);
        save.setMnemonic(KeyEvent.VK_S);
        importfile.add(eclipse);
        importfile.add(fromzip);
        file.add(newfile);
        file.add(importfile);
        file.add(save);
        editors.add(sources);
        editors.add(history);
        view.add(editors);
        view.add(showlinenuber);
        view.add(statusItem);
        menubar.add(file);   
        menubar.add(view);
        setJMenuBar(menubar);
        
        statusItem.setState(true);
        statusItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(statusbar.isVisible()) statusbar.setVisible(false);
            else statusbar.setVisible(true);
            }
        });
        newfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Creat file succes");
            }
        });
        
        
        statusbar = new JLabel("Statusbar");
        statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        
        add(statusbar, BorderLayout.SOUTH);
        
        
    }
    public static void main(String[] args){
        SubMenu menu = new SubMenu();
        menu.setVisible(true);
    }
}
