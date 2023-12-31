package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txUser;
	private JPasswordField txSenha;

	/**
	 * Create the frame.
	 */
	public TelaLogin(Clientes cliente, ArrayList<Clientes> clientes) {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUser = new JLabel("Usu�rio");
		lbUser.setForeground(Color.WHITE);
		lbUser.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbUser.setBounds(189, 61, 58, 14);
		contentPane.add(lbUser);
		
		txUser = new JTextField();
		txUser.setColumns(10);
		txUser.setBounds(141, 79, 152, 20);
		contentPane.add(txUser);
		
		JLabel lbSenha1 = new JLabel("Senha");
		lbSenha1.setForeground(Color.WHITE);
		lbSenha1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbSenha1.setBounds(189, 122, 46, 14);
		contentPane.add(lbSenha1);
		
		txSenha = new JPasswordField();
		txSenha.setBounds(141, 141, 152, 20);
		contentPane.add(txSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String login1 = txUser.getText();
		        String senha1 = String.valueOf(txSenha.getPassword());
		        
		        boolean logado = false;
		        for (Clientes log : clientes) {
		            if (log.logar(login1, senha1).equals("1")) {
		                JOptionPane.showMessageDialog(null, "Acesso Efetuado", "Acesso efetuado", JOptionPane.INFORMATION_MESSAGE);
		                
		                dispose();
		                TelaLoja frame = new TelaLoja(log);
		                frame.setVisible(true);
		                
		                logado = true;
		            }
		        }
		        if (!logado) {
		            JOptionPane.showMessageDialog(null, "Login ou Senha Incorretos", "Acesso negado!", JOptionPane.INFORMATION_MESSAGE);

		        }
			}
		});
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setBounds(172, 187, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./assets/azul.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(172, 215, 89, 23);
		contentPane.add(btnVoltar);
		
		btnVoltar.addActionListener(e->{
			dispose();
			TelaInicial frame = new TelaInicial();
			frame.setVisible(true);
		});
	}

}
