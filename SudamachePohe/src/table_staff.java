import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class table_staff {

	JFrame frmSudamachePohe;
	private JTextField id;
	private JTextField name;
	private JTextField cont;
	private JTextField age;
	private JTextField work;
	private JTextField adder;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table_staff window = new table_staff();
					window.frmSudamachePohe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public table_staff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSudamachePohe = new JFrame();
		frmSudamachePohe.setTitle("SUDAMACHE POHE / STAFF");
		frmSudamachePohe.setBounds(100, 100, 996, 505);
		frmSudamachePohe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSudamachePohe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 982, 501);
		frmSudamachePohe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(41, 81, 100, 22);
		panel.add(lblNewLabel);
		
		JLabel lblN = new JLabel("Name:");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblN.setBounds(41, 123, 100, 22);
		panel.add(lblN);
		
		JLabel lblMobileNo = new JLabel("Mobile No.:");
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMobileNo.setBounds(41, 169, 100, 22);
		panel.add(lblMobileNo);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAge.setBounds(41, 211, 100, 22);
		panel.add(lblAge);
		
		JLabel lblWork = new JLabel("Work:");
		lblWork.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWork.setBounds(41, 254, 100, 22);
		panel.add(lblWork);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(41, 292, 100, 22);
		panel.add(lblAddress);
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		id.setBounds(151, 81, 172, 22);
		panel.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 18));
		name.setColumns(10);
		name.setBounds(151, 123, 172, 22);
		panel.add(name);
		
		cont = new JTextField();
		cont.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cont.setColumns(10);
		cont.setBounds(151, 169, 172, 22);
		panel.add(cont);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 18));
		age.setColumns(10);
		age.setBounds(151, 211, 172, 22);
		panel.add(age);
		
		work = new JTextField();
		work.setFont(new Font("Tahoma", Font.PLAIN, 18));
		work.setColumns(10);
		work.setBounds(151, 254, 172, 22);
		panel.add(work);
		
		adder = new JTextField();
		adder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		adder.setColumns(10);
		adder.setBounds(151, 292, 172, 22);
		panel.add(adder);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(333, 81, 639, 355);
		panel.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				if(i>=0) {
				id.setText(model.getValueAt(i, 0).toString());
				name.setText(model.getValueAt(i, 1).toString());
				cont.setText(model.getValueAt(i, 2).toString());
				age.setText(model.getValueAt(i, 3).toString());
				work.setText(model.getValueAt(i, 4).toString());
				adder.setText(model.getValueAt(i, 5).toString());
			//	JOptionPane.showMessageDialog(null, "Updated Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Select a ROW First");
				}
			}
		});
		model=new DefaultTableModel();
		Object[] column = {"ID","Name","Contact","Age","Work","Address"};
		final Object[] row = new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("") || name.getText().equals("") || cont.getText().equals("") || age.getText().equals("") || work.getText().equals("") || adder.getText().equals(""))
				{
				JOptionPane.showMessageDialog(null,"Please Fill Complete Information" );
				}
				else
				{
					row[0]=id.getText();
					row[1]=name.getText();
					row[2]=cont.getText();
					row[3]=age.getText();
					row[4]=work.getText();
					row[5]=adder.getText();
					
					model.addRow(row);
					
					id.setText("");
					name.setText("");
					cont.setText("");
					age.setText("");
					work.setText("");
					adder.setText("");
					
					JOptionPane.showMessageDialog(null, "Saved Successfully");
					
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(41, 344, 100, 31);
		panel.add(btnNewButton);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				model.setValueAt(id.getText(), i, 0);
				model.setValueAt(name.getText(), i, 1);
				model.setValueAt(cont.getText(), i, 2);
				model.setValueAt(age.getText(), i, 3);
				model.setValueAt(work.getText(), i, 4);
				model.setValueAt(adder.getText(), i, 5);
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdate.setBounds(209, 344, 100, 31);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Deleted Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Select a ROW First");
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(41, 405, 100, 31);
		panel.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				name.setText("");
				cont.setText("");
				age.setText("");
				work.setText("");
				adder.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(209, 405, 100, 31);
		panel.add(btnClear);
		
		JLabel lblNewLabel_1 = new JLabel("Staff Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 32));
		lblNewLabel_1.setBounds(420, 28, 210, 31);
		panel.add(lblNewLabel_1);
	}
}
