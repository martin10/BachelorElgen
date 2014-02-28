import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.JLabel;

public class Test extends JFrame {

		public Test() throws HeadlessException {
		setLocationRelativeTo(this);
		setSize (300,200);
		setContentPane(container);
		
		
		container.add(actionButton,BorderLayout.CENTER);
		container.add();
		}
		
	JPanel container = new JPanel(new BorderLayout());
	JButton actionButton = new JButton("execute");
	JLabel label = new JLabel("Java Swing Tutorials");
	
}
	