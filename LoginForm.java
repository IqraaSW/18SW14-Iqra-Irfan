import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 class LoginForm extends JFrame implements ActionListener {
 
    Container c=getContentPane();
    JLabel userLabel=new JLabel("Name");
    JLabel rollnoLabel=new JLabel("Roll No");
    JLabel emailLabel=new JLabel("Email");
    JLabel passwordLabel=new JLabel("Password");
    JLabel cityLabel=new JLabel("City");
    JTextField userTextField=new JTextField();
    JTextField rollnoTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JTextField cityTextField=new JTextField();
    JButton saveButton=new JButton("SAVE");
    JButton clearButton=new JButton("CLEAR");
    JCheckBox showPassword=new JCheckBox("Show Password");
 
 
    LoginForm()
    {
       //Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        
 
    }
   public void setLayoutManager()
   {
       c.setLayout(null);
   }
   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       userLabel.setBounds(50,150,100,40);
       rollnoLabel.setBounds(50,190,120,40);
       emailLabel.setBounds(50,220,140,40);
       passwordLabel.setBounds(50,250,160,40);
       cityLabel.setBounds(50,320,180,40);
       userTextField.setBounds(150,150,150,30);
       rollnoTextField.setBounds(150,190,100,30);
       emailTextField.setBounds(150,230,150,30);
       passwordField.setBounds(150,260,150,30);
       showPassword.setBounds(150,290,100,20);
       cityTextField.setBounds(160,330,150,30);
       saveButton.setBounds(30,370,100,30);
       clearButton.setBounds(230,370,100,30);
 

   }
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       c.add(userLabel);
       c.add(rollnoLabel);
       c.add(emailLabel);
       c.add(passwordLabel);
       c.add(cityLabel);
       c.add(userTextField);
       c.add(rollnoTextField);
       c.add(emailTextField);
       c.add(passwordField);
       c.add(showPassword);
       c.add(cityTextField);
       c.add(saveButton);
       c.add(clearButton);
   }
 
 
 
    public void actionPerformed(ActionEvent e) {
 
    }

    public static void main(String[] args){
        LoginForm f=new LoginForm();
        f.setTitle("Login Form");
        f.setVisible(true);
        f.setBounds(30,30,570,700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true );
 
    }
 
}
