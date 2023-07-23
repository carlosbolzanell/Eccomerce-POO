package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaInicial extends JFrame {

	static ArrayList<Clientes> clientes = new ArrayList<Clientes>();
	static Clientes cliente = new Clientes();
	private JPanel contentPane;


	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("Bolzanell's Shop");
		lbTitulo.setForeground(new Color(255, 255, 255));
		lbTitulo.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 30));
		lbTitulo.setBounds(123, 78, 187, 53);
		contentPane.add(lbTitulo);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBackground(new Color(0, 255, 255));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TelaCadastro cadastro = new TelaCadastro(cliente, clientes);
					dispose();
					cadastro.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCadastro.setBounds(101, 128, 112, 28);
		contentPane.add(btnCadastro);
		
		JButton btnLogar = new JButton("Login");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin(cliente, clientes);
				login.setVisible(true);
				dispose();
			}
		});
		btnLogar.setBackground(new Color(0, 255, 255));
		btnLogar.setBounds(223, 128, 111, 28);
		contentPane.add(btnLogar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./assets/azul.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
