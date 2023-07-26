package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField txRua;
	private JTextField txCidade;
	private JTextField txNumero;
	private JTextField txCompl;
	private JTextField txIdentificacao;

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaEndereco(Clientes cliente) throws ParseException {
		setTitle("Novo Endereço");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCep = new JLabel("CEP");
		lbCep.setForeground(new Color(255, 255, 255));
		lbCep.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbCep.setBounds(38, 66, 46, 14);
		contentPane.add(lbCep);
		
		txRua = new JTextField();
		txRua.setColumns(10);
		txRua.setBounds(94, 94, 96, 20);
		contentPane.add(txRua);
		
		JLabel lbRua = new JLabel("Rua");
		lbRua.setForeground(new Color(255, 255, 255));
		lbRua.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbRua.setBounds(38, 97, 46, 14);
		contentPane.add(lbRua);
		
		txCidade = new JTextField();
		txCidade.setColumns(10);
		txCidade.setBounds(94, 126, 96, 20);
		contentPane.add(txCidade);
		
		JLabel lbCidade = new JLabel("Cidade");
		lbCidade.setForeground(new Color(255, 255, 255));
		lbCidade.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbCidade.setBounds(38, 127, 56, 14);
		contentPane.add(lbCidade);
		
		JLabel lbUf = new JLabel("UF");
		lbUf.setForeground(new Color(255, 255, 255));
		lbUf.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbUf.setBounds(38, 158, 46, 14);
		contentPane.add(lbUf);
		
		txNumero = new JTextField();
		txNumero.setColumns(10);
		txNumero.setBounds(300, 63, 96, 20);
		contentPane.add(txNumero);
		
		JLabel lbNmero = new JLabel("Número");
		lbNmero.setForeground(new Color(255, 255, 255));
		lbNmero.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbNmero.setBounds(233, 66, 76, 14);
		contentPane.add(lbNmero);
		
		JLabel lbComplemento = new JLabel("Complemento");
		lbComplemento.setForeground(new Color(255, 255, 255));
		lbComplemento.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbComplemento.setBounds(197, 100, 112, 14);
		contentPane.add(lbComplemento);
		
		txCompl = new JTextField();
		txCompl.setColumns(10);
		txCompl.setBounds(300, 96, 96, 20);
		contentPane.add(txCompl);
		
		JLabel lbIdentif = new JLabel("Identificação");
		lbIdentif.setForeground(new Color(255, 255, 255));
		lbIdentif.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbIdentif.setBounds(105, 12, 113, 19);
		contentPane.add(lbIdentif);
		
		txIdentificacao = new JTextField();
		txIdentificacao.setColumns(10);
		txIdentificacao.setBounds(211, 11, 113, 20);
		contentPane.add(txIdentificacao);
		
		JButton btCadastro = new JButton("Cadastrar");
		btCadastro.setBounds(184, 206, 103, 32);
		contentPane.add(btCadastro);
		
		MaskFormatter cep = new MaskFormatter("#####-###");
		cep.setPlaceholderCharacter('_');

		JFormattedTextField txCep = new JFormattedTextField(cep);
		txCep.setBounds(94, 63, 96, 20);
		contentPane.add(txCep);
		
		JComboBox cbEstado = new JComboBox();
		cbEstado.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 10));
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"}));
		cbEstado.setBounds(94, 157, 96, 22);
		contentPane.add(cbEstado);
		
		btCadastro.addActionListener(e->{
			
			if(txIdentificacao.getText().equals("")) {
				JOptionPane.showInternalMessageDialog(null, "Preencha o campo Identificação", "Erro", JOptionPane.ERROR_MESSAGE);
			}else if(txCep.getText().equals("_____-___")) {
				JOptionPane.showInternalMessageDialog(null, "Preencha o campo CEP!", "Erro", JOptionPane.ERROR_MESSAGE);
			}else if(txRua.getText().equals("")) {
				JOptionPane.showInternalMessageDialog(null, "Preencha o campo Rua!", "Erro", JOptionPane.ERROR_MESSAGE);
			}else if(txCidade.getText().equals("")) {
				JOptionPane.showInternalMessageDialog(null, "Preencha o campo Cidade!", "Erro", JOptionPane.ERROR_MESSAGE);
			}else if(txNumero.getText().equals("")) {
				JOptionPane.showInternalMessageDialog(null, "Preencha o campo Número!", "Erro", JOptionPane.ERROR_MESSAGE);
			}else {
				int numero = Integer.parseInt(txNumero.getText());
				Endereco endereco1 = new Endereco(txIdentificacao.getText(), txRua.getText(), txCep.getText(), txCidade.getText(), cbEstado.getSelectedItem().toString() , numero , txCompl.getText());
				cliente.addEndereco(endereco1);
				JOptionPane.showInternalMessageDialog(null, "Endereço cadastrado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
				dispose();
			}
			
		});
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./assets/azul.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
