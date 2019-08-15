/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh2;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafae
 */
public class ConnectionFactory {
    public Connection getConnection(){
        Connection con = null;
        try {
           Properties prop = new Properties();
            prop.load(getClass().getResourceAsStream("/sistemarh2/bdPropriedades.properties"));
            //String dbDriver = prop.getProperty("db.driver");
            String dbUrl = prop.getProperty("db.url");
            String dbUser = prop.getProperty("db.user");
            String dbPwd = prop.getProperty("db.pwd");
          
            con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (SQLException ex) {
            throw new RuntimeException("Problemas na conexão com o banco de dados.");
        } catch (IOException ex) {
            throw new RuntimeException("Problemas ao ler arquivo de configuração.");
        }
        return con;
    }
}
