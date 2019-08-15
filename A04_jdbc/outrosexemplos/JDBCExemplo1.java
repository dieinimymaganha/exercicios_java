/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A04_jdbc.outrosexemplos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rafael
 */
public class JDBCExemplo1 {

    public static void main(String[] args) {
        ConnectionFactoryComProperties connPropertie = new ConnectionFactoryComProperties();
        Connection conexao=null;
        Statement stmt=null;
        try {
            conexao = connPropertie.getConnection();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();
            stmt.executeUpdate("INSERT INTO CLIENTE (NOME,SOBRENOME) VALUES(\"Pedro\",\"Silva\")");
            conexao.commit();
        } catch (SQLException ex) {
            System.out.println("Erro de banco de dados:" + ex.getMessage());
        } finally {
            //System.out.println("Conectado!");
            try{stmt.close();}catch(SQLException ex){System.out.println("Erro ao fechar statement.");};
            try{conexao.close();}catch(SQLException ex){System.out.println("Erro ao fechar conexão.");};
        }
    }
}
