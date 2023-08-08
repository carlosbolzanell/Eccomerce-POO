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
	public TelaNota(Clientes cliente, Endereco endereco, double valorFinal) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.setBounds(10, 227, 89, 23);
		contentPane.add(btVoltar);
		
		btVoltar.addActionListener(e->{
			TelaLoja frame = new TelaLoja(cliente);
			frame.setVisible(true);
		});
		
		JButton btSair = new JButton("Sair");
		btSair.setBounds(335, 227, 89, 23);
		contentPane.add(btSair);
		
		btSair.addActionListener(e->{
			TelaInicial frame = new TelaInicial();
			frame.setVisible(true);
		});
		
		JLabel lbTitulo = new JLabel("BOLZANELL'S SHOP");
		lbTitulo.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 18));
		lbTitulo.setBounds(121, 11, 173, 31);
		contentPane.add(lbTitulo);
		
		JLabel lbCpf = new JLabel("CPF:");
		lbCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCpf.setBounds(131, 87, 71, 23);
		contentPane.add(lbCpf);
		
		JLabel lbEndereco = new JLabel("Endere\u00E7o:");
		lbEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbEndereco.setBounds(131, 121, 71, 23);
		contentPane.add(lbEndereco);
		
		JLabel lbNome = new JLabel("Comprador:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbNome.setBounds(131, 53, 89, 23);
		contentPane.add(lbNome);
		
		JLabel lbValor = new JLabel("Valor:");
		lbValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbValor.setBounds(131, 155, 71, 23);
		contentPane.add(lbValor);
		
		JLabel txNome = new JLabel(cliente.getNome());
		txNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txNome.setBounds(212, 53, 89, 23);
		contentPane.add(txNome);
		
		JLabel txCpf = new JLabel(cliente.getCpf());
		txCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txCpf.setBounds(212, 87, 138, 23);
		contentPane.add(txCpf);
		
		JLabel txEndereco = new JLabel(endereco.getRua() + ", "+ endereco.getNumero());
		txEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txEndereco.setBounds(212, 121, 165, 23);
		contentPane.add(txEndereco);
		
		JLabel txValor = new JLabel("R$"+ valorFinal);
		txValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txValor.setBounds(212, 155, 103, 23);
		contentPane.add(txValor);
		
		JLabel lblAgradeemosAPreferncia = new JLabel("AGRADE\u00C7EMOS A PREFER\u00CANCIA");
		lblAgradeemosAPreferncia.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 18));
		lblAgradeemosAPreferncia.setBounds(74, 189, 276, 31);
		contentPane.add(lblAgradeemosAPreferncia);
	}
}
