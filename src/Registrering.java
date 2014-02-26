import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;


public class Registrering extends Dialog {

	protected Object result;
	protected Shell shlMooseAnalytics;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public Registrering(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlMooseAnalytics.open();
		shlMooseAnalytics.layout();
		Display display = getParent().getDisplay();
		while (!shlMooseAnalytics.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlMooseAnalytics = new Shell(getParent(), getStyle());
		shlMooseAnalytics.setSize(627, 408);
		shlMooseAnalytics.setText("Moose Analytics");
		
		text = new Text(shlMooseAnalytics, SWT.BORDER);
		text.setBounds(104, 73, 64, 19);
		
		text_1 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_1.setBounds(104, 107, 64, 19);
		
		text_2 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_2.setBounds(104, 161, 64, 19);
		
		text_3 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_3.setBounds(104, 132, 64, 19);
		
		text_4 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_4.setBounds(104, 211, 64, 19);
		
		text_5 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_5.setBounds(104, 186, 64, 19);
		
		text_6 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_6.setBounds(287, 107, 64, 19);
		
		text_7 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_7.setBounds(287, 144, 64, 19);
		
		text_8 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_8.setBounds(287, 73, 64, 19);
		
		text_9 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_9.setBounds(287, 211, 64, 19);
		
		text_10 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_10.setBounds(287, 247, 64, 19);
		
		text_11 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_11.setBounds(287, 186, 64, 19);
		
		text_12 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_12.setBounds(427, 73, 64, 19);
		
		text_13 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_13.setBounds(427, 107, 64, 19);
		
		text_14 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_14.setBounds(427, 144, 64, 19);
		
		Button btnLagre = new Button(shlMooseAnalytics, SWT.NONE);
		btnLagre.setBounds(427, 263, 94, 28);
		btnLagre.setText("Lagre");

	}
}
