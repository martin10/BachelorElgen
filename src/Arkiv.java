import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Canvas;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.TextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Arkiv {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arkiv window = new Arkiv();
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
	public Arkiv() {
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
		
		JMenuItem mntmMultivariatAnalyse = new JMenuItem("Multivariat analyse");
		mnStatistikk.add(mntmMultivariatAnalyse);
		
		JMenuItem mntmBivariatAnalyse = new JMenuItem("Bivariat analyse");
		mnStatistikk.add(mntmBivariatAnalyse);
		
		JMenuItem mntmUnivariatAnalyse = new JMenuItem("Univariat analyse");
		mnStatistikk.add(mntmUnivariatAnalyse);
		
		JMenu mnRegistrering = new JMenu("Registrering");
		menuBar.add(mnRegistrering);
		
		JMenuItem mntmSettElg = new JMenuItem("Sett elg");
		mnRegistrering.add(mntmSettElg);
		
		JMenuItem mntmTannAnalyse = new JMenuItem("Tannanalyse");
		mnRegistrering.add(mntmTannAnalyse);
		
		JMenuItem mntmVrdata = new JMenuItem("V\u00E6rdata");
		mnRegistrering.add(mntmVrdata);
		
		JMenuItem mntmSkogsanalyse = new JMenuItem("Skogsanalyse");
		mnRegistrering.add(mntmSkogsanalyse);
		
		JMenuItem mntmBeiteregistrering = new JMenuItem("Beiteregistrering");
		mnRegistrering.add(mntmBeiteregistrering);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
	}

}
