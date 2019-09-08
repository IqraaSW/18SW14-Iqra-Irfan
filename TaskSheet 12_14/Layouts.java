import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Layouts extends JFrame{
	JPanel p=new JPanel();
	JButton b1=new JButton("BUTTON1");
	BorderLayout b=new BorderLayout();

	Layouts(){

		p.setLayout(b);
		p.add(b1,BorderLayout.SOUTH);
		add(p);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Layouts();
	}

	
}