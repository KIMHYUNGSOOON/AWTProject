package d0601;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameClassTest extends WindowAdapter{
//	private Frame f;
	
	public void startFrame() {
		// TODO Auto-generated method stub
		Frame f= new Frame("Login");
		f.setSize(300,200);
		
		f.addWindowListener(this);
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation(screenSize.width/2-150,screenSize.height/2-100);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameClassTest t= new FrameClassTest();
		t.startFrame();
	}

}
