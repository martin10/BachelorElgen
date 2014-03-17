import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


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
	private Text text_11;

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
		shlMooseAnalytics.setSize(800, 600);
		shlMooseAnalytics.setText("Moose Analytics");
		
		text = new Text(shlMooseAnalytics, SWT.BORDER);
		text.setBounds(104, 73, 64, 19);
		
		text_1 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_1.setBounds(104, 98, 64, 19);
		
		text_2 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_2.setBounds(104, 148, 64, 19);
		
		text_3 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_3.setBounds(104, 123, 64, 19);
		
		text_4 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_4.setBounds(104, 198, 64, 19);
		
		text_5 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_5.setBounds(104, 173, 64, 19);
		
		text_6 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_6.setBounds(287, 98, 64, 19);
		
		text_7 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_7.setBounds(287, 123, 64, 19);
		
		text_8 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_8.setBounds(287, 73, 64, 19);
		
		text_9 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_9.setBounds(287, 173, 64, 19);
		
		text_11 = new Text(shlMooseAnalytics, SWT.BORDER);
		text_11.setBounds(287, 148, 64, 19);
		
		Button btnLagre = new Button(shlMooseAnalytics, SWT.NONE);
		btnLagre.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnLagre.setBounds(269, 206, 94, 28);
		btnLagre.setText("Registrer ");
		
		Label lblJaktfelt = new Label(shlMooseAnalytics, SWT.NONE);
		lblJaktfelt.setBounds(21, 73, 59, 14);
		lblJaktfelt.setText("Jaktfelt");
		
		Label lblKjnn = new Label(shlMooseAnalytics, SWT.NONE);
		lblKjnn.setBounds(21, 101, 59, 14);
		lblKjnn.setText("KJ\u00F8nn");
		
		Label lblFellingsdato = new Label(shlMooseAnalytics, SWT.NONE);
		lblFellingsdato.setBounds(21, 126, 77, 14);
		lblFellingsdato.setText("Fellingsdato");
		
		Label lblVeidVekt = new Label(shlMooseAnalytics, SWT.NONE);
		lblVeidVekt.setBounds(21, 148, 59, 14);
		lblVeidVekt.setText("Veid vekt");
		
		Label lblAntallKalv = new Label(shlMooseAnalytics, SWT.NONE);
		lblAntallKalv.setBounds(21, 173, 59, 14);
		lblAntallKalv.setText("Antall kalv");
		
		Label lblGevir = new Label(shlMooseAnalytics, SWT.NONE);
		lblGevir.setBounds(21, 201, 59, 14);
		lblGevir.setText("Gevir");
		
		Label lblAntallTagger = new Label(shlMooseAnalytics, SWT.NONE);
		lblAntallTagger.setBounds(185, 73, 77, 14);
		lblAntallTagger.setText("Antall Tagger");
		
		Label lblAlder = new Label(shlMooseAnalytics, SWT.NONE);
		lblAlder.setBounds(185, 101, 59, 14);
		lblAlder.setText("Alder");
		
		Label lblMerknad = new Label(shlMooseAnalytics, SWT.NONE);
		lblMerknad.setBounds(185, 128, 59, 14);
		lblMerknad.setText("Merknad");
		
		Label lblArt = new Label(shlMooseAnalytics, SWT.NONE);
		lblArt.setBounds(185, 153, 59, 14);
		lblArt.setText("Art");
		
		Label lblJaktleder = new Label(shlMooseAnalytics, SWT.NONE);
		lblJaktleder.setBounds(185, 173, 59, 14);
		lblJaktleder.setText("Jaktleder");

	}
}
