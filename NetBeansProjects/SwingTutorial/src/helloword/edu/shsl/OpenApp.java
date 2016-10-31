/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword.edu.shsl;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SHSL
 */
public class OpenApp {
    public static void main(String[] args){
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
