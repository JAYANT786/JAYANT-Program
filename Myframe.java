import java.awt.*;
public class Myframe extends Frame
{
public static void main(String args[])
{
Frame f1=new Frame();
Frame f2=new Frame("Frame two");
Myframe f3=new Myframe();
f1.setSize(500,500);
f1.setVisible(true);
f2.setSize(300,300);
f2.setVisible(true);
f3.setSize(400,400);
f3.setVisible(true);
}
}