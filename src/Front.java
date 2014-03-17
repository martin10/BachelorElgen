import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.TextArea;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;


public class Front {

	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front window = new Front();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Front() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnHeim = new JMenu("Heim");
		menuBar.add(mnHeim);
		
		JMenu mnImport = new JMenu("Import");
		menuBar.add(mnImport);
		
		JMenuItem mntmExcel = new JMenuItem("Excel");
		mnImport.add(mntmExcel);
		
		JMenu mnExport = new JMenu("Export");
		menuBar.add(mnExport);
		
		JMenuItem mntmExcel_1 = new JMenuItem("Excel");
		mnExport.add(mntmExcel_1);
		
		JMenuItem mntmPublisering = new JMenuItem("Publisering");
		mnExport.add(mntmPublisering);
		
		JMenu mnStatistikk = new JMenu("Statistikk");
		menuBar.add(mnStatistikk);
		
		JMenuItem mntmGrafer = new JMenuItem("Grafer");
		mnStatistikk.add(mntmGrafer);
		
		JMenuItem mntmMultivariat = new JMenuItem("Multivariat analyse");
		mnStatistikk.add(mntmMultivariat);
		
		JMenuItem mntmBivariat = new JMenuItem("Bivariat analyse");
		mnStatistikk.add(mntmBivariat);
		
		JMenuItem mntmUnivariatAnalyse = new JMenuItem("Univariat analyse");
		mnStatistikk.add(mntmUnivariatAnalyse);
		
		JMenu mnRegistrering = new JMenu("Registrering");
		menuBar.add(mnRegistrering);
		
		JMenuItem mntmSettElg = new JMenuItem("Sett elg");
		mnRegistrering.add(mntmSettElg);
		
		JMenuItem mntmTannanalyse = new JMenuItem("Tannanalyse");
		mnRegistrering.add(mntmTannanalyse);
		
		JMenuItem mntmVrdata = new JMenuItem("V\u00E6rdata");
		mnRegistrering.add(mntmVrdata);
		
		JMenuItem mntmSkogsanalyse = new JMenuItem("Skogsanalyse");
		mnRegistrering.add(mntmSkogsanalyse);
		
		JMenuItem mntmBeiteregistrering = new JMenuItem("Beiteregistrering");
		mnRegistrering.add(mntmBeiteregistrering);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JLabel lblBrukernavn = new JLabel("Brukernavn");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		Label label = new Label("Import: Forklaring");
		
		TextArea textArea = new TextArea();
		textArea.setText("Import: Forklaring...");
		
		JLabel lblPassord = new JLabel("Passord");
		
		JButton btnLoggInn = new JButton("Logg Inn");
		btnLoggInn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("jgvfj");
		
		JButton btnNewButton = new JButton("Neste");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblBrukernavn, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblPassord, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
				.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnLoggInn, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(569)
					.addComponent(btnNewButton))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBrukernavn, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassord, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLoggInn, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addComponent(btnNewButton))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
