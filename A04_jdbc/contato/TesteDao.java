/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A04_jdbc.contato;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
public class TesteDao {
    public static void main(String[] args) throws SQLException {
        // pronto para gravar
        Contato contato = new Contato();
        contato.setNome("Rafael");
        contato.setEmail("rafaelwand@gmail.com");
        contato.setEndereco("R. Inventada n. 10");
        contato.setDataNascimento(Calendar.getInstance());
        // grave nessa conexão!!!
        ContatoDAO dao = new ContatoDAO();
        // método elegante
        dao.adiciona(contato);
        System.out.println("Gravado!");
        contato.setEndereco("Rua X");
        dao.atualiza(contato);
        Contato outroContato = dao.obterContato(44);
        System.out.println(outroContato.getNome());
        outroContato.setEndereco("Rua Y,20");
        dao.atualiza(outroContato);
        
        List<Contato> lista = dao.getLista();
        Contato contato2 = lista.get(0);
        
        
    }
}
