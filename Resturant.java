package ass1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Resturant extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resturant frame = new Resturant();
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
	public Resturant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 777);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 608, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IDLE CENTER");
		lblNewLabel.setFont(new Font("Shonar Bangla", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(227, 25, 126, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(39, 11, 82, 15);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(409, 25, 178, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(460, 56, 89, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 99, 608, 496);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 608, 37);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu_3 = new JMenu("User Information");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu = new JMenu("Resturant");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("All");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AllFood allfood=new AllFood();
				allfood.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Food");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("All");
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AllFood allfood=new AllFood();
				allfood.setVisible(true);
			}
		});
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AllFood allfood=new AllFood();
				allfood.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Account Information");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_4 = new JMenu("Package Details");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Log out");
		mnNewMenu_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login=new Login();
				login.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Feedbeck");
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Feedbeck Resturant");
		mntmNewMenuItem_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Feedbeck feedbeck=new Feedbeck();
				feedbeck.setVisible(true);
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_7 = new JMenu("Cart");
		mnNewMenu_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cart cart=new Cart();
				cart.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_7);
		
		JLabel lblNewLabel_2 = new JLabel("Lalbagh Kitchen");
		lblNewLabel_2.setBounds(224, 48, 89, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(129, 123, 112));
		panel_2.setBounds(10, 88, 588, 136);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Picture 1");
		lblNewLabel_3.setBounds(69, 111, 49, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Picture 2");
		lblNewLabel_3_1.setBounds(239, 111, 49, 14);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Picture 3");
		lblNewLabel_3_1_1.setBounds(447, 111, 49, 14);
		panel_2.add(lblNewLabel_3_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 0, 168));
		panel_3.setBounds(10, 235, 588, 237);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Food List");
		lblNewLabel_4.setBounds(240, 11, 49, 14);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Food food=new Food();
				food.setVisible(true);
			}
		});
		panel_4.setBounds(36, 66, 125, 146);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Rice");
		lblNewLabel_5.setBounds(33, 121, 49, 14);
		panel_4.add(lblNewLabel_5);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(230, 66, 125, 146);
		panel_3.add(panel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Dhal");
		lblNewLabel_5_1.setBounds(33, 121, 49, 14);
		panel_4_1.add(lblNewLabel_5_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(430, 66, 125, 146);
		panel_3.add(panel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Fish");
		lblNewLabel_5_1_1.setBounds(33, 121, 49, 14);
		panel_4_1_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_10 = new JLabel("Ordered by top order food from this resturant");
		lblNewLabel_10.setBounds(157, 27, 249, 14);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_6 = new JLabel("About Resturant");
		lblNewLabel_6.setBounds(232, 606, 98, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(10, 633, 49, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Review");
		lblNewLabel_8.setBounds(10, 660, 49, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Contact");
		lblNewLabel_9.setBounds(10, 685, 49, 14);
		contentPane.add(lblNewLabel_9);
		
		
	}
}
