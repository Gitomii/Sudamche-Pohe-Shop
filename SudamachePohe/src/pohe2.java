import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pohe2 {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pohe2 window = new pohe2();
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
	public pohe2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1262, 708);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\project ty\\images\\matki pohe.jpg"));
		btnNewButton.setBounds(32, 35, 127, 89);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\project ty\\images\\sambar pohe.jpg"));
		btnNewButton_1.setBounds(224, 35, 127, 89);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("D:\\project ty\\images\\kokni pohe.jpg"));
		btnNewButton_2.setBounds(435, 35, 127, 89);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("D:\\project ty\\images\\kande pohe.jpg"));
		btnNewButton_3.setBounds(32, 170, 127, 89);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("D:\\project ty\\images\\indori pohe.jpg"));
		btnNewButton_4.setBounds(224, 170, 127, 89);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("D:\\project ty\\images\\dadpe pohe.jpg"));
		btnNewButton_5.setBounds(435, 170, 127, 89);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel l1 = new JLabel("0");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l1.setBounds(79, 134, 91, 26);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("0");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l2.setBounds(280, 134, 91, 26);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("0");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l3.setBounds(471, 134, 91, 26);
		frame.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("0");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l4.setBounds(79, 269, 91, 26);
		frame.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("0");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l5.setBounds(280, 269, 91, 26);
		frame.getContentPane().add(l5);
		
		JLabel l6 = new JLabel("0");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l6.setBounds(471, 269, 91, 26);
		frame.getContentPane().add(l6);
		
		JPanel panel = new JPanel();
		panel.setBounds(32, 305, 530, 332);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 524, 323);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Item", "Qty", "Price"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(615, 23, 406, 349);
		frame.getContentPane().add(textArea);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotal.setBounds(615, 417, 91, 26);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblCash = new JLabel("Cash");
		lblCash.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCash.setBounds(615, 453, 91, 26);
		frame.getContentPane().add(lblCash);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBalance.setBounds(615, 489, 91, 26);
		frame.getContentPane().add(lblBalance);
		
		JLabel lblTotal_1 = new JLabel("00");
		lblTotal_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotal_1.setBounds(718, 417, 91, 26);
		frame.getContentPane().add(lblTotal_1);
		
		JLabel lblTotal_2 = new JLabel("00");
		lblTotal_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotal_2.setBounds(718, 489, 91, 26);
		frame.getContentPane().add(lblTotal_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(716, 453, 96, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Pay");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_6.setBounds(819, 453, 91, 62);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("Print");
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_6_1.setBounds(925, 453, 96, 62);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("Delete");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6_2.setBounds(911, 382, 96, 34);
		frame.getContentPane().add(btnNewButton_6_2);
	}
}
