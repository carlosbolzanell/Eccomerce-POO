package Model;

import java.util.ArrayList;

/** Classe para a representacao do Pagamento dos Produtos
 *
 * @author Carlos Eduardo Bolzanell
 *
 */
public class Pagamento {

    /** Variaveis para armazenar os atributos do Pagamento dos Produtos */
    private ArrayList<String> formaPagamentos;
    private Produto produto;
    private int parcelamento;
    private double desconto;
    private double frete;

    /** Metodo para retornar o nome da categoria para o objeto
     * @return formaPagamento*/
    public ArrayList<String> getFormaPagamento() {
        return formaPagamentos;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param formaPagamento*/
    public void addFormaPagamento(String formaPagamento) {
        this.formaPagamentos.add(formaPagamento);
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return parcelamento*/
    public int getParcelamento() {
        return parcelamento;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param parcelamento*/
    public void setParcelamento(int parcelamento) {
        this.parcelamento = parcelamento;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return desconto*/
    public double getDesconto() {
        return desconto;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param desconto*/
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return frete*/
    public double getFrete() {
        return frete;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param frete*/
    public void setFrete(double frete) {
        this.frete = frete;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return calcularTotal*/
    public double calcularTotal() {
        return produto.getValor() - desconto + frete;
    }
}
