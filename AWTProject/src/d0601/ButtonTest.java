package d0601;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f= new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);
		Button b=new Button("확인");
		b.setSize(100,50);
		b.setLocation(100,75);
		
		f.add(b);
		f.setVisible(true);
	}

}
