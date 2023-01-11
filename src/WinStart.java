import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WinStart {

   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setTitle("윈도우 연습");
      JButton btn1 =new JButton("EAST");
      frame.add(btn1,BorderLayout.EAST);
      JButton btn2 =new JButton("West");
      frame.add(btn2,BorderLayout.EAST);
      frame.setSize(400,400);
      frame.setVisible(true);
      
   }

}