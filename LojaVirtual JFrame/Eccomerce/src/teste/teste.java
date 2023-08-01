package teste;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Model.Clientes;

public class teste extends JFrame {

	public static int buscarCliente(String cpf, ArrayList<Clientes> clientes) {
        int existente = 0;
        for (Clientes listaE : clientes) {
            if (listaE.getCpf().equals(cpf)) {
                existente = 1;
            }
        }
        return existente;

    }
}
