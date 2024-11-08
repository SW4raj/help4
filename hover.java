import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class hover extends Applet implements MouseListener
 {
   TextField t1,t2,t3;
    
   public void init()
    {
     t1=new TextField(5);
     t2=new TextField(5);
     t3=new TextField(5); 

     add(t1);
     add(t2);
     add(t3);

     t3.addMouseListener(this);
    }
   
   public void mouseEntered(MouseEvent e)
    {
     int x,y,z;

     x=Integer.parseInt(t1.getText());
     y=Integer.parseInt(t2.getText()); 
     z=x+y;
    
     t3.setText(String.valueOf(z));
     t3.setBackground(Color.red);
    }

    public void mouseExited(MouseEvent e)
     {
       t3.setBackground(Color.green);
     }

    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}

//<applet code="hover.class" width=600 height=600></applet>