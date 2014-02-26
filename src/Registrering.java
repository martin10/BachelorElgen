import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;


public class Registrering extends Dialog {

	protected Object result;
	protected Shell shlMooseAnalytics;
	private Text text;
	private Text text_1;

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
		text_1.setBounds(104, 98, 64, 19);

	}
}
