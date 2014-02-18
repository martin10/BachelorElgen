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


public class Main {

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
		
		MenuItem mntmRegistrering = new MenuItem(menu, SWT.CASCADE);
		mntmRegistrering.setText("registrering");
		
		Menu menu_1 = new Menu(mntmRegistrering);
		mntmRegistrering.setMenu(menu_1);
		
		MenuItem mntmTannanalyse = new MenuItem(menu_1, SWT.NONE);
		mntmTannanalyse.setText("tannanalyse");
		
		MenuItem mntmVrdata = new MenuItem(menu_1, SWT.NONE);
		mntmVrdata.setText("v\u00E6rdata");
		
		

	}
}
