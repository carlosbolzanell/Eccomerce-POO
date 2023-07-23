package Model;
import java.util.ArrayList;

/** Classe para a representacao do Carrinho do Cliente
 *
 * @author Carlos Eduardo Bolzanell
 *
 */
public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int quantidade;

    public Carrinho(int quantidade) {
        this.quantidade = quantidade;
    }

    public Carrinho() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    public void removerProduto(Produto produto) {
    	produtos.remove(produto);
    }
}
