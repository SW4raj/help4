import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class rect extends Applet implements ActionListener,AdjustmentListener
 {
   TextField t1,t2,t3,t4,t5,t6;
   Scrollbar s1,s2;
   Button b1,b2;
   int x,y,w,h,cx,cy,hr,vr;

   public void init()
    {
      setLayout(null);

      t1=new TextField(10);
      t2=new TextField(10);
      t3=new TextField(10);
      t4=new TextField(10);
      t5=new TextField(10);
      t6=new TextField(10);
      s1=new Scrollbar(Scrollbar.VERTICAL,0,0,0,2000);
      s2=new Scrollbar(Scrollbar.VERTICAL,0,0,0,2000);
      b1=new Button("Draw Rectangle");
      b2=new Button("Draw Circle");

      t1.setBounds(100,50,60,20);
      t2.setBounds(200,50,60,20);
      t3.setBounds(300,50,60,20);
      t4.setBounds(400,50,60,20);
      t5.setBounds(220,150,60,20);
      t6.setBounds(320,150,60,20);
      s1.setBounds(500,250,20,200);
      s2.setBounds(550,250,20,200);
      b1.setBounds(250,80,100,20);
      b2.setBounds(250,180,100,20);

      add(t1);
      add(t2);
      add(t3);
      add(t4);
      add(t5);
      add(t6);
      add(s1);
      add(s2);
      add(b1);
      add(b2);

      b1.addActionListener(this);
      b2.addActionListener(this);
      s1.addAdjustmentListener(this);
      s2.addAdjustmentListener(this);
    }
 
    public void actionPerformed(ActionEvent e)
     {
       repaint();
       x=Integer.parseInt(t1.getText());
       y=Integer.parseInt(t2.getText());
       w=Integer.parseInt(t3.getText());
       h=Integer.parseInt(t4.getText());
       cx=Integer.parseInt(t5.getText());
       cy=Integer.parseInt(t6.getText());
     }

    public void adjustmentValueChanged(AdjustmentEvent e) 
     {
       repaint();
       hr=s1.getValue();
       vr=s2.getValue();
     }
     
   public void paint(Graphics g)
    {
       g.drawRect(x,y,w,h);
       g.drawOval(cx,cy,hr,vr);    
   }

}

//<applet code="rect.class" width=600 height=600></applet>