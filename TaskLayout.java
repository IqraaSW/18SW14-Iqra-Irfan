import java.awt.*;  
import javax.swing.*;

public class TaskLayout{  
  JFrame j;  
  TaskLayout()
  {  
    j=new JFrame();  
      
    JButton b1=new JButton("Button1");  
    JButton b2=new JButton("Button2");  
    JButton b3=new JButton("Button3");  
    JButton b4=new JButton("Button4");

     j.setLayout(new BorderLayout());

     j.add("North",  new Button("North"));
     j.add("South",  new Button("South"));
     j.add("East",   new Button("East"));
     j.add("West",   new Button("West"));
     j.add("Center", new Button("Center")); 
    
              
    j.add(b1);j.add(b2);j.add(b3);j.add(b4);
      
    j.setLayout(new FlowLayout(FlowLayout.RIGHT));

    
    j.setLayout(new GridLayout(3,3)); 

    GridBagLayout layout = new GridBagLayout();  
    j.setLayout(layout);
    j.setSize(200,200);
    j.setVisible(true);  
}  
public static void main(String[] args) 
{  
    new TaskLayout();  
}  
}  
    