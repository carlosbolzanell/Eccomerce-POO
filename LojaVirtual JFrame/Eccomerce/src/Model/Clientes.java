package Model;

import java.util.ArrayList;

/** Classe para a representacao do Cliente no eccomerce
 *
 * @author Carlos Eduardo Bolzanell
 *
 */
public class Clientes {
    
    private String nome;
    
    private String dataNascimento;
    
    private String login;
    
    private String senha;
    
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    
    private String cpf;
    
    private String email;
    
    private double saldo;
    
    private ArrayList<String> formasPagamentos = new ArrayList<String>();
    
    private Carrinho carrinho = new Carrinho();

    /** Construtor para inicializar o obejo com os atibutos atribuidos */
    public Clientes(String nome, String dataNascimento, String cpf, String email, String login, String senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    /** Construtor para inicializar o obejo sem os atibutos atribuidos */
    public Clientes() {
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return nome*/
    public String getNome() {
        return nome;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param nome*/
    public void setNome(String nome) {
        if(nome.length() > 0 && nome.matches("[A-Za-z ]*")) {
            this.nome = nome;
        }
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return dataNascmento*/
    public String getDataNascimento() {
        return dataNascimento;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param dataNascimento*/
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return enderecos*/
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param endereco*/
    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param posicao*/
    public void removeEndereco(int posicao){
        this.enderecos.remove(posicao);
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return cpf*/
    public String getCpf() {
        return cpf;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param cpf*/
    public void setCpf(String cpf) {
        if(cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
            this.cpf = cpf;
        }
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return email*/
    public String getEmail() {
        return email;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param email*/
    public void setEmail(String email) {
        this.email = email;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return saldo*/
    public double getSaldo() {
        return saldo;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param saldo*/
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return formasPagamentos*/
    public ArrayList<String> getFormasPagamentos() {
        return formasPagamentos;
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param formaPagamento*/
    public void addFormasPagamentos(String formaPagamento) {
        this.formasPagamentos.add(formaPagamento);
    }

    /** Procedimento para trazer o nome da categoria para armazenar na variavel
     * @param posicao*/
    public void removeFormasPagamentos(int posicao){
        this.formasPagamentos.remove(posicao);
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return login*/
    public String getLogin(){
        return login;
    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return senha*/
    public String getSenha(){
        return senha;
    }
    
    public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	/** Metodo para retornar o nome da categoria para o objeto
     * @return String*/
    public String logar(String cadastro, String password){
        if (cadastro.equals(login) && password.equals(senha)) {
            return "Acesso efetuado";
        }
        return "2";

    }

    /** Metodo para retornar o nome da categoria para o objeto
     * @return String*/
    public String mostrarDados() {
        return "Cliente\n" +
                "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNascimento + '\n' +
                "CPF: " + cpf + '\n' +
                "E-mail: " + email + '\n' +
                "Saldo: " + saldo + "\n";
    }
}
