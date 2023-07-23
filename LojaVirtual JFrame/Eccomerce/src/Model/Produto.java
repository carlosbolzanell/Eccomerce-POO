package Model;

import java.util.ArrayList;

/** Classe para a representacao de um Produto no eccomerce
 *
 * @author Carlos Eduardo Bolzanell
 *
 */
public class Produto {
    /** Variaveis para armazenar os atributos do Produto e da nota fiscal */
    private double valor;
    private String nome;
    private String categoria;
    private ArrayList<String> avaliacoes;
    private String descricao;
    private String modelo;
    private String marca;
    private String cor;
    private int quantidadeEestoque;

    /** Construtor para inicializar o obejo com os atibutos atribuidos */
    public Produto(String nome, String descricao, double valor, String modelo, String marca, String cor, String categoria, int quantidadeEestoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.categoria = categoria;
        this.quantidadeEestoque = quantidadeEestoque;
    }

    public Produto() {
    }

    /** Metodo para retornar o valor do Produto para o objeto
     * @return valor*/
    public double getValor() {
        return valor;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param valor*/
    public void setValor(double valor) {
        this.valor = valor;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return nome*/
    public String getNome() {
        return nome;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param nome*/
    public void setNome(String nome) {
        this.nome = nome;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return categoria*/
    public String getCategoria() {
        return categoria;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param categoria*/
    public void setCategoria(String categoria) {
        this.categoria =categoria;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return avaliacoes*/
    public ArrayList<String> getAvaliacao() {
        return avaliacoes;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param avaliacao*/
    public void addAvaliacao(String avaliacao) {
        this.avaliacoes.add(avaliacao) ;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return descricao*/
    public String getDescricao() {
        return descricao;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param descricao*/
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return modelo*/
    public String getModelo() {
        return modelo;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param modelo*/
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return marca*/
    public String getMarca() {
        return marca;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param marca*/
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return cor*/
    public String setCor() {
        return cor;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param cor*/
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
		return cor;
	}

    /** Metodo para retornar o nome da categoria para o objeto
     * @return quantidadeEstoque*/
    public int getQuantidadeEestoque() {
        return quantidadeEestoque;
    }
	
	/** Procedimento para trazer o nome da categoria para armazenar na variavel
	 * @param quantidadeEestoque*/
	public void setQuantidadeEestoque(int quantidadeEestoque) {
		this.quantidadeEestoque += quantidadeEestoque;
	}
	
	public String temEstoque(String quantidade) {
		int quant = Integer.parseInt(quantidade);
		
		if(quant <= this.quantidadeEestoque) {
			quantidadeEestoque -= quant;
			System.out.print(this.quantidadeEestoque);
			return "0";
		}
		
		return "1";
	}
	
	/** Metodo para retornar o nome da categoria para o objeto
	 * @return toString*/
	@Override
	public String toString() {
		return  "Nome: " + nome + "\n"+
				"Preço: R$" + valor + "\n" +
				"Categoria: " + categoria + "\n" +
				"Descricao: " + descricao + '\n' +
				"Modelo: " + modelo + '\n' +
				"Marca: " + marca + '\n' +
				"Cor: " + cor + '\n' +
				"Quantidade em estoque: " + quantidadeEestoque;
	}
    
    
}
