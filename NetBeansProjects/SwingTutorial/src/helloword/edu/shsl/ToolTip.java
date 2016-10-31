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
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author SHSL
 */
public class ToolTip extends JFrame{
    private Toolkit toolkit;
    public ToolTip(){       
        setSize(600,300);
        setTitle("Tool tip");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JButton button = new JButton("Exit");
        button.setBounds(50,50,80,30);
        button.setToolTipText("Thoat chuong trinh");
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        panel.add(button);
    }
    public static void main(String[] args){
        ToolTip tooltip = new ToolTip();
        tooltip.setVisible(true);
        
    }
}
