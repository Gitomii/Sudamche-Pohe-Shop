import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class tea extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tea frame = new tea();
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
	public tea() {
		setTitle("SUDAMACHE POHE / TEA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\project ty\\images\\tea\\download.jpeg"));
		btnNewButton.setBounds(33, 87, 165, 135);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\project ty\\images\\tea\\download (1).jpeg"));
		btnNewButton_1.setBounds(271, 87, 165, 135);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("D:\\project ty\\images\\tea\\images (1).jpeg"));
		btnNewButton_1_1.setBounds(486, 87, 165, 135);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("Green Tea 20/-");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(42, 246, 146, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblBlackTea = new JLabel("Black Tea 20/-");
		lblBlackTea.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBlackTea.setBounds(291, 246, 138, 23);
		contentPane.add(lblBlackTea);
		
		JLabel lblSpecialTea = new JLabel("Special Tea 25/-");
		lblSpecialTea.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSpecialTea.setBounds(489, 246, 154, 23);
		contentPane.add(lblSpecialTea);
	}
}
