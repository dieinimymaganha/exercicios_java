/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A04_jdbc.outrosexemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class JDBCExemplo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = DriverManager.
                getConnection("jdbc:mysql://localhost/exercicio?user=root&password=rrw@and14");
        Connection conexao2 = ConnectionFactory.getConnection();
        
        System.out.println("Conectado!");
        conexao.close();
    }
}
