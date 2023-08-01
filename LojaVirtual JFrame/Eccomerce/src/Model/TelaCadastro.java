package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txUser;
	private JLabel lbDataN;
	private JLabel lbUser;
	private JLabel lbSenha1;
	private JTextField txEmail;
	private JTextField txNome;
	private JPasswordField txSenha;
	private JButton btnEndereco;
	private JButton btnVoltar;
	private static int clicadas = 0;
	
//	static TelaCadastro cadastro = new TelaCadastro() ;
	


	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaCadastro(Clientes cliente, ArrayList<Clientes> clientes) throws ParseException {
		setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		setTitle("Cadastrar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbNome.setForeground(new Color(255, 255, 255));
		lbNome.setBounds(35, 30, 46, 14);
		contentPane.add(lbNome);
		
		txUser = new JTextField();
		txUser.setBounds(35, 140, 152, 20);
		contentPane.add(txUser);
		txUser.setColumns(10);
		
		lbDataN = new JLabel("Data de Nascimento");
		lbDataN.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbDataN.setForeground(Color.WHITE);
		lbDataN.setBounds(35, 75, 152, 14);
		contentPane.add(lbDataN);
		
		lbUser = new JLabel("Usu�rio");
		lbUser.setForeground(new Color(255, 255, 255));
		lbUser.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbUser.setBounds(35, 123, 58, 14);
		contentPane.add(lbUser);
		
		lbSenha1 = new JLabel("Senha");
		lbSenha1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbSenha1.setForeground(new Color(255, 255, 255));
		lbSenha1.setBounds(35, 169, 46, 14);
		contentPane.add(lbSenha1);
		
		txEmail = new JTextField();
		txEmail.setBounds(244, 95, 152, 20);
		contentPane.add(txEmail);
		txEmail.setColumns(10);
		
		MaskFormatter dataN = new MaskFormatter("##/##/####");
		dataN.setPlaceholderCharacter('_');
		JFormattedTextField txDataN = new JFormattedTextField(dataN);
		txDataN.setBounds(35, 95, 152, 20);
		contentPane.add(txDataN);
		
		JLabel lbCpf = new JLabel("CPF");
		lbCpf.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lbCpf.setForeground(new Color(255, 255, 255));
		lbCpf.setBounds(244, 29, 70, 14);
		contentPane.add(lbCpf);
		
		MaskFormatter fCpf = new MaskFormatter("###.###.###-##");
		fCpf.setPlaceholderCharacter('_');
		JFormattedTextField txCpf = new JFormattedTextField(fCpf);
		txCpf.setBounds(244, 48, 152, 20);
		contentPane.add(txCpf);
		
		txNome = new JTextField();
		txNome.setBounds(35, 48, 152, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setForeground(new Color(255, 255, 255));
		lbEmail.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbEmail.setBounds(244, 77, 58, 14);
		contentPane.add(lbEmail);
		
		txSenha = new JPasswordField();
		txSenha.setBounds(35, 187, 152, 20);
		contentPane.add(txSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar.setBounds(244, 177, 152, 33);
		contentPane.add(btnCadastrar);
		
		btnEndereco = new JButton("Novo Endere�o");
		btnEndereco.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		btnEndereco.setBackground(Color.WHITE);
		btnEndereco.setBounds(244, 139, 152, 33);
		contentPane.add(btnEndereco);
		
		btnEndereco.addActionListener(e->{
			clicadas++;
			TelaEndereco endereco;
			try {
				endereco = new TelaEndereco(cliente);
				endereco.setVisible(true);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			};
		});
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(274, 221, 89, 23);
		contentPane.add(btnVoltar);
		
		btnVoltar.addActionListener(e->{
			dispose();
			TelaInicial frame = new TelaInicial();
			frame.setVisible(true);
		});
		
		JLabel lbIcon = new JLabel("");
		lbIcon.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbIcon.setIcon(new ImageIcon("./assets/azul.jpg"));
		lbIcon.setBounds(0, 0, 434, 261);
		contentPane.add(lbIcon); 
        
        
        btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txNome.getText();
		        String dNasc = txDataN.getText();
		        String email = txEmail.getText();
		        String cpf = txCpf.getText();
		        String login = txUser.getText();
		        String senha = String.valueOf(txSenha.getPassword());
		        
		        if(nome.length() == 0) {
		        	JOptionPane.showInternalMessageDialog(null, "Coloque um nome válido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        }else if(dNasc.equals("__/__/____")) {
		        	JOptionPane.showInternalMessageDialog(null, "Coloque uma Data de Nascimento válida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        }else if(email.length() == 0) {
		        	JOptionPane.showInternalMessageDialog(null, "Coloque um E-mail válido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        }else if(cpf.equals("___.___.___-__")) {
		        	JOptionPane.showInternalMessageDialog(null, "Coloque um CPF válido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        }else if(login.length() == 0) {
		        	JOptionPane.showInternalMessageDialog(null, "Preencha o campo login!", "Erro", JOptionPane.ERROR_MESSAGE);
		        }else if(senha.length() == 0) {
		        	JOptionPane.showInternalMessageDialog(null, "Preencha o campo senha!", "Erro", JOptionPane.ERROR_MESSAGE);
		        }else if (clicadas==0){
		        	JOptionPane.showInternalMessageDialog(null, "Cadastre um Endereço", "Erro", JOptionPane.ERROR_MESSAGE);
		        }else if (buscarCliente(cpf, clientes) == null && buscarCliente1(login, clientes) == null) {
		            Clientes cadastrado = new Clientes(nome, dNasc, cpf, email, login, senha);
		            clientes.add(cadastrado);
		            JOptionPane.showInternalMessageDialog(null, "Cadastro Efetuado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
		            dispose();
		            TelaInicial telaInit = new TelaInicial();
				    telaInit.setVisible(true);
		        } else {
		            JOptionPane.showInternalMessageDialog(null, "Cliente Existente!", "Cadastro", JOptionPane.WARNING_MESSAGE);
		        }
	
			}
		});
        
      
        
	}

    public static Clientes buscarCliente1(String login, ArrayList<Clientes> clientes) {
        Clientes clienteL = null;
        for (Clientes listaE : clientes) {
            if (listaE.getLogin().equals(login)) {
                clienteL = listaE;
            }
        }
        return clienteL;
    }

    public static Clientes buscarCliente(String cpf, ArrayList<Clientes> clientes) {
        Clientes clienteB = null;
        for (Clientes listaE : clientes) {
            if (listaE.getCpf().equals(cpf)) {
                clienteB = listaE;
            }
        }
        return clienteB;

    }
}
