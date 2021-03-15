import java.awt.*;
import java.awt.event.*;
class Myhome extends Frame 
{
Myhome()
{
setTitle("gui design");
setLayout(null);
 setSize(500,500);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
System.out.println("BYEE!!!");
}
}
);
}
public void paint(Graphics g)
{
this.setBackground(new Color (20,30,35));
g.setColor(Color.blue);
Font f=new Font("TIMES NEW ROMAN",Font.BOLD,30);
g.setFont(f);
g.drawString("Name: Sohil Jain",100,100);

g.setColor(Color.red);
Font f1=new Font("Callibri",Font.BOLD,30);
g.setFont(f1);
g.drawString("Enrollment no.: 19100BTIT06619 ",100,200);

g.setColor(Color.green);
Font f2=new Font("Arial",Font.ITALIC,30);
g.setFont(f2);
g.drawString("course: ",100,300);

g.setColor(Color.yellow);
Font f3=new Font("Clarendon Blk BT",Font.BOLD,30);
g.setFont(f3);
g.drawString("B.TECH (IT)",250,300);

g.setColor(Color.YELLOW);
Font f4=new Font("Comic Sans Ms",Font.BOLD,30);
g.setFont(f4);
g.drawString("4th Sem",100,400);

}
public static void main(String []args)
{
Myhome f=new Myhome();
}
}