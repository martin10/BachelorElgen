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


public class Front {

	private JFrame frame;

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
		frame.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Import: Forklaring...");
		textArea.setBounds(0, 50, 345, 143);
		frame.getContentPane().add(textArea);
		
		Label label = new Label("Import: Forklaring");
		label.setBounds(0, 50, 327, 110);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Neste");
		btnNewButton.setBounds(367, 207, 67, 23);
		frame.getContentPane().add(btnNewButton);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setVisibleAmount(6);
		scrollbar.setOrientation(Scrollbar.HORIZONTAL);
		scrollbar.setBounds(305, 199, 40, 40);
		frame.getContentPane().add(scrollbar);
	}
}