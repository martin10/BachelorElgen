import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.custom.CLabel;


public class Main {
//Hei hvkvl,jvbl.bl.blgb
	protected Shell shlAnalyseverktyForElgdata;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlAnalyseverktyForElgdata.open();
		shlAnalyseverktyForElgdata.layout();
		while (!shlAnalyseverktyForElgdata.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlAnalyseverktyForElgdata = new Shell();
		shlAnalyseverktyForElgdata.setSize(659, 345);
		shlAnalyseverktyForElgdata.setText("Moose Analytics");
		
		Button btnHentData = new Button(shlAnalyseverktyForElgdata, SWT.NONE);
		btnHentData.setBounds(39, 221, 94, 28);
		btnHentData.setText("Hent data");
		
		Combo combo = new Combo(shlAnalyseverktyForElgdata, SWT.NONE);
		combo.setBounds(159, 188, 165, 22);
		
		Button btnVelgFil = new Button(shlAnalyseverktyForElgdata, SWT.NONE);
		btnVelgFil.setBounds(39, 187, 94, 28);
		btnVelgFil.setText("Velg fil");
		
		text = new Text(shlAnalyseverktyForElgdata, SWT.BORDER);
		text.setBounds(342, 76, 303, 136);
		
		Menu menu = new Menu(shlAnalyseverktyForElgdata, SWT.BAR);
		shlAnalyseverktyForElgdata.setMenuBar(menu);
		
		MenuItem mntmHeim = new MenuItem(menu, SWT.CASCADE);
		mntmHeim.setText("Heim");
		
		Menu menu_2 = new Menu(mntmHeim);
		mntmHeim.setMenu(menu_2);
		
		MenuItem mntmImport = new MenuItem(menu, SWT.CASCADE);
		mntmImport.setText("Import");
		
		Menu menu_3 = new Menu(mntmImport);
		mntmImport.setMenu(menu_3);
		
		MenuItem mntmExcel = new MenuItem(menu_3, SWT.NONE);
		mntmExcel.setText("Excel");
		
		MenuItem mntmExport = new MenuItem(menu, SWT.CASCADE);
		mntmExport.setText("Export");
		
		Menu menu_4 = new Menu(mntmExport);
		mntmExport.setMenu(menu_4);
		
		MenuItem mntmExcel_1 = new MenuItem(menu_4, SWT.NONE);
		mntmExcel_1.setText("Excel");
		
		MenuItem mntmPublisering = new MenuItem(menu_4, SWT.NONE);
		mntmPublisering.setText("Publisering");
		
		MenuItem mntmStatistikk = new MenuItem(menu, SWT.CASCADE);
		mntmStatistikk.setText("Statistikk");
		
		Menu menu_5 = new Menu(mntmStatistikk);
		mntmStatistikk.setMenu(menu_5);
		
		MenuItem mntmGrafer = new MenuItem(menu_5, SWT.NONE);
		mntmGrafer.setText("Grafer");
		
		MenuItem mntmMultivariatAnalyse = new MenuItem(menu_5, SWT.NONE);
		mntmMultivariatAnalyse.setText("Multivariat analyse");
		
		MenuItem mntmBivariatAnalyse = new MenuItem(menu_5, SWT.NONE);
		mntmBivariatAnalyse.setText("Bivariat analyse");
		
		MenuItem mntmUnivariatAnalyse = new MenuItem(menu_5, SWT.NONE);
		mntmUnivariatAnalyse.setText("Univariat analyse");
		
		MenuItem mntmRegistrering = new MenuItem(menu, SWT.CASCADE);
		mntmRegistrering.setText("Registrering");
		
		Menu menu_6 = new Menu(mntmRegistrering);
		mntmRegistrering.setMenu(menu_6);
		
		MenuItem mntmSettElg = new MenuItem(menu_6, SWT.NONE);
		mntmSettElg.setText("Sett elg");
		
		MenuItem mntmTannanalyse = new MenuItem(menu_6, SWT.NONE);
		mntmTannanalyse.setText("Tannanalyse");
		
		MenuItem mntmVrdata = new MenuItem(menu_6, SWT.NONE);
		mntmVrdata.setText("V\u00E6rdata ");
		
		MenuItem mntmSkogsanalyse = new MenuItem(menu_6, SWT.NONE);
		mntmSkogsanalyse.setText("Skogsanalyse");
		
		MenuItem mntmBeiteregistrering = new MenuItem(menu_6, SWT.NONE);
		mntmBeiteregistrering.setText("Beiteregistrering");
		
		MenuItem mntmArkiv = new MenuItem(menu, SWT.CASCADE);
		mntmArkiv.setText("Arkiv");
		
		Menu menu_7 = new Menu(mntmArkiv);
		mntmArkiv.setMenu(menu_7);
		
		Menu menu_1 = new Menu(shlAnalyseverktyForElgdata);
		shlAnalyseverktyForElgdata.setMenu(menu_1);
		
		Button button = new Button(shlAnalyseverktyForElgdata, SWT.NONE);
		button.setBounds(325, -24, 75, 25);
		button.setText("?");
		
		Button btnNewButton = new Button(shlAnalyseverktyForElgdata, SWT.NONE);
		btnNewButton.setBounds(342, -24, 94, 25);
		btnNewButton.setText("New Button");
		
		Button btnHjelp = new Button(shlAnalyseverktyForElgdata, SWT.NONE);
		btnHjelp.setBounds(344, -24, 75, 25);
		btnHjelp.setText("HJELP?");
		
		

	}
}
