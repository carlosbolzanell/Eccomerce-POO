package teste;

import javax.swing.*;

public class teste {
    public static void main(String[] args){
        JTable tabelaProdutos = new JTable(
                new Object[][]  {{"batata, 1.95"}},
                new Object[]  {"Nome", "Preço"}
        );
    }
}
