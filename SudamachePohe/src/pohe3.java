import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.util.Date;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class pohe3 extends JFrame {

	private static final long serialVersionUID = 1L;
	//protected static final AbstractButton q11 = null;
	private JPanel contentPane;
	private JTable table;
	private JTextField t1;
	private JLabel q1,q2,q3;
	private JTextField l1;
	private JTextField l2;
	private JTextField l3;
	private JTextField l4;
	private JTextField l5;
	private JTextField l6;
	private JTextField bal;
	private JTextField pay;
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pohe3 frame = new pohe3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
public void addtable(int id, String Name, int Qty, Double Price) {
		
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		
		DecimalFormat df = new DecimalFormat("00.00");
		double totPrice = Price * Double.valueOf(Qty);
		
		String TotalPrice = df.format(totPrice);
	
	//	t1.setText(df.format(totPrice));
		
	//	t1.setText();
		
		for(int row = 0; row < table.getRowCount(); row++) {
		if(Name == table.getValueAt(row, 1)) {
			dt.removeRow(table.convertRowIndexToModel(row));
			}
		}
		
		
		Vector v = new Vector();
		
		v.add(id);
		v.add(Name);
		v.add(Qty);
		v.add(TotalPrice);
		dt.addRow(v);
	}	
	/*
public void getsum() {
	int sum=0;
	for (int a=0; a<table.getRowCount(); a++){
		sum= sum+ Integer.parseInt(table.getValueAt(a, 4).toString());
	}
	t1.setText(Integer.toString(sum));
}
*/

	



	public void cal() {
		
		int numofRow = table.getRowCount();
		double tot = 00.00;
		
		for(int i =0; i<numofRow; i++) {
			double value = Double.valueOf(table.getValueAt(i, 3).toString());	
			tot += value ;
		
		}
		DecimalFormat df = new DecimalFormat("00.00");
		t1.setText(df.format(tot));
	}


	
	/**
	 * Launch the application.
	 */
	
	public pohe3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\project ty\\images\\indori pohe.jpg"));
		setTitle("SUDAMACHE POHE / POHE");
		initComponents();
		//getsum();
	}
	
	

	 


	/**
	 * Create the frame.
	 */
	 private void initComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton pohe1 = new JButton("New button");
		pohe1.setIcon(new ImageIcon("D:\\project ty\\images\\kande pohe.jpg"));
		pohe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = Integer.valueOf(l1.getText());
				++i;
				l1.setText(String.valueOf(i));
				addtable(1, "Kande Pohe" , i,20.00);
				cal();
				
			}
		});
		pohe1.setBounds(10, 10, 123, 99);
		contentPane.add(pohe1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("D:\\project ty\\images\\kokni pohe.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = Integer.valueOf(l2.getText());
				++i;
				l2.setText(String.valueOf(i));
				addtable(2, "Kokni Pohe  " , i,20.00);
				cal();
				
			}
		});
		btnNewButton_1.setBounds(184, 10, 123, 99);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("D:\\project ty\\images\\sambar pohe.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = Integer.valueOf(l3.getText());
				++i;
				l3.setText(String.valueOf(i));
				addtable(3, "Sambar Pohe" , i,20.00);
				cal();
				
			}
		});
		btnNewButton_2.setBounds(357, 10, 123, 99);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("D:\\project ty\\images\\dadpe pohe.jpg"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = Integer.valueOf(l4.getText());
				++i;
				l4.setText(String.valueOf(i));
				addtable(4, "Dadpe Pohe" , i,25.00);
				cal();
				
			}
		});
		btnNewButton_3.setBounds(10, 178, 123, 99);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setIcon(new ImageIcon("D:\\project ty\\images\\matki pohe.jpg"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = Integer.valueOf(l5.getText());
				++i;
				l5.setText(String.valueOf(i));
				addtable(5, "Matki Pohe  " , i,25.00);
				cal();
				
			}
		});
		btnNewButton_4.setBounds(184, 178, 123, 99);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setIcon(new ImageIcon("D:\\project ty\\images\\dahi pohe.jpg"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = Integer.valueOf(l6.getText());
				++i;
				l6.setText(String.valueOf(i));
				addtable(6, "Dahi Pohe  " , i,25.00);
				cal();
				
			}
		});
		btnNewButton_5.setBounds(357, 178, 123, 99);
		contentPane.add(btnNewButton_5);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 345, 470, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 470, 219);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Item", "Qty", "Price"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		
		final JTextArea b = new JTextArea();
		b.setFont(new Font("Arial", Font.PLAIN, 17));
		b.setForeground(new Color(0, 0, 0));
		b.setBounds(544, 22, 389, 398);
		contentPane.add(b);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(500, 424, 502, 148);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Total");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1.setBounds(10, 31, 84, 25);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Cash");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_2.setBounds(10, 66, 84, 25);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Balance");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_3.setBounds(10, 101, 84, 25);
		panel_1.add(lblNewLabel_4_3);
		
		t1 = new JTextField();
		t1.setText("0");
		t1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		t1.setBounds(104, 31, 96, 25);
		panel_1.add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton_3_1 = new JButton("Print");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					b.setText("	     SUDAMACHE POHE 				\n");
					b.setText(b.getText()+"    	   2B Ded Chowk, Phaltan\n");
					//b.setText(b.getText()+"	   Swara Complex,\n");
					b.setText(b.getText()+"	        +91 7519719696");
					
					Date obj = new Date();
					String date= obj.toString();
					
					b.setText(b.getText()+"\n"+    date+"\n");
					
					b.setText(b.getText() +"-----------------------------------------------------------------------\n");
					b.setText(b.getText() + "           Item \t\tQty \tPrice" +"\n");
					b.setText(b.getText() +"-----------------------------------------------------------------------\n");
					
					
					
					
					DefaultTableModel df = (DefaultTableModel) table.getModel();
					
					for(int i = 0; i< table.getRowCount(); i++) {
						
						String Name = df.getValueAt(i, 1).toString();
						String Qty = df.getValueAt(i, 2).toString();
						String Price = df.getValueAt(i, 3).toString();
						
						
						b.setText(b.getText()+"      "+ Name +"\t"+ Qty +"\t"+ Price+"\n");
					}
					b.setText(b.getText() +"-----------------------------------------------------------------------\n");
					b.setText(b.getText()+"  Sub Total :                               " + t1.getText() + "\n");
					b.setText(b.getText()+"  Cash       :                                " + pay.getText() + "\n");
					b.setText(b.getText()+"  Balance   :                               " + bal.getText() + "\n");
					b.setText(b.getText() +"-----------------------------------------------------------------------\n");
					b.setText(b.getText() +"                    Thanks You Visit Again...!"+"\n");
				//	b.setText(b.getText() +"-----------------------------------------------------------------------\n");
					b.print();
					
				}catch(Exception eq) {
					
					System.out.println(eq);
					
				}
				JOptionPane.showMessageDialog(null,"      Bill Successfully Printed!     ","DONE",JOptionPane.INFORMATION_MESSAGE );
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton_3_1.setBounds(339, 66, 96, 67);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Pay");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double tot = Double.valueOf(t1.getText());
				double paid = Double.valueOf(pay.getText());
				double balance = paid - tot;
				
				DecimalFormat df = new DecimalFormat("00.00");
				
				bal.setText(String.valueOf(df.format(balance)));	
						
						
					
				
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton_3_1_1.setBounds(218, 66, 96, 67);
		panel_1.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("Delete");
		btnNewButton_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel dt = (DefaultTableModel) table.getModel();
				
				String r = dt.getValueAt(table.getSelectedRow(), 0).toString();	
				
				int rw = table.getSelectedRow();
				dt.removeRow(rw);
			
		System.out.println(r);
			switch(r) {
			
			case "1":
				l1.setText("0");
				break;
				
			case "2":
				l2.setText("0");
				break;
				
			case "3":
				l3.setText("0");
				break;
				
			case "4":
				l4.setText("0");
				break;
				
			case "5":
				l5.setText("0");
				break;
				
			case "6":
				l6.setText("0");
				break;
				
				default:
					System.out.println("Over");
				
			}
			
			}
		});
		btnNewButton_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_1_1_1.setBounds(218, 20, 96, 33);
		panel_1.add(btnNewButton_3_1_1_1);
		
		bal = new JTextField();
		bal.setText("0");
		bal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bal.setColumns(10);
		bal.setBounds(104, 101, 96, 25);
		panel_1.add(bal);
		
		pay = new JTextField();
		pay.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pay.setColumns(10);
		pay.setBounds(104, 66, 96, 25);
		panel_1.add(pay);
		
		JButton btnNewButton_3_1_1_1_1 = new JButton("Exit");
		btnNewButton_3_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_1_1_1_1.setBounds(339, 20, 96, 33);
		panel_1.add(btnNewButton_3_1_1_1_1);
		
		l1 = new JTextField();
		l1.setText("0");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l1.setColumns(10);
		l1.setBounds(52, 143, 34, 25);
		contentPane.add(l1);
		
		l2 = new JTextField();
		l2.setText("0");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l2.setColumns(10);
		l2.setBounds(230, 143, 34, 25);
		contentPane.add(l2);
		
		l3 = new JTextField();
		l3.setText("0");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l3.setColumns(10);
		l3.setBounds(403, 143, 34, 25);
		contentPane.add(l3);
		
		l4 = new JTextField();
		l4.setText("0");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l4.setColumns(10);
		l4.setBounds(52, 310, 34, 25);
		contentPane.add(l4);
		
		l5 = new JTextField();
		l5.setText("0");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l5.setColumns(10);
		l5.setBounds(230, 310, 34, 25);
		contentPane.add(l5);
		
		l6 = new JTextField();
		l6.setText("0");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l6.setColumns(10);
		l6.setBounds(403, 310, 34, 25);
		contentPane.add(l6);
		
		JLabel lblSambar = new JLabel("SAMBAR 20/-");
		lblSambar.setFont(new Font("Segoe UI Historic", Font.BOLD, 24));
		lblSambar.setBounds(341, 108, 152, 25);
		contentPane.add(lblSambar);
		
		JLabel lblDadpe = new JLabel("DADPE 25/-");
		lblDadpe.setFont(new Font("Segoe UI Historic", Font.BOLD, 24));
		lblDadpe.setBounds(10, 275, 152, 25);
		contentPane.add(lblDadpe);
		
		JLabel lblMatki = new JLabel("MATKI 25/-");
		lblMatki.setFont(new Font("Segoe UI Historic", Font.BOLD, 24));
		lblMatki.setBounds(184, 275, 152, 25);
		contentPane.add(lblMatki);
		
		JLabel lblDahi = new JLabel("DAHI 25/-");
		lblDahi.setFont(new Font("Segoe UI Historic", Font.BOLD, 24));
		lblDahi.setBounds(367, 275, 152, 25);
		contentPane.add(lblDahi);
		
		JLabel lblKokni = new JLabel("KOKNI 20/-");
		lblKokni.setFont(new Font("Segoe UI Historic", Font.BOLD, 24));
		lblKokni.setBounds(179, 108, 152, 25);
		contentPane.add(lblKokni);
		
		JLabel lblKande = new JLabel("KANDE 20/-");
		lblKande.setFont(new Font("Segoe UI Historic", Font.BOLD, 24));
		lblKande.setBounds(10, 108, 152, 25);
		contentPane.add(lblKande);
	}
}
