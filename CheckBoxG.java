import java.awt.*;
import java.awt.event.*;
public class CheckBoxG 
{ 
     CheckBoxG(){  
       Frame f= new Frame("Checkbox");  
       Checkbox c1 = new Checkbox("First");  
       c1.setBounds(100,100, 100,50);  
       Checkbox c2 = new Checkbox("Second");  
       c2.setBounds(100,150, 100,50);  
	   Checkbox c3 = new Checkbox("Third");  
       c3.setBounds(100,200, 100,50); 
	   Checkbox c4 = new Checkbox("not any one");
	   c4.setBounds(100,250, 100,50); 
        f.add(c1);  
        f.add(c2);
		f.add(c3);
		f.add(c4);
        f.setSize(400,400); 
        f.setLayout(null);  
        f.setVisible(true); 
        f.addWindowListener(new myclass());		
     }  
public static void main(String args[])  
{  
    new CheckBoxG();  
}  
}  
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

}