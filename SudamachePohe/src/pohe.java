import java.awt.EventQueue;


import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pohe extends JFrame {

	/**
	 * 
	 */
	

	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField bill_tot1;
	private JTextField full_tot;
	private JTextField tax;
	private JTextField dis;
	private JTextField balance;
	private JTextField pay;

	/**
	 * Launch the application.
	 */
	
	
public pohe() {
		
		initComponents();
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		
		
	}
	
	
	
public void addTable(String	name, Double Price) {
		
		
		String Qty = JOptionPane.showInputDialog(null,"Please Enter Your Qty","1");
		
		
		Double tqty = Double.valueOf(Qty);
		Double tot_prc = Price * tqty;
		System.out.println(tot_prc);
		
		
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		Vector<Comparable> v = new Vector<Comparable>();
		v.add(name);
		v.add(Qty);
		v.add(Price);
		dt.addRow(v);
		
		cart_total();
		
		
		
	}
	
	
	
public void cart_total() {
		
		int numofrow = table.getRowCount();
		double total = 0;
		
		for(int i = 0; i < numofrow; i++) {
			double value = Double.valueOf(table.getValueAt(i, 2).toString());
			total += value;
			
		}
		
		DecimalFormat df= new DecimalFormat("000.00");
		String d1 = df.format(total);
		
		bill_tot1.setText(d1);
		
		//TOTAL
		
		double tx = Double.valueOf(tax.getText());
	
		double ds = Double.valueOf(dis.getText());
		
		double allTot = total + tx - ds;
		
		DecimalFormat dff= new DecimalFormat("000.00");
		String d2 = dff.format(allTot);
		
		full_tot.setText(d2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pohe frame = new pohe();
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
	

		
		
		
		private void initComponents() {
		// TODO Auto-generated method stub
		
	

		setTitle("SUDAMACHE POHE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1111, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				addTable("kande", 30.00);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\project ty\\images\\kande pohe.jpg"));
		btnNewButton.setBounds(13, 20, 99, 89);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("KANDE POHE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(13, 119, 87, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTable("kokni", 30.00);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\project ty\\images\\kokni pohe.jpg"));
		btnNewButton_1.setBounds(122, 20, 99, 89);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTable("dahi", 30.00);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("D:\\project ty\\images\\dahi pohe.jpg"));
		btnNewButton_1_1.setBounds(311, 167, 108, 89);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTable("dadpe", 30.00);
				
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon("D:\\project ty\\images\\dadpe pohe.jpg"));
		btnNewButton_1_2.setBounds(376, 20, 108, 89);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTable("matki", 30.00);
			}
		});
		btnNewButton_1_3.setIcon(new ImageIcon("D:\\project ty\\images\\matki pohe.jpg"));
		btnNewButton_1_3.setBounds(13, 162, 114, 94);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTable("sambar", 30.00);
			}
		});
		btnNewButton_1_4.setIcon(new ImageIcon("D:\\project ty\\images\\sambar pohe.jpg"));
		btnNewButton_1_4.setBounds(241, 20, 114, 89);
		contentPane.add(btnNewButton_1_4);
		
		JLabel lblKokniPohe = new JLabel("KOKNI POHE");
		lblKokniPohe.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblKokniPohe.setBounds(132, 119, 87, 21);
		contentPane.add(lblKokniPohe);
		
		JLabel lblDahiPohe = new JLabel("DAHI POHE");
		lblDahiPohe.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDahiPohe.setBounds(321, 266, 87, 21);
		contentPane.add(lblDahiPohe);
		
		JLabel lblDadpePohe = new JLabel("DADPE POHE");
		lblDadpePohe.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDadpePohe.setBounds(397, 119, 87, 21);
		contentPane.add(lblDadpePohe);
		
		JLabel lblSambarPohe = new JLabel("SAMBAR POHE");
		lblSambarPohe.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSambarPohe.setBounds(251, 119, 81, 21);
		contentPane.add(lblSambarPohe);
		
		JLabel lblMatkiPohe = new JLabel("MATKI POHE");
		lblMatkiPohe.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMatkiPohe.setBounds(23, 266, 87, 15);
		contentPane.add(lblMatkiPohe);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(590, 20, 478, 405);
		contentPane.add(textPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(13, 304, 478, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 12, 452, 192);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ITEM","QTY","PRICE"
			}
		));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(13, 528, 1055, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sub");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 10, 68, 26);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(304, 10, 68, 26);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cash");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(10, 73, 68, 26);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tax");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(580, 10, 68, 26);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Dis");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_4.setBounds(792, 10, 68, 26);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Bal");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_5.setBounds(640, 73, 68, 26);
		panel_1.add(lblNewLabel_1_5);
		
		bill_tot1 = new JTextField();
		bill_tot1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bill_tot1.setBounds(88, 10, 120, 26);
		panel_1.add(bill_tot1);
		bill_tot1.setColumns(10);
		
		full_tot = new JTextField();
		full_tot.setFont(new Font("Tahoma", Font.PLAIN, 25));
		full_tot.setColumns(10);
		full_tot.setBounds(401, 10, 120, 26);
		panel_1.add(full_tot);
		
		tax = new JTextField();
		tax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_total();
				
			}
		});
		tax.setText("2.77");
		tax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tax.setColumns(10);
		tax.setBounds(640, 10, 120, 26);
		panel_1.add(tax);
		
		dis = new JTextField();
		dis.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				cart_total();
			}
		});
		dis.setText("5.99");
		dis.setFont(new Font("Tahoma", Font.PLAIN, 25));
		dis.setColumns(10);
		dis.setBounds(847, 10, 120, 26);
		panel_1.add(dis);
		
		balance = new JTextField();
		balance.setFont(new Font("Tahoma", Font.PLAIN, 25));
		balance.setColumns(10);
		balance.setBounds(689, 73, 120, 26);
		panel_1.add(balance);
		
		pay = new JTextField();
		pay.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pay.setColumns(10);
		pay.setBounds(88, 73, 120, 26);
		panel_1.add(pay);
		
		JButton btnNewButton_2 = new JButton("Pay");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			double tot = Double.valueOf(full_tot.getText());
			double py = Double.valueOf(pay.getText());
			
			double bal = py - tot;
			
			DecimalFormat dff= new DecimalFormat("000.00");
			String d2 = dff.format(bal);
		
			balance.setText(d2);   
			
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(772, 451, 108, 56);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Print");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2_1.setBounds(931, 451, 137, 56);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("New");
		btnNewButton_2_2.setForeground(Color.BLACK);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2_2.setBounds(593, 451, 108, 56);
		contentPane.add(btnNewButton_2_2);
	}
}
