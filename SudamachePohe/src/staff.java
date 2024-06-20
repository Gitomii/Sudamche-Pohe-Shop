import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class staff extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t6;
	private JTextField t5;
	private JTable table;
	DefaultTableModel model;
	protected Component frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staff frame = new staff();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private void clearfield() {
		t1.setText(null);
		t2.setText(null);
		t3.setText(null);
		t4.setText(null);
		t5.setText(null);
		t6.setText(null);
	}
	/**
	 * Create the frame.
	 */
	public staff() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\project ty\\images\\indori pohe.jpg"));
		setTitle("SUDAMACHE POHE / STAFF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1113, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(57, 106, 68, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(57, 155, 68, 28);
		contentPane.add(lblName);
		
		JLabel lblMobileNo = new JLabel("Mobile No.:");
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMobileNo.setBounds(57, 198, 91, 28);
		contentPane.add(lblMobileNo);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAge.setBounds(57, 236, 68, 28);
		contentPane.add(lblAge);
		
		JLabel lblWork = new JLabel("Work:");
		lblWork.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWork.setBounds(57, 281, 68, 28);
		contentPane.add(lblWork);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(57, 323, 91, 28);
		contentPane.add(lblAddress);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t1.setBounds(159, 106, 184, 28);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t2.setColumns(10);
		t2.setBounds(159, 150, 184, 28);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t3.setColumns(10);
		t3.setBounds(158, 193, 185, 28);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t4.setColumns(10);
		t4.setBounds(159, 236, 184, 28);
		contentPane.add(t4);
		
		t6 = new JTextField();
		t6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t6.setColumns(10);
		t6.setBounds(158, 323, 185, 28);
		contentPane.add(t6);
		
		t5 = new JTextField();
		t5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t5.setColumns(10);
		t5.setBounds(159, 281, 184, 28);
		contentPane.add(t5);
		
		JButton b1 = new JButton("Add");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] row=new Object[7];
				model=(DefaultTableModel)table.getModel();	
				//model.addRow(row);
				
				try{
					String var1=t1.getText();
					String var2=t2.getText();
					String var3=t3.getText();
					String var4=t4.getText();
					String var5=t5.getText();
					String var6=t6.getText();
					
					model.addRow(new Object[]{ var1,var2,var3,var4,var5,var6 });
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/spohe","root","srushti");
					String sql="INSERT INTO staff VALUES(?,?,?,?,?,?)";	
					PreparedStatement pq=con.prepareStatement(sql);
					pq.setString(1,var1);
					pq.setString(2,var2);			
					pq.setString(3, var3);	
					pq.setString(4, var4);
					pq.setString(5, var5);
					pq.setString(6, var6);
					
					
					pq.executeUpdate();
					System.out.println("YES");
					JOptionPane.showMessageDialog(null, "done");
					clearfield();
					con.close();
					}
				
					catch(Exception m){
						JOptionPane.showMessageDialog(null, "enter data");
					System.out.println("NO");
					}
			                                                                                             
		//	JOptionPane.showMessageDialog(null, "DONE SUCCESSFULLY","  ",JOptionPane.INFORMATION_MESSAGE);	
			
				}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b1.setBounds(55, 381, 104, 31);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Update");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/spohe","root","srushti");
				
				String sql3 = "update staff set name=?,mobileno=?,age=?,work=?, address=? where id=?";
				PreparedStatement pq = con.prepareStatement(sql3);
				
				pq.setString(1, t2.getText());
				pq.setString(2, t3.getText());
				pq.setString(3, t4.getText());
				pq.setString(4, t5.getText());
				pq.setString(5, t6.getText());
				pq.setString(6, t1.getText());
				
				pq.executeUpdate();
				JOptionPane.showMessageDialog(null, "Updated");
				
				con.close();
				}
				catch(Exception q){
					System.out.println(q);
				}
			}
				
				
				
				
				/*try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/spohe","root","srushti");
					//PreparedStatement pq = con.prepareStatement("update inff set studname=?,gender=?,dept=?,localadd=?,contactno=?,emailid=?,dob=?,prnno=?,passyear=? where rollno=?");				    
					String a = t1.getText();
					String b = t2.getText();
					String c = t3.getText();
					String d = t4.getText();
					String e1 = t5.getText();
					String f = t6.getText();
					
					String sql3 = "update staff set name=?,mobileno=?,age=?,work=?, address=? where id=?";
					PreparedStatement pq = con.prepareStatement(sql3);
					
					pq.setString(1,b);
					pq.setString(2,c);
					pq.setString(3,d);
					pq.setString(4,e1);
					pq.setString(5,f);
					pq.setString(6,a);
					
					pq.execute();
					System.out.println("YES");
					
					
			}
				
				catch(Exception q){
					System.out.println(q);
				}*/
			
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b2.setBounds(239, 381, 104, 31);
		contentPane.add(b2);
		
		JButton b3 = new JButton("Delete");
		b3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b3.setBounds(57, 422, 104, 31);
		contentPane.add(b3);
		
		JButton b4 = new JButton("Clear");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
				t6.setText(null);
			
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b4.setBounds(239, 422, 104, 31);
		contentPane.add(b4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(401, 106, 631, 387);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Mobile No.", "Age", "Work", "Address"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		model = new DefaultTableModel();
		scrollPane.setViewportView(table);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(frame, "do you want to exit","confirm",JOptionPane.YES_NO_OPTION);
				if(response == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(239, 467, 104, 31);
		contentPane.add(btnExit);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/spohe","root","srushti");
					
					String sql3 = "select * from staff where id=?";
					PreparedStatement pq = con.prepareStatement(sql3);
					pq.setInt(1, Integer.parseInt(t1.getText()));
					ResultSet rs=pq.executeQuery();
					
					if(rs.next()) {
						t2.setText(rs.getString("name"));
						t3.setText(rs.getString("mobileno"));
						t4.setText(rs.getString("age"));
						t5.setText(rs.getString("work"));
						t6.setText(rs.getString("address"));
						
						JOptionPane.showInternalMessageDialog(null, "record found");
						
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "not found");
					}
					con.close();
					
					}
				catch(Exception q){
					JOptionPane.showInternalMessageDialog(null, "enter the value of id");
				}
				
			}
		});
		btnSelect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSelect.setBounds(55, 463, 104, 31);
		contentPane.add(btnSelect);
		
		JLabel lblNewLabel_1 = new JLabel("Staff Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 45));
		lblNewLabel_1.setBounds(380, 22, 390, 66);
		contentPane.add(lblNewLabel_1);
	}
}
