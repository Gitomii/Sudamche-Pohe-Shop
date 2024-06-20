import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;

public class menu extends JFrame {

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
					menu frame = new menu();
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
	public menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\project ty\\images\\indori pohe.jpg"));
		setTitle("SUDAMACHE POHE / MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 0, 0));
		menuBar.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
		menuBar.setBounds(0, 10, 768, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Pohe");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("View All");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pohe3 frame = new pohe3();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_3 = new JMenu("Staff");
		mnNewMenu_3.setBackground(SystemColor.desktop);
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Details");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//table_staff window = new table_staff();
				//window.frmSudamachePohe.setVisible(true);
				
				staff frame = new staff();
				frame.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("About Us");
		mnNewMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("View");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about frame = new about();
				frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\project ty\\images\\sambar pohe.jpg"));
		lblNewLabel.setBounds(0, 29, 450, 484);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\project ty\\images\\download.png"));
		lblNewLabel_1.setBounds(481, 197, 225, 110);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\project ty\\images\\sambar pohe.jpg"));
		lblNewLabel_2.setBounds(0, 32, 408, 481);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\project ty\\images\\download.png"));
		lblNewLabel_2_1.setBounds(410, 32, 408, 481);
		contentPane.add(lblNewLabel_2_1);
	}
}
