package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class TelaFinalizar extends JFrame {

	private JPanel contentPane;
	private double valorFinal=0;
	private double numeroAleatorio = (double) (Math.random() * 31);
	private double casasDecimais = Math.pow(10, 2);
	private double frete = Math.round(numeroAleatorio * casasDecimais) / casasDecimais;
	

	/**
	 * Create the frame.
	 */
	public TelaFinalizar(Clientes cliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel compra = new JPanel();
		compra.setBounds(216, 0, 218, 261);
		contentPane.add(compra);
		compra.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Boleto Bancário", "Pix", "Cartão de Crédito", "Cartão de Débito"}));
		comboBox.setBounds(8, 103, 112, 22);
		compra.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Forma de Pagamento");
		lblNewLabel.setBounds(10, 81, 112, 22);
		compra.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Produtos");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 11, 62, 14);
		compra.add(lblNewLabel_1);
		
		for(Produto prod : cliente.getCarrinho().getProdutos()) {
			valorFinal += prod.getValor() * prod.getQuantidadeEscolhida();
		}
		double valorTotal = valorFinal+frete;
		
		JLabel lblNewLabel_2 = new JLabel("R$"+valorFinal);
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(69, 12, 46, 14);
		compra.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Frete");
		lblNewLabel_1_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 29, 62, 14);
		compra.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("R$"+frete);
		lblNewLabel_2_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(69, 30, 46, 14);
		compra.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total");
		lblNewLabel_1_2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 56, 62, 14);
		compra.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("R$"+valorTotal);
		lblNewLabel_2_2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(69, 57, 72, 14);
		compra.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.setBounds(45, 192, 129, 33);
		compra.add(btnNewButton);
		
		btnNewButton.addActionListener(e->{
			JOptionPane.showMessageDialog(null, "Compra Efetuada com sucesso!", "Bolzanell's Shop", JOptionPane.PLAIN_MESSAGE);
			atualizarEstoque(cliente);
			cliente.getCarrinho().getProdutos().clear();
			
			dispose();
		});
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(45, 228, 129, 33);
		compra.add(btnNewButton_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("Parcelamento");
		lblNewLabel_3.setBounds(10, 131, 87, 14);
		compra.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1x (R$"+(Math.round(valorTotal* casasDecimais) / casasDecimais)+")", "2x (R$"+(Math.round((valorTotal/2)* casasDecimais) / casasDecimais)+")", "3x (R$"+(Math.round((valorTotal/3)* casasDecimais) / casasDecimais)+")", "4x (R$"+(Math.round((valorTotal/4)* casasDecimais) / casasDecimais)+")", "5x (R$"+(Math.round((valorTotal/5)* casasDecimais) / casasDecimais)+")", "6x (R$"+(Math.round((valorTotal/6)* casasDecimais) / casasDecimais)+")", "7x (R$"+(Math.round((valorTotal/7)* casasDecimais) / casasDecimais)+")", "8x (R$"+(Math.round((valorTotal/8)* casasDecimais) / casasDecimais)+")", "9x (R$"+(Math.round((valorTotal/9)* casasDecimais) / casasDecimais)+")", "10x (R$"+(Math.round((valorTotal/10)* casasDecimais) / casasDecimais)+")"}));
		comboBox_1.setBounds(102, 127, 106, 22);
		compra.add(comboBox_1);
		
		
		btnNewButton_1.addActionListener(e->{
			dispose();
			TelaLoja frame = new TelaLoja(cliente);
			frame.setVisible(true);
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 212, 261);
		contentPane.add(scrollPane_1);
		
		
		DefaultListModel<String> modeloLista = new DefaultListModel<>();
		
		for(Produto prod : cliente.getCarrinho().getProdutos()) {
			modeloLista.addElement("•Produto: "+prod.getNome());
			modeloLista.addElement("Quantidade: "+ prod.getQuantidadeEscolhida());
			modeloLista.addElement("Valor Final: R$"+ prod.getValor()*prod.getQuantidadeEscolhida());
			modeloLista.addElement(" ");
		}
		
		JList<String> list = new JList<String>(modeloLista);
		scrollPane_1.setViewportView(list);
	}
	
	public void atualizarEstoque(Clientes cliente) {
		for(Produto prod : cliente.getCarrinho().getProdutos()) {
			prod.setQuantidadeEestoque(prod.getQuantidadeEestoque() - prod.getQuantidadeEscolhida());
		}
	}
}
