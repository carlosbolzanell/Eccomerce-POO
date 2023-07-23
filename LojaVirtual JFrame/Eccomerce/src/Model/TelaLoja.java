package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;

public class TelaLoja extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static ArrayList<Produto> produtosE = new ArrayList<Produto>();
	private static ArrayList<Produto> produtosM = new ArrayList<Produto>();
	private static ArrayList<Produto> produtosEl = new ArrayList<Produto>();
	private static ArrayList<Produto> produtosA = new ArrayList<Produto>();
	private static Produto produto;


	/**
	 * Create the frame.
	 */
	public TelaLoja(Clientes cliente) {
		
		adicionarProdutos();
		
		setBackground(new Color(0, 0, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 331);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 473, 292);
		tabbedPane.setBackground(new Color(255, 255, 255));
		contentPane.add(tabbedPane);
		
		JPanel pProdutos = new JPanel();
		pProdutos.setBackground(new Color(255, 255, 255));
		pProdutos.setToolTipText("");
		tabbedPane.addTab("Produtos", null, pProdutos, null);
		pProdutos.setLayout(null);
		
		JTabbedPane tbProdutos = new JTabbedPane(JTabbedPane.TOP);
		tbProdutos.setBounds(0, 0, 472, 264);
		pProdutos.add(tbProdutos);
		
		JPanel esportes = new JPanel();
		tbProdutos.addTab("Esportes", null, esportes, null);
		esportes.setLayout(null);
		
		//Produtos da Categoria Esportes
		
		JPanel produtosEsporte = new JPanel();
		produtosEsporte.setLayout(null);
		produtosEsporte.setBounds(0, 0, 465, 235);
		esportes.add(produtosEsporte);
		
		JPanel produto1E = new JPanel();
		produto1E.setLayout(null);
		produto1E.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto1E.setBounds(0, 5, 221, 68);
		produtosEsporte.add(produto1E);
		
		JLabel lbProduto1E = new JLabel(produtosE.get(0).getNome());
		lbProduto1E.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto1E.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto1E.setBounds(0, 3, 221, 14);
		produto1E.add(lbProduto1E);
		
		JLabel fotoProduto1E = new JLabel();
		fotoProduto1E.setIcon(new ImageIcon("./assets/bolaBasquete.png"));
		fotoProduto1E.setBounds(0, 11, 60, 54);
		produto1E.add(fotoProduto1E);
		
		JLabel precoProduto1E = new JLabel("R$"+String.valueOf(produtosE.get(0).getValor()).replace(".", ","));
		precoProduto1E.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto1E.setBounds(70, 20, 78, 33);
		produto1E.add(precoProduto1E);
		
		JButton btProduto1E = new JButton("Ver Mais");
		btProduto1E.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto1E.setBounds(137, 42, 80, 23);
		produto1E.add(btProduto1E);
		
		btProduto1E.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosE.get(0), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto2E = new JPanel();
		produto2E.setLayout(null);
		produto2E.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto2E.setBounds(244, 5, 221, 68);
		produtosEsporte.add(produto2E);
		
		JLabel lbProduto2E = new JLabel(produtosE.get(1).getNome());
		lbProduto2E.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto2E.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto2E.setBounds(0, 3, 217, 14);
		produto2E.add(lbProduto2E);
		
		JLabel fotoProduto2E = new JLabel();
		fotoProduto2E.setIcon(new ImageIcon("./assets/vasco.png"));
		fotoProduto2E.setBounds(2, 2, 60, 65);
		produto2E.add(fotoProduto2E);
		
		JLabel precoProduto2E = new JLabel("R$"+String.valueOf(produtosE.get(1).getValor()).replace(".", ","));
		precoProduto2E.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto2E.setBounds(70, 20, 78, 33);
		produto2E.add(precoProduto2E);
		
		JButton btProduto2E = new JButton("Ver Mais");
		btProduto2E.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto2E.setBounds(137, 42, 80, 23);
		produto2E.add(btProduto2E);
		
		btProduto2E.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosE.get(1), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto3E = new JPanel();
		produto3E.setLayout(null);
		produto3E.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto3E.setBounds(0, 84, 221, 68);
		produtosEsporte.add(produto3E);
		
		JLabel lbProduto3E = new JLabel(produtosE.get(2).getNome());
		lbProduto3E.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto3E.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto3E.setBounds(0, 4, 221, 14);
		produto3E.add(lbProduto3E);
		
		JLabel fotoProduto3E = new JLabel();
		fotoProduto3E.setIcon(new ImageIcon("./assets/tenis.png"));
		fotoProduto3E.setBounds(4, 11, 60, 54);
		produto3E.add(fotoProduto3E);
		
		JLabel precoProduto3E = new JLabel("R$"+String.valueOf(produtosE.get(2).getValor()).replace(".", ","));
		precoProduto3E.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto3E.setBounds(70, 20, 78, 33);
		produto3E.add(precoProduto3E);
		
		JButton btProduto3E = new JButton("Ver Mais");
		btProduto3E.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto3E.setBounds(137, 42, 80, 23);
		produto3E.add(btProduto3E);
		
		btProduto3E.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosE.get(2), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto4E = new JPanel();
		produto4E.setLayout(null);
		produto4E.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto4E.setBounds(244, 84, 221, 68);
		produtosEsporte.add(produto4E);
		
		JLabel lbProduto4E = new JLabel(produtosE.get(3).getNome());
		lbProduto4E.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto4E.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto4E.setBounds(0, 4, 221, 14);
		produto4E.add(lbProduto4E);
		
		JLabel fotoProduto4E = new JLabel("");
		fotoProduto4E.setIcon(new ImageIcon("./assets/boxe.png"));
		fotoProduto4E.setBounds(0, 2, 60, 65);
		produto4E.add(fotoProduto4E);
		
		JLabel precoProduto4E = new JLabel("R$"+String.valueOf(produtosE.get(3).getValor()).replace(".", ","));
		precoProduto4E.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto4E.setBounds(70, 20, 78, 33);
		produto4E.add(precoProduto4E);
		
		JButton btProduto4E = new JButton("Ver Mais");
		btProduto4E.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto4E.setBounds(137, 42, 80, 23);
		produto4E.add(btProduto4E);
		
		btProduto4E.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosE.get(3), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto5E = new JPanel();
		produto5E.setLayout(null);
		produto5E.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto5E.setBounds(0, 163, 221, 68);
		produtosEsporte.add(produto5E);
		
		JLabel lbProduto5E = new JLabel(produtosE.get(4).getNome());
		lbProduto5E.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto5E.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto5E.setBounds(0, 4, 221, 14);
		produto5E.add(lbProduto5E);
		
		JLabel fotoProduto5E = new JLabel("");
		fotoProduto5E.setIcon(new ImageIcon("./assets/tenisN.png"));
		fotoProduto5E.setBounds(4, 11, 60, 54);
		produto5E.add(fotoProduto5E);
		
		JLabel precoProduto5E = new JLabel("R$"+String.valueOf(produtosE.get(4).getValor()).replace(".", ","));
		precoProduto5E.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto5E.setBounds(70, 20, 78, 33);
		produto5E.add(precoProduto5E);
		
		JButton btProduto5E = new JButton("Ver Mais");
		btProduto5E.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto5E.setBounds(137, 42, 80, 23);
		produto5E.add(btProduto5E);
		
		btProduto5E.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosE.get(4), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto6E = new JPanel();
		produto6E.setLayout(null);
		produto6E.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto6E.setBounds(244, 163, 221, 68);
		produtosEsporte.add(produto6E);
		
		JLabel lbProduto6E = new JLabel(produtosE.get(5).getNome());
		lbProduto6E.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto6E.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto6E.setBounds(0, 4, 221, 14);
		produto6E.add(lbProduto6E);
		
		JLabel fotoProduto6E = new JLabel("");
		fotoProduto6E.setIcon(new ImageIcon("./assets/skate.png"));
		fotoProduto6E.setBounds(5, 11, 60, 54);
		produto6E.add(fotoProduto6E);
		
		JLabel precoProduto6E = new JLabel("R$"+String.valueOf(produtosE.get(5).getValor()).replace(".", ","));
		precoProduto6E.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto6E.setBounds(70, 20, 78, 33);
		produto6E.add(precoProduto6E);
		
		JButton btProduto6E = new JButton("Ver Mais");
		btProduto6E.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto6E.setBounds(137, 42, 80, 23);
		produto6E.add(btProduto6E);
		
		btProduto6E.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosE.get(5), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		//Página da Categoria Moda e Vestuário
		
		JPanel moda = new JPanel();
		tbProdutos.addTab("Moda e Vestuário", null, moda, null);
		moda.setLayout(null);
		
		JPanel produtosModa = new JPanel();
		produtosModa.setLayout(null);
		produtosModa.setBounds(0, 0, 465, 235);
		moda.add(produtosModa);
		
		JPanel produto1 = new JPanel();
		produto1.setLayout(null);
		produto1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto1.setBounds(0, 5, 221, 68);
		produtosModa.add(produto1);
		
		JLabel lbProduto1 = new JLabel(produtosM.get(0).getNome());
		lbProduto1.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto1.setBounds(0, 3, 221, 14);
		produto1.add(lbProduto1);
		
		JLabel fotoProduto1 = new JLabel("");
		fotoProduto1.setBounds(0, 11, 60, 54);
		produto1.add(fotoProduto1);
		
		JLabel lbPreco1 = new JLabel("R$"+String.valueOf(produtosM.get(0).getValor()).replace(".", ","));
		lbPreco1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbPreco1.setBounds(70, 20, 78, 33);
		produto1.add(lbPreco1);
		
		JButton btProduto1 = new JButton("Ver Mais");
		btProduto1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto1.setBounds(137, 42, 80, 23);
		produto1.add(btProduto1);
		
		btProduto1.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosM.get(0), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto2 = new JPanel();
		produto2.setLayout(null);
		produto2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto2.setBounds(244, 5, 221, 68);
		produtosModa.add(produto2);
		
		JLabel lbProduto2 = new JLabel(produtosM.get(1).getNome());
		lbProduto2.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto2.setBounds(0, 3, 217, 14);
		produto2.add(lbProduto2);
		
		JLabel fotoProduto2 = new JLabel("");
		fotoProduto2.setBounds(2, 2, 60, 65);
		produto2.add(fotoProduto2);
		
		JLabel lbPreco2 = new JLabel("R$"+String.valueOf(produtosM.get(1).getValor()).replace(".", ","));
		lbPreco2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbPreco2.setBounds(70, 20, 78, 33);
		produto2.add(lbPreco2);
		
		JButton btProduto2 = new JButton("Ver Mais");
		btProduto2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto2.setBounds(137, 42, 80, 23);
		produto2.add(btProduto2);
		
		btProduto2.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosM.get(1), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto3 = new JPanel();
		produto3.setLayout(null);
		produto3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto3.setBounds(0, 84, 221, 68);
		produtosModa.add(produto3);
		
		JLabel lbProduto3 = new JLabel(produtosM.get(2).getNome());
		lbProduto3.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto3.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto3.setBounds(0, 4, 221, 14);
		produto3.add(lbProduto3);
		
		JLabel fotoProduto3 = new JLabel("");
		fotoProduto3.setBounds(4, 11, 60, 54);
		produto3.add(fotoProduto3);
		
		JLabel precoProduto3 = new JLabel("R$"+String.valueOf(produtosM.get(2).getValor()).replace(".", ","));
		precoProduto3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto3.setBounds(70, 20, 78, 33);
		produto3.add(precoProduto3);
		
		JButton btProduto3 = new JButton("Ver Mais");
		btProduto3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto3.setBounds(137, 42, 80, 23);
		produto3.add(btProduto3);
		
		btProduto3.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosM.get(2), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto4 = new JPanel();
		produto4.setLayout(null);
		produto4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto4.setBounds(244, 84, 221, 68);
		produtosModa.add(produto4);
		
		JLabel lbProduto4 = new JLabel(produtosM.get(3).getNome());
		lbProduto4.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto4.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto4.setBounds(0, 4, 221, 14);
		produto4.add(lbProduto4);
		
		JLabel fotoProduto4 = new JLabel("");
		fotoProduto4.setBounds(0, 2, 60, 65);
		produto4.add(fotoProduto4);
		
		JLabel precoProduto4 = new JLabel("R$"+String.valueOf(produtosM.get(3).getValor()).replace(".", ","));
		precoProduto4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto4.setBounds(70, 20, 78, 33);
		produto4.add(precoProduto4);
		
		JButton btProduto4 = new JButton("Ver Mais");
		btProduto4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto4.setBounds(137, 42, 80, 23);
		produto4.add(btProduto4);
		
		btProduto4.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosM.get(3), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto5 = new JPanel();
		produto5.setLayout(null);
		produto5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto5.setBounds(0, 163, 221, 68);
		produtosModa.add(produto5);
		
		JLabel lbProduto5 = new JLabel(produtosM.get(4).getNome());
		lbProduto5.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto5.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto5.setBounds(0, 4, 221, 14);
		produto5.add(lbProduto5);
		
		JLabel fotoProduto5 = new JLabel("");
		fotoProduto5.setBounds(4, 11, 60, 54);
		produto5.add(fotoProduto5);
		
		JLabel precoProduto5 = new JLabel("R$"+String.valueOf(produtosM.get(4).getValor()).replace(".", ","));
		precoProduto5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto5.setBounds(70, 20, 78, 33);
		produto5.add(precoProduto5);
		
		JButton btProduto5 = new JButton("Ver Mais");
		btProduto5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto5.setBounds(137, 42, 80, 23);
		produto5.add(btProduto5);
		
		btProduto5.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosM.get(4), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto6 = new JPanel();
		produto6.setLayout(null);
		produto6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto6.setBounds(244, 163, 221, 68);
		produtosModa.add(produto6);
		
		JLabel lbProduto6 = new JLabel(produtosM.get(5).getNome());
		lbProduto6.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto6.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto6.setBounds(0, 4, 221, 14);
		produto6.add(lbProduto6);
		
		JLabel fotoProduto6 = new JLabel("");
		fotoProduto6.setBounds(5, 11, 60, 54);
		produto6.add(fotoProduto6);
		
		JLabel precoProduto6 = new JLabel("R$"+String.valueOf(produtosM.get(5).getValor()).replace(".", ","));
		precoProduto6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto6.setBounds(70, 20, 78, 33);
		produto6.add(precoProduto6);
		
		JButton btProduto6 = new JButton("Ver Mais");
		btProduto6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto6.setBounds(137, 42, 80, 23);
		produto6.add(btProduto6);
		
		btProduto6.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosM.get(6), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		//Produtos da Categoria Eletrônicos
		
		JPanel eletronicos = new JPanel();
		tbProdutos.addTab("Eletrônicos", null, eletronicos, null);
		eletronicos.setLayout(null);
		
		JPanel produtosEletonicos = new JPanel();
		produtosEletonicos.setLayout(null);
		produtosEletonicos.setBounds(0, 0, 465, 235);
		eletronicos.add(produtosEletonicos);
		
		JPanel produto1El = new JPanel();
		produto1El.setLayout(null);
		produto1El.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto1El.setBounds(0, 5, 221, 68);
		produtosEletonicos.add(produto1El);
		
		JLabel lbProduto1El = new JLabel(produtosEl.get(0).getNome());
		lbProduto1El.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto1El.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto1El.setBounds(0, 3, 221, 14);
		produto1El.add(lbProduto1El);
		
		JLabel fotoProdutoEl = new JLabel("");
		fotoProdutoEl.setBounds(0, 11, 60, 54);
		produto1El.add(fotoProdutoEl);
		
		JLabel lbPrecoEl = new JLabel("R$"+String.valueOf(produtosEl.get(0).getValor()).replace(".", ","));
		lbPrecoEl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbPrecoEl.setBounds(70, 20, 78, 33);
		produto1El.add(lbPrecoEl);
		
		JButton btProduto1El = new JButton("Ver Mais");
		btProduto1El.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto1El.setBounds(137, 42, 80, 23);
		produto1El.add(btProduto1El);
		
		btProduto1El.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosEl.get(0), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto2El = new JPanel();
		produto2El.setLayout(null);
		produto2El.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto2El.setBounds(244, 5, 221, 68);
		produtosEletonicos.add(produto2El);
		
		JLabel lbProduto2El = new JLabel(produtosEl.get(1).getNome());
		lbProduto2El.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto2El.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto2El.setBounds(0, 3, 217, 14);
		produto2El.add(lbProduto2El);
		
		JLabel fotoProduto2El = new JLabel("");
		fotoProduto2El.setBounds(2, 2, 60, 65);
		produto2El.add(fotoProduto2El);
		
		JLabel lbPreco2El = new JLabel("R$"+String.valueOf(produtosEl.get(1).getValor()).replace(".", ","));
		lbPreco2El.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbPreco2El.setBounds(70, 20, 78, 33);
		produto2El.add(lbPreco2El);
		
		JButton btProduto2El = new JButton("Ver Mais");
		btProduto2El.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto2El.setBounds(137, 42, 80, 23);
		produto2El.add(btProduto2El);
		
		btProduto2El.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosEl.get(1), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto3El = new JPanel();
		produto3El.setLayout(null);
		produto3El.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto3El.setBounds(0, 84, 221, 68);
		produtosEletonicos.add(produto3El);
		
		JLabel lbProduto3El = new JLabel(produtosEl.get(2).getNome());
		lbProduto3El.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto3El.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto3El.setBounds(0, 4, 221, 14);
		produto3El.add(lbProduto3El);
		
		JLabel fotoProduto3El = new JLabel("");
		fotoProduto3El.setBounds(4, 11, 60, 54);
		produto3El.add(fotoProduto3El);
		
		JLabel precoProduto3El = new JLabel("R$"+String.valueOf(produtosEl.get(2).getValor()).replace(".", ","));
		precoProduto3El.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto3El.setBounds(70, 20, 78, 33);
		produto3El.add(precoProduto3El);
		
		JButton btProduto3El = new JButton("Ver Mais");
		btProduto3El.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto3El.setBounds(137, 42, 80, 23);
		produto3El.add(btProduto3El);
		
		btProduto3El.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosEl.get(2), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto4El = new JPanel();
		produto4El.setLayout(null);
		produto4El.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto4El.setBounds(244, 84, 221, 68);
		produtosEletonicos.add(produto4El);
		
		JLabel lbProduto4El = new JLabel(produtosEl.get(3).getNome());
		lbProduto4El.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto4El.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto4El.setBounds(0, 4, 221, 14);
		produto4El.add(lbProduto4El);
		
		JLabel fotoProduto4El = new JLabel("");
		fotoProduto4El.setBounds(0, 2, 60, 65);
		produto4El.add(fotoProduto4El);
		
		JLabel precoProduto4El = new JLabel("R$"+String.valueOf(produtosEl.get(3).getValor()).replace(".", ","));
		precoProduto4El.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto4El.setBounds(70, 20, 78, 33);
		produto4El.add(precoProduto4El);
		
		JButton btProduto4El = new JButton("Ver Mais");
		btProduto4El.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto4El.setBounds(137, 42, 80, 23);
		produto4El.add(btProduto4El);
		
		btProduto4El.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosEl.get(3), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto5El = new JPanel();
		produto5El.setLayout(null);
		produto5El.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto5El.setBounds(0, 163, 221, 68);
		produtosEletonicos.add(produto5El);
		
		JLabel lbProduto5El = new JLabel(produtosEl.get(4).getNome());
		lbProduto5El.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto5El.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto5El.setBounds(0, 4, 221, 14);
		produto5El.add(lbProduto5El);
		
		JLabel fotoProduto5El = new JLabel("");
		fotoProduto5El.setBounds(4, 11, 60, 54);
		produto5El.add(fotoProduto5El);
		
		JLabel precoProduto5El = new JLabel("R$"+String.valueOf(produtosEl.get(4).getValor()).replace(".", ","));
		precoProduto5El.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto5El.setBounds(70, 20, 78, 33);
		produto5El.add(precoProduto5El);
		
		JButton btProduto5El = new JButton("Ver Mais");
		btProduto5El.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto5El.setBounds(137, 42, 80, 23);
		produto5El.add(btProduto5El);
		
		btProduto5El.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosEl.get(4), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel produto6El = new JPanel();
		produto6El.setLayout(null);
		produto6El.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		produto6El.setBounds(244, 163, 221, 68);
		produtosEletonicos.add(produto6El);
		
		JLabel lbProduto6El = new JLabel(produtosEl.get(5).getNome());
		lbProduto6El.setHorizontalAlignment(SwingConstants.CENTER);
		lbProduto6El.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lbProduto6El.setBounds(0, 4, 221, 14);
		produto6El.add(lbProduto6El);
		
		JLabel fotoProduto6El = new JLabel("");
		fotoProduto6El.setBounds(5, 11, 60, 54);
		produto6El.add(fotoProduto6El);
		
		JLabel precoProduto6El = new JLabel("R$"+String.valueOf(produtosEl.get(5).getValor()).replace(".", ","));
		precoProduto6El.setFont(new Font("Tahoma", Font.PLAIN, 15));
		precoProduto6El.setBounds(70, 20, 78, 33);
		produto6El.add(precoProduto6El);
		
		JButton btProduto6El = new JButton("Ver Mais");
		btProduto6El.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btProduto6El.setBounds(137, 42, 80, 23);
		produto6El.add(btProduto6El);
		
		btProduto6El.addActionListener(e->{
			TelaProduto frame = new TelaProduto(produtosEl.get(5), cliente);
			dispose();
			frame.setVisible(true);
		});
		
		JPanel adega = new JPanel();
		tbProdutos.addTab("Adega", null, adega, null);
		
		JPanel pCarrinho = new JPanel();
		pCarrinho.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Carrinho", null, pCarrinho, null);
		pCarrinho.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(369, 230, 89, 23);
		pCarrinho.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 468, 223);
		pCarrinho.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"aa", "aa", "aa", "aa", null}
				
			},
			new String[] {
				"Produto", "Quantidade", "Pre\u00E7o Unit", "Pre\u00E7o", "Remover"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel pConta = new JPanel();
		pConta.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Conta", null, pConta, null);
		pConta.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setForeground(new Color(0, 0, 0));
		lbNome.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbNome.setBounds(36, 28, 46, 14);
		pConta.add(lbNome);
		
		JLabel lbCpf = new JLabel("CPF");
		lbCpf.setForeground(new Color(0, 0, 0));
		lbCpf.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lbCpf.setBounds(198, 27, 70, 14);
		pConta.add(lbCpf);
		
		JLabel lbDataN = new JLabel("Data de Nascimento");
		lbDataN.setForeground(new Color(0, 0, 0));
		lbDataN.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbDataN.setBounds(36, 73, 152, 14);
		pConta.add(lbDataN);
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setForeground(new Color(0, 0, 0));
		lbEmail.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbEmail.setBounds(198, 73, 58, 14);
		pConta.add(lbEmail);
		
		JLabel lbUser = new JLabel("Usuário");
		lbUser.setForeground(new Color(0, 0, 0));
		lbUser.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		lbUser.setBounds(36, 121, 58, 14);
		pConta.add(lbUser);
		
		JButton btnEndereco = new JButton("Ver Endereços");
		btnEndereco.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		btnEndereco.setBackground(Color.WHITE);
		btnEndereco.setBounds(306, 137, 152, 33);
		pConta.add(btnEndereco);
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBounds(306, 176, 152, 33);
		pConta.add(btnEdit);
		
		JLabel lbNomeC = new JLabel(cliente.getNome());
		lbNomeC.setBackground(new Color(128, 255, 255));
		lbNomeC.setBounds(36, 45, 152, 21);
		pConta.add(lbNomeC);
		
		JLabel lbDataNC = new JLabel(cliente.getDataNascimento());
		lbDataNC.setBounds(36, 92, 152, 21);
		pConta.add(lbDataNC);
		
		JLabel lbUserC = new JLabel(cliente.getLogin());
		lbUserC.setBounds(36, 137, 152, 21);
		pConta.add(lbUserC);
		
		JLabel lbCpfC = new JLabel(cliente.getCpf());
		lbCpfC.setBounds(198, 45, 102, 21);
		pConta.add(lbCpfC);
		
		JLabel lbEmailC = new JLabel(cliente.getEmail());
		lbEmailC.setBounds(198, 92, 102, 21);
		pConta.add(lbEmailC);
		
		JLabel icon = new JLabel("");
		icon.setIcon(new ImageIcon("./assets/perfil.png"));
		icon.setBounds(310, 0, 148, 132);
		pConta.add(icon);
	}
	
	public void adicionarProdutos() {
		Produto bolaBasquete = new Produto("Bola de Basquete", "Bola de basquete Casual", 59.90, "Penalty Oficial", "Penalty", "Laranja", "Esportes", 4);
		produtosE.add(bolaBasquete);
		Produto camisaVasco = new Produto("Camisa do Vasco", "Camisa do Vasco tamanho G", 125.00, "21/22", "Kappa", "Branca", "Esportes", 5);
		produtosE.add(camisaVasco);
		Produto raqueteTenis = new Produto("Raquete de Tênis", "Raquete Profissional para Campeonatos", 119.90, "Babolat Pure Aero", "Babolet", "Azul", "Esportes", 7);
		produtosE.add(raqueteTenis);
		Produto luvasBoxe = new Produto("Luvas de Boxe", "Luvas Profissionais", 239.90, "Adidas Beat", "Adidas", "Azul", "Esportes", 2);
		produtosE.add(luvasBoxe);
		Produto tenisNike = new Produto("Tênis Nike", "Tênis Nike para corrida", 320.00, "Nike Shoks Speed", "Nike", "Preto", "Esportes", 4);
		produtosE.add(tenisNike);
		Produto skate = new Produto("Skate", "Skate casual para iniciantes", 89.99, "Conceito Street", "Conceito", "Preto", "Esportes", 3);
		produtosE.add(skate);
		
		Produto vestido = new Produto("Vestido Floral Primavera", "Um lindo vestido floral perfeito para a estação da primavera, com tecido leve e confortável.", 129.90, "Corte A-line", "FashionFlower", "Azul e branco", "Vestidos", 50);
		produtosM.add(vestido);
		Produto camisa = new Produto("Camisa Polo Classic", "Camisa polo clássica e elegante, feita de algodão de alta qualidade para um visual sofisticado.", 79.99, "Slim Fit", "UrbaneStyle", "Preto", "Camisas", 30 );
		produtosM.add(camisa);
		Produto calca = new Produto("Calça Jeans Comfort", "Calça jeans moderna com ajuste confortável, ideal para o dia a dia e momentos casuais.", 89.50, "Skinny", "DenimFlex", "Azul escuro", "Calças", 65);
		produtosM.add(calca);
		Produto sapato  = new Produto("Sapato Social Elegance", "Sapato social elegante e refinado, confeccionado em couro legítimo para um toque de sofisticação.", 189.00, "Oxford", "ClassySteps", "Marrom", "Calçados", 20);
		produtosM.add(sapato);
		Produto moletom = new Produto("Moletom Urban Style", "Moletom urbano com capuz, perfeito para os dias mais frios, oferecendo conforto e estilo.", 69.95, "Unissex", "StreetChic", "Cinza mescla", "Suéteres e Moletons", 45);
		produtosM.add(moletom);
		Produto bolsa = new Produto("Bolsa Tote Versatile", "Bolsa tote espaçosa e versátil, ótima para o dia a dia, com design moderno e diversos compartimentos.", 149.00, "Tote Bag", "FashionPlus", "Caramelo", "Bolsas", 25);
		produtosM.add(bolsa);
		
		Produto smartphone = new Produto("Smartphone TechMaster X10", "Um smartphone avançado com tela de alta resolução e desempenho poderoso.", 1799.00, "X10 Pro", "TechMaster", "Preto", "Smartphones", 30);
		produtosEl.add(smartphone);
		Produto notebook = new Produto("Notebook UltraBook Pro", "Notebook ultraleve e ultrarrápido, perfeito para produtividade e mobilidade.", 3299.00, "UltraBook Pro 13", "MaxTech", "Prata", "Notebooks", 20);
		produtosEl.add(notebook);
		Produto fone = new Produto("Fone de Ouvido NoiseFree", "Fone de ouvido sem fio com cancelamento de ruído para uma experiência sonora imersiva.", 349.90, "NoiseFree 500", "SoundWave", "Preto", "Fones de Ouvido", 50);
		produtosEl.add(fone);
		Produto tv = new Produto("Smart TV VisionPlus 55", "Smart TV com tela 4K e acesso a aplicativos de streaming, proporcionando entretenimento de qualidade.", 2999.00, "VisionPlus 55A", "TechVision", "Cinza", "Smart TVs", 15);
		produtosEl.add(tv);
		Produto camera = new Produto("Câmera Digital ShotMaster", "Câmera digital de alta resolução com recursos avançados para capturar momentos especiais.", 1199.00, "ShotMaster 500X", "PixelPerfect", "Prata", "Câmeras Digitais", 25);
		produtosEl.add(camera);
		Produto impressora = new Produto("Impressora MultiFuncional PrintFast", "Impressora multifuncional que imprime, copia e digitaliza com alta velocidade e qualidade.", 499.00, "PrintFast 2022", "SwiftPrint", "Branco", "Impressoras", 40);
		produtosEl.add(impressora);
		
	}
}
