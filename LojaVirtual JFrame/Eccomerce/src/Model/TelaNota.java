package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaNota extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public TelaNota() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("BOLZANELL'S SHOP");
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 18));
		lblNewLabel.setBounds(121, 11, 173, 31);
		contentPane.add(lblNewLabel);
	}
}
