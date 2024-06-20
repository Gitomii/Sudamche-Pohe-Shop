import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;

public class pr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JButton btnPrint;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pr frame = new pr();
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
	public pr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(119, 69, 96, 19);
		contentPane.add(t1);
		t1.setColumns(10);
		
		final JTextArea txa = new JTextArea();
		txa.setEditable(false);
		txa.setBounds(302, 37, 288, 257);
		contentPane.add(txa);
		
		JButton btnNewButton = new JButton("ADD RECEIPT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txa.setText("========================================"+"\n"+"\t"+"SUDAMACHE POHE"+"\n"+"                  Contact Number:7519719696"+"\n" 
				+"\t"+ "Address:200B, Phaltan"+"\n"+"========================================");
				
				Date obj = new Date();
				String date= obj.toString();
				
				txa.setText(txa.getText()+"     \n"+    date+"\n \n");
				
				
				txa.setText(txa.getText()+"                             "+"ID            :"+"\t"+t1.getText()+"\n");
				txa.setText(txa.getText()+"                             "+"TYPE      :"+"\t"+t2.getText()+"\n");
				txa.setText(txa.getText()+"                             "+"QTY        :"+"\t"+t3.getText()+"\n");
			}
		});
		btnNewButton.setBounds(47, 225, 153, 27);
		contentPane.add(btnNewButton);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(119, 113, 96, 19);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(119, 157, 96, 19);
		contentPane.add(t3);
		
		btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txa.print();		
					}
				
				catch(Exception w) {
					
				}
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrint.setBounds(375, 321, 137, 27);
		contentPane.add(btnPrint);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(38, 67, 71, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblType = new JLabel("TYPE");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblType.setBounds(38, 111, 71, 19);
		contentPane.add(lblType);
		
		JLabel lblQty = new JLabel("QTY");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQty.setBounds(38, 155, 71, 19);
		contentPane.add(lblQty);
		
		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(47, 262, 153, 27);
		contentPane.add(btnClear);
	}
}
