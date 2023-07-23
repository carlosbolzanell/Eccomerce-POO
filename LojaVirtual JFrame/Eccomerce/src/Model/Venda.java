package Model;

import java.util.ArrayList;
/** Classe para a representacao da venda dos produtos
 *
 * @author Carlos Eduardo Bolzanell
 *
 */
public class Venda {
    /** Variaveis para armazenar os atributos da venda e da nota fiscal */
    private Clientes cliente;
    private String empresa;
    private ArrayList<Produto> produtos;

    /** Construtor para inicializar o obejo com os atibutos atribuidos */
    public Venda(Clientes cliente, String empresa, ArrayList<Produto> produtos) {
        this.cliente = cliente;
        this.empresa = empresa;
        this.produtos = produtos;
    }
}
