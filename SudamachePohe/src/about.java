import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextPane;

public class about extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about frame = new about();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public about() {
		setEnabled(false);
		setTitle("SUDAMACHE POHE / ABOUT US");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnSudamachePohePrivate = new JTextPane();
		txtpnSudamachePohePrivate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnSudamachePohePrivate.setText("Sudamache Pohe Private Limited is an unlisted private company incorporated on 13 April, 2021. It is classified as a private limited company and is located in , Maharashtra. It's authorized share capital is INR 1.00 lac and the total paid-up capital is INR 1.00 lac.\r\n\r\nThe current status of Sudamache Pohe Private Limited is - Active.\r\n\r\nDetails of the last annual general meeting of Sudamache Pohe Private Limited are not available. The company is yet to submit its first full-year financial statements to the registrar.\r\n\r\nSudamache Pohe Private Limited has two directors - Babasaheb Pralhad Bhosale and Sandesh Babasaheb Bhosale.\r\n\r\nThe Corporate Identification Number (CIN) of Sudamache Pohe Private Limited is U55209PN2021PTC200274. The registered office of Sudamache Pohe Private Limited is at S NO 66/2 MEGH SANDESH SANT TUKARAM NGR NAVI SANGAVI PUNE Pune , Maharashtra.");
		txtpnSudamachePohePrivate.setBounds(10, 10, 908, 462);
		contentPane.add(txtpnSudamachePohePrivate);
	}
}
