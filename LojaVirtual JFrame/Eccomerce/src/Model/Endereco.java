package Model;

/** Classe para a representacao do Endereço do Cliente
 *
 * @author Carlos Eduardo Bolzanell
 *
 */
public class Endereco {

    /** Variaveis para armazenar os atributos do Endereço do Cliente */
    private String indentificacao;
    private String rua;
    private String cep;
    private String cidade;
    private String uf;
    private int numero;
    private String complemento;

    /** Construtor para inicializar o obejo com os atibutos atribuidos */
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    /** Construtor para inicializar o obejo com os atibutos atribuidos */
    public Endereco(String indentificacao, String rua, String cep, String cidade, String uf, int numero, String complemento) {
        this.indentificacao = indentificacao;
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
    }

    /** Construtor para inicializar o obejo sem os atibutos atribuidos */
    public Endereco() {
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return identificacao*/
    public String getIndentificacao() {
        return indentificacao;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param indentificação*/
    public void setIndentificacao(String indentificacao) {
        this.indentificacao = indentificacao;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return rua*/
    public String getRua() {
        return rua;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param rua*/
    public void setRua(String rua) {
        this.rua = rua;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return cep*/
    public String getCep() {
        return cep;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param cep*/
    public void setCep(String cep) {
        this.cep = cep;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return cidade*/
    public String getCidade() {
        return cidade;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param cidade*/
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return uf*/
    public String getUf() {
        return uf;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param uf*/
    public void setUf(String uf) {
        this.uf = uf;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return numero*/
    public int getNumero() {
        return numero;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param numero*/
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return complemento*/
    public String getComplemento() {
        return complemento;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param complemento*/
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
