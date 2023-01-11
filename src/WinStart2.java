import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
public class WinStart2 extends JFrame {

		public WinStart2() throws HeadlessException {
			super();
			
		}
   public static void main(String[] args) {
	   WinStart2 frrame=new WinStart2();
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