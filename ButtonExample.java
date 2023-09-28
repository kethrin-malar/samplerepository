package swingsample;

import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");
    JLabel l1 = new JLabel("First Lable"); 
    l1.setBounds(50,100, 250,20);
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
            		//tf.setText("Welcome to Javatpoint.");  
			String textvalues = tf.getText();
			System.out.println(textvalues);
		l1.setText(textvalues);
        	}  

    });  
    f.add(b);
    f.add(tf); 
    f.add(l1);
    f.setSize(400,400);  
    //f.setLayout(null);  
    f.setVisible(true);   
}  
}  