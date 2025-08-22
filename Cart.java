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
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cart extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField textField;
private JTable table;
private DefaultTableModel model;
private JLabel lblTotalAmount;
private JLabel lblAccountBalance;
private double accountBalance = 1000.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart frame = new Cart();
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
	public Cart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 686);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 641, 101);
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
		panel_1.setBounds(0, 98, 641, 513);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 630, 37);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu_3 = new JMenu("User Information");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserInfo user=new UserInfo();
				user.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu = new JMenu("Resturant");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("All");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Food");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("All");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Account Information");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AccountInfo acc=new AccountInfo();
				acc.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_4 = new JMenu("Package Details");
		mnNewMenu_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PackageInfo pac=new PackageInfo();
				pac.setVisible(true);
			}
		});
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
		mnNewMenu_6.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_7 = new JMenu("Cart");
		menuBar.add(mnNewMenu_7);
		
		JMenu mnNewMenu_8 = new JMenu("Home");
		mnNewMenu_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomePage home=new HomePage();
				home.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_8);
		
		JLabel lblNewLabel_2 = new JLabel("Cart");
		lblNewLabel_2.setBounds(270, 48, 89, 14);
		panel_1.add(lblNewLabel_2);
		
               JButton btnNewButton_1 = new JButton("Order");
               btnNewButton_1.setBounds(116, 459, 89, 23);
               panel_1.add(btnNewButton_1);

               JButton btnNewButton_1_1 = new JButton("Delete from Cart");
               btnNewButton_1_1.setBounds(304, 459, 165, 23);
               panel_1.add(btnNewButton_1_1);

               table = new JTable();
               table.setForeground(new Color(0, 0, 0));
               table.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
               table.setBackground(new Color(255, 0, 0));
               table.setBorder(new CompoundBorder());
               model = new DefaultTableModel(
                               new Object[] {
                                               "Serial", "Food Name", "Resturant Name", "Quantity", "Price"
                               }, 0);
               table.setModel(model);
               table.setBounds(29, 81, 541, 204);
               panel_1.add(table);

               JLabel lblNewLabel_3 = new JLabel("Total Amount");
               lblNewLabel_3.setBounds(162, 311, 89, 14);
               panel_1.add(lblNewLabel_3);

               lblTotalAmount = new JLabel("0 Taka");
               lblTotalAmount.setBounds(310, 311, 100, 14);
               panel_1.add(lblTotalAmount);

               JLabel lblNewLabel_3_1 = new JLabel("Account Balance");
               lblNewLabel_3_1.setBounds(162, 345, 89, 14);
               panel_1.add(lblNewLabel_3_1);

               lblAccountBalance = new JLabel(accountBalance + " Taka");
               lblAccountBalance.setBounds(310, 345, 100, 14);
               panel_1.add(lblAccountBalance);

               btnNewButton_1.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                               double total = calculateTotal();
                               if (total == 0) {
                                       JOptionPane.showMessageDialog(Cart.this, "Cart is empty");
                                       return;
                               }
                               if (total > accountBalance) {
                                       JOptionPane.showMessageDialog(Cart.this, "Insufficient balance");
                                       return;
                               }
                               try (PrintWriter out = new PrintWriter(new FileWriter("orders.txt", true))) {
                                       for (int i = 0; i < model.getRowCount(); i++) {
                                               Object food = model.getValueAt(i, 1);
                                               if (food == null) {
                                                       continue;
                                               }
                                               Object serial = model.getValueAt(i, 0);
                                               Object rest = model.getValueAt(i, 2);
                                               Object qty = model.getValueAt(i, 3);
                                               Object price = model.getValueAt(i, 4);
                                               out.println(serial + "," + food + "," + rest + "," + qty + "," + price);
                                       }
                               } catch (IOException ex) {
                                       JOptionPane.showMessageDialog(Cart.this, "Unable to save order");
                                       return;
                               }
                               accountBalance -= total;
                               lblAccountBalance.setText(accountBalance + " Taka");
                               model.setRowCount(0);
                               updateTotal();
                               JOptionPane.showMessageDialog(Cart.this, "Order placed successfully");
                       }
               });

               btnNewButton_1_1.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                               int[] rows = table.getSelectedRows();
                               for (int i = rows.length - 1; i >= 0; i--) {
                                       model.removeRow(rows[i]);
                               }
                               updateTotal();
                       }
               });
		
		JLabel lblNewLabel_5 = new JLabel("Order this Item regularly for next one");
		lblNewLabel_5.setBounds(140, 392, 232, 14);
		panel_1.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("week");
		rdbtnNewRadioButton.setBounds(357, 388, 62, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(113, 388, 21, 23);
		panel_1.add(chckbxNewCheckBox);
		
               JRadioButton rdbtnMounth = new JRadioButton("month");
               rdbtnMounth.setBounds(439, 388, 62, 23);
               panel_1.add(rdbtnMounth);



       }

       private void updateTotal() {
               double total = calculateTotal();
               lblTotalAmount.setText(total + " Taka");
       }

       private double calculateTotal() {
               double total = 0;
               for (int i = 0; i < model.getRowCount(); i++) {
                       Object qtyObj = model.getValueAt(i, 3);
                       Object priceObj = model.getValueAt(i, 4);
                       if (qtyObj != null && priceObj != null) {
                               try {
                                       double qty = Double.parseDouble(qtyObj.toString());
                                       double price = Double.parseDouble(priceObj.toString());
                                       total += qty * price;
                               } catch (NumberFormatException ex) {
                                       // ignore invalid numbers
                               }
                       }
               }
               return total;
       }
}
