import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//import stud.menu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField t2;
	Connection con;
	Statement st;
	ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\project ty\\images\\indori pohe.jpg"));
		setTitle("SUDAMACHE POHE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sudamache Pohe");
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 40));
		lblNewLabel_1.setBounds(29, 10, 386, 75);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(76, 145, 179, 36);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		
		JLabel lblPassward = new JLabel("Passward:");
		lblPassward.setForeground(new Color(255, 255, 255));
		lblPassward.setBounds(76, 210, 179, 36);
		contentPane.add(lblPassward);
		lblPassward.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		
		t1 = new JTextField();
		t1.setBounds(333, 145, 179, 36);
		contentPane.add(t1);
		t1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		t1.setColumns(10);
		
		t2 = new JPasswordField();
		t2.setBounds(333, 209, 179, 36);
		contentPane.add(t2);
		t2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(450, 302, 121, 36);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 30));
		btnExit.setBackground(new Color(255, 255, 255));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(246, 302, 121, 36);
		contentPane.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
			}
		});
		btnReset.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 30));
		btnReset.setBackground(new Color(255, 255, 255));
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(48, 302, 131, 36);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				String s1=t1.getText();
				@SuppressWarnings("deprecation")
				String s2=t2.getText();
				
				if(s2.contains("123")&& s1.contains("om"))
				{
					t1.setText(null);
					t2.setText(null);
					JOptionPane.showMessageDialog(null,"                    Login Successfully     ","Welcome",JOptionPane.PLAIN_MESSAGE);
					menu.main(null);
			//		JOptionPane.showMessageDialog(null,"                    Login Successfully     ","Welcome",JOptionPane.PLAIN_MESSAGE);
				}		
				
				else {
					JOptionPane.showMessageDialog(null,"          Invalid  Details     ","ERROR",JOptionPane.ERROR_MESSAGE);
					t1.setText(null);
					t2.setText(null);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\project ty\\images\\matki pohe.jpg"));
		lblNewLabel_2.setBounds(0, 0, 606, 389);
		contentPane.add(lblNewLabel_2);
		
	}
}
