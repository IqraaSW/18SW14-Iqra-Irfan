import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener {
	
	private Container c;
	private JLabel name,Fname,mobile,DOB,Add,gender,RegistrationSuccessful,pass;
	private JTextField Tname,TFname,Tmobile,TDOB,TAdd;
	private JPasswordField Tpass;
	private JButton submit,reset,exit;
	private JRadioButton male,female,other;
	private JComboBox day,month,year;
	private JTextArea ta;
	private JCheckBox termsANDconditions,showpass;
	
	MyFrame(){
		setTitle("Registration Form");
		setSize(800,700);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.YELLOW);
		
		name=new JLabel("Name");
		name.setBounds(30,30,70,30);
		c.add(name);
		Tname=new JTextField();
		Tname.setBounds(150,30,100,30);
		c.add(Tname);
		
		Fname=new JLabel("Father's Name");
		Fname.setBounds(30,80,100,30);
		c.add(Fname);
		TFname=new JTextField();
		TFname.setBounds(150,80,100,30);
		c.add(TFname);
		
		mobile=new JLabel("Mobile No");
		mobile.setBounds(30,130,90,30);
		c.add(mobile);
		Tmobile=new JTextField();
		Tmobile.setBounds(150,130,100,30);
		c.add(Tmobile);
		
		gender=new JLabel("Gender");
		gender.setBounds(30,180,70,30);
		c.add(gender);
		
		male=new JRadioButton("Male");
		male.setBounds(150,180,70,30);
		c.add(male);
		
		male.setSelected(true);
		
		female=new JRadioButton("Female");
		female.setBounds(250,180,70,30);
		c.add(female);
		
		other=new JRadioButton("Others");
		other.setBounds(350,180,70,30);
		c.add(other);
		
		ButtonGroup gen=new ButtonGroup();
		gen.add(male);
		gen.add(female);
		gen.add(other);
		
		DOB=new JLabel("DOB");
		DOB.setBounds(30,230,70,30);
		c.add(DOB);
		
		String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
						 "21","22","23","24","25","26","27","28","29","30","31"};
		
		String[] months = {"Jan","Fab","Mar","Apr","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		
		String[] years = {"1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
						   "2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027",
		                   "2028","2029","2030"};
		
		day=new JComboBox(days);
		day.setBounds(130,230,70,30);
		c.add(day);
		
		day.setSelectedItem("29");
		
		month=new JComboBox(months);
		month.setBounds(230,230,70,30);
		c.add(month);
		
		month.setSelectedItem("Jun");
		
		year=new JComboBox(years);
		year.setBounds(330,230,70,30);
		c.add(year);
		
		year.setSelectedItem("2000");
		
		Add=new JLabel("Address");
		Add.setBounds(30,280,80,30);
		c.add(Add);
		
		TAdd=new JTextField();
		TAdd.setBounds(130,280,150,30);
		c.add(TAdd);
		
		pass=new JLabel("Password");
		pass.setBounds(30,330,90,30);
		c.add(pass);
		
		Tpass=new JPasswordField();
		Tpass.setBounds(130,330,140,30);
		c.add(Tpass);
		
		showpass=new JCheckBox("Show");
		showpass.setBounds(300,330,70,30);
		c.add(showpass);
		
		termsANDconditions=new JCheckBox("Accept Terms and Conditions");
		termsANDconditions.setBounds(30,380,200,30);
		c.add(termsANDconditions);
		
		submit=new JButton("Submit");
		submit.setBounds(200,430,80,30);
		c.add(submit);
		
		reset=new JButton("Reset");
		reset.setBounds(100,430,80,30);
		c.add(reset);
		
		exit=new JButton("Exit");
		exit.setBounds(300,430,80,30);
		c.add(exit);
		
		ta=new JTextArea();
		ta.setBounds(450,50,300,400);
		c.add(ta);
		
		RegistrationSuccessful=new JLabel("");
		RegistrationSuccessful.setBounds(100,520,400,30);
		c.add(RegistrationSuccessful);
		
		submit.addActionListener(this);
		showpass.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		
		setVisible(true);
		
	}
	
	
	int a=0;
	public void actionPerformed(ActionEvent e){
	
		if(showpass.isSelected())
		{
			Tpass.setEchoChar((char)0);
		}
		
		else if(showpass.isSelected()==false)
		{
			char ch='.';
			Tpass.setEchoChar(ch);
			Font font=new Font("Ariel",Font.PLAIN,15);
		}
		
		if(e.getSource()==submit)
		{
			
			 if(termsANDconditions.isSelected())
		     {
			     RegistrationSuccessful.setText("Registration Successful");
			     String nm=Tname.getText();
			     String Fnm=TFname.getText();
			     String MN=Tmobile.getText();
			     String Gen="Male";
			     if(female.isSelected())
			     {
			    	 Gen="Female";
			     }
			     String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
			     String add=TAdd.getText();
			
			     ta.setText("Name: "+nm+"\n"+"Father's Name: "+Fnm+"\n"+"Mobile No: "+MN+"\n"+"Gender: "+Gen+"\n"+"Date Of Birth: "+dob+"\n"+"Address: "+add); 
		     }
			 
			 else  
			 {
				 RegistrationSuccessful.setText("Please accept terms and conditions");
			 }
		
		
		
		if(e.getSource()==reset)
		{
			Tname.setText("");
			TFname.setText("");
			Tmobile.setText("");
			TAdd.setText("");
			Tpass.setText("");
			ta.setText("");
			RegistrationSuccessful.setText("");
		}
		
		if(e.getSource()==exit)
		{
			a=JOptionPane.showConfirmDialog(c, "Are You Sure?");
		}
		
		if(a==JOptionPane.YES_OPTION)
		{
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			//System.exit(0);
		}
    			
	}
	}
		
}

public class Form{
	public static void main(String [] args)
	{
		MyFrame f=new MyFrame();
	}
}