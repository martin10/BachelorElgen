import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;


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
		
		ToolBar toolBar = new ToolBar(shlAnalyseverktyForElgdata, SWT.FLAT | SWT.RIGHT);
		toolBar.setBounds(0, 0, 749, 20);
		
		ToolItem tltmHjem = new ToolItem(toolBar, SWT.NONE);
		tltmHjem.setText("Hjem");
		
		ToolItem tltmImport = new ToolItem(toolBar, SWT.NONE);
		tltmImport.setText("Import");
		
		ToolItem tltmExport = new ToolItem(toolBar, SWT.DROP_DOWN);
		tltmExport.setText("Export");
		
		ToolItem tltmStatistikk = new ToolItem(toolBar, SWT.DROP_DOWN);
		tltmStatistikk.setText("Statistikk");
		
		ToolItem tltmDropdownItem = new ToolItem(toolBar, SWT.DROP_DOWN);
		tltmDropdownItem.setText("DropDown Item");
		
		ToolItem tltmRegistrering = new ToolItem(toolBar, SWT.DROP_DOWN);
		tltmRegistrering.setText("Registrering");
		
		ToolItem tltmArkiv = new ToolItem(toolBar, SWT.DROP_DOWN);
		tltmArkiv.setText("Arkiv");
		
		ToolItem tltmHjelp = new ToolItem(toolBar, SWT.NONE);
		tltmHjelp.setText("Hjelp");
		
		Combo combo = new Combo(shlAnalyseverktyForElgdata, SWT.NONE);
		combo.setBounds(159, 188, 165, 22);
		
		Button btnVelgFil = new Button(shlAnalyseverktyForElgdata, SWT.NONE);
		btnVelgFil.setBounds(39, 187, 94, 28);
		btnVelgFil.setText("Velg fil");
		
		text = new Text(shlAnalyseverktyForElgdata, SWT.BORDER);
		text.setBounds(342, 76, 303, 136);

	}
}
