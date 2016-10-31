import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IncreaseNumber extends JFrame implements ActionListener {
	JButton bt;
	JTextField tf;
	int counter = 0;
	public IncreaseNumber(){
		bt = new JButton("INCREASE");
		bt.addActionListener(this);
		tf = new JTextField("0");
		Container cont = this.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(bt);
		cont.add(tf);
		cont.setSize(500,500);
		//pack(); // thiet lap kich thuoc vua du co cac thanh phan
		setVisible(true);// hien thi JFrame bi an do mac dinh
	}
	public void actionPerformed(ActionEvent event){
		counter++;
		tf.setText(String.valueOf(counter));
	}
	public static void main(String agrs[]){
		new IncreaseNumber();
	}
}
