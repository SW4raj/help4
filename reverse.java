import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class reverse extends Applet implements ActionListener
 {  
   int i;
   TextField t1;
   Choice c1,c2;
   Button b1;
   String text;
   String revtext="";

   public void init()
    {
     t1=new TextField(10);
     c1=new Choice();
     c2=new Choice();
    
     for(i=8;i<=75;i++)  //value from 8 to 75
      {
       c1.addItem(String.valueOf(i));
      }  

     c2.addItem("black");
     c2.addItem("red");
     c2.addItem("green");
     c2.addItem("blue");
     
     b1=new Button("Reverse");
   
     add(t1);
     add(c1);
     add(c2);
     add(b1);
     
     b1.addActionListener(this);
    }
    
   public void actionPerformed(ActionEvent e)
    {

    // int fsize=Integer.parseInt(c1.getSelectedItem());
    // String fcolor=c2.getSelectedItem();

      text=t1.getText(); 
      for(int j=text.length()-1;j>=0;j--)
       {
         revtext+=text.charAt(j);
       }

    }

   public void paint(Graphics g)
    { 
      g.drawString(revtext,300,300);
    }

 }

//<applet code="reverse.class" width=600 height=600></applet>
    