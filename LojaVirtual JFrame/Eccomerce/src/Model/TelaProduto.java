package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class TelaProduto extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public TelaProduto(Produto produto, Clientes cliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbNome.setBounds(27, 15, 77, 14);
		contentPane.add(lbNome);
		
		JLabel lbPreco = new JLabel("Preço");
		lbPreco.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbPreco.setBounds(27, 75, 77, 14);
		contentPane.add(lbPreco);
		
		JLabel lbDescricao = new JLabel("Descrição");
		lbDescricao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbDescricao.setBounds(27, 195, 77, 21);
		contentPane.add(lbDescricao);
		
		JLabel lbCor = new JLabel("Cor");
		lbCor.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbCor.setBounds(27, 135, 77, 21);
		contentPane.add(lbCor);
		
		JLabel lbCategoria = new JLabel("Categoria");
		lbCategoria.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbCategoria.setBounds(209, 195, 77, 21);
		contentPane.add(lbCategoria);
		
		JLabel lbMarca = new JLabel("Marca");
		lbMarca.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbMarca.setBounds(209, 15, 77, 14);
		contentPane.add(lbMarca);
		
		JLabel lbModelo = new JLabel("Modelo");
		lbModelo.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbModelo.setBounds(209, 75, 77, 14);
		contentPane.add(lbModelo);
		
		JLabel lbQuanti = new JLabel("Quantidade em Estoque");
		lbQuanti.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbQuanti.setBounds(209, 135, 171, 21);
		contentPane.add(lbQuanti);
		
		JLabel lbIcon = new JLabel("");
		lbIcon.setBounds(311, 11, 113, 108);
		contentPane.add(lbIcon);
		
		JLabel txNome = new JLabel(produto.getNome());
		txNome.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		txNome.setBounds(27, 40, 113, 14);
		contentPane.add(txNome);
		
		JLabel txPreco = new JLabel(String.valueOf(produto.getValor()));
		txPreco.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		txPreco.setBounds(27, 100, 113, 14);
		contentPane.add(txPreco);
		
		JLabel txDescricao = new JLabel(produto.getDescricao());
		txDescricao.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		txDescricao.setBounds(27, 220, 172, 41);
		contentPane.add(txDescricao);
		
		JLabel txCor = new JLabel(produto.getCor());
		txCor.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		txCor.setBounds(27, 160, 113, 14);
		contentPane.add(txCor);
		
		JLabel txMarca = new JLabel(produto.getMarca());
		txMarca.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		txMarca.setBounds(209, 40, 113, 14);
		contentPane.add(txMarca);
		
		JLabel txModelo = new JLabel(produto.getModelo());
		txModelo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		txModelo.setBounds(209, 100, 113, 14);
		contentPane.add(txModelo);
		
		JLabel txQuant = new JLabel(String.valueOf(produto.getQuantidadeEestoque()));
		txQuant.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		txQuant.setBounds(209, 160, 113, 14);
		contentPane.add(txQuant);
		
		JLabel txCategoria = new JLabel(produto.getCategoria());
		txCategoria.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		txCategoria.setBounds(209, 220, 113, 14);
		contentPane.add(txCategoria);
		
		JButton btnCarrinho = new JButton("Adicionar ao Carrinho");
		btnCarrinho.setBounds(273, 238, 161, 23);
		contentPane.add(btnCarrinho);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.setBounds(345, 211, 89, 23);
		contentPane.add(btVoltar);
		
		btVoltar.addActionListener(e->{
			dispose();
			TelaLoja frame = new TelaLoja(cliente);
			frame.setVisible(true);
		});
		
		btnCarrinho.addActionListener(e->{
			
			JLabel lbQuantidade = new JLabel("Quantos produtos?");
			JTextField txQuantidade = new JTextField();
			
			Object[] layout2 = {lbQuantidade, txQuantidade};
			JOptionPane.showInternalMessageDialog(null, layout2, "Carrinho", JOptionPane.QUESTION_MESSAGE);
			if(produto.temEstoque(txQuantidade.getText()) == "1") {
				JOptionPane.showInternalMessageDialog(null, "Sem estoque disponível", "Carrinho", JOptionPane.ERROR_MESSAGE);
			}else {
				
				cliente.getCarrinho().setQuantidade(Integer.parseInt(txQuantidade.getText()));
				produto.setQuantidadeEestoque(produto.getQuantidadeEestoque() - Integer.parseInt(txQuantidade.getText()));
				cliente.getCarrinho().adicionarProduto(produto);
				
				if(txQuantidade.getText().equals("1")) {
					JOptionPane.showInternalMessageDialog(null, "Produto Adicionado ao carrinho", "Carrinho", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showInternalMessageDialog(null, "Produtos Adicionado ao carrinho", "Carrinho", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		
	}

}
