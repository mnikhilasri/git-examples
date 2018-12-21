import java.awt.*;
class Appdemo extends Frame
{
 public Appdemo()
 {
 Button b = new Button("click me");
 b.setBounds(30,100,80,30);
 add(b);
 setSize(300,300);
 setVisible(true);
 setLayout(null);
 }
 public static void main(String args[])
 {
   Appdemo ap = new Appdemo();
   
 } 
}