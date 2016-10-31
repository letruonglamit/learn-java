/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author SHSL
 */
public class ImageDemo extends JFrame implements ActionListener{
    public ImageDemo(){
        setSize(800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing java demo");
        JLabel label = new JLabel("Hello");
        label.setSize(100,100);
        label.setToolTipText("vl");
        add(label);
        JButton button = new JButton("Button");
        button.setToolTipText("hello");
        add(button, "North", 1);
        
        
    }

    public static void main(String[] args){
        ImageDemo image = new ImageDemo();
        image.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
