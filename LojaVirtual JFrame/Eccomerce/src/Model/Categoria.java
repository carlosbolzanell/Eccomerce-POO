package Model;
/** Classe para a representacao das categorias dos produtos
 *
 * @author Carlos Eduardo Bolzanell
 *
 */
public class Categoria {
    /** Variaveis para armazenar os atributos da categoria */
    private String nome;
    private String tipo;

    /** Metodo para retornar o nome da categoria para o objeto
     * @return nome*/
    public String getNome() {
        return nome;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param nome*/
    public void setNome(String nome) { this.nome = nome; }

    /** Metodo para retornar o tipo da categoria para o objeto
     * @return tipo*/
    public String getTipo() {
        return tipo;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param tipo*/
    public void setTipo(String tipo) {
        this.tipo = getTipo();
    }
}
