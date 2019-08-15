/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A04_jdbc.contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 *
 * @author Rafael
 */
public class ContatoDAO{
    private String insert = "insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)";
    private String select = "select * from contatos";
    private String selectPorId = "select * from contatos where id=?";
    private String update = "update contatos set nome=?, email=?, endereco=?, dataNascimento=? WHERE id=?;";
    private String delete = "delete from contatos WHERE id=?;";
    public void adiciona(Contato contato) {
        Connection con = null;
        PreparedStatement stmtAdiciona = null;
        try {
            con = ConnectionFactory.getConnection();
            stmtAdiciona = con.prepareStatement(insert,Statement.RETURN_GENERATED_KEYS);
            // seta os valores
            stmtAdiciona.setString(1, contato.getNome());
            stmtAdiciona.setString(2, contato.getEmail());
            stmtAdiciona.setString(3, contato.getEndereco());
            stmtAdiciona.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
            // executa
            stmtAdiciona.execute();
            //Seta o id do contato
            ResultSet rs = stmtAdiciona.getGeneratedKeys();
            rs.next();
            long i = rs.getLong(1);
            contato.setId(i);
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try {stmtAdiciona.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar stmt.");}
            try {con.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar conexão.");}
            
        }
    }
    public List<Contato> getLista() throws SQLException{
        Connection con = null;
        PreparedStatement stmtLista = null;
        ResultSet rs = null;
        try {
            con = ConnectionFactory.getConnection();
            stmtLista = con.prepareStatement(select);
            rs = stmtLista.executeQuery();
            List<Contato> contatos = new ArrayList();
            while (rs.next()) {
                // criando o objeto Contato
                Contato contato = new Contato();
                contato.setId(rs.getLong("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setEndereco(rs.getString("endereco"));
                // montando a data através do Calendar
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                contato.setDataNascimento(data);
                // adicionando o objeto à lista
                contatos.add(contato);
            }
            
            return contatos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try {rs.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar rs.");}
            try {stmtLista.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar stmt.");}
            try {con.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar conexão.");}
            
        }

    }


    public void atualiza(Contato contato) throws SQLException{
        Connection con = null;
        PreparedStatement stmtAtualiza = null;
        try {
            con = ConnectionFactory.getConnection();
            stmtAtualiza = con.prepareStatement(update);            
            stmtAtualiza.setString(1, contato.getNome());
            stmtAtualiza.setString(2, contato.getEmail());
            stmtAtualiza.setString(3, contato.getEndereco());
            stmtAtualiza.setDate(4,new Date(contato.getDataNascimento().getTimeInMillis()));
            stmtAtualiza.setLong(5, contato.getId());
            stmtAtualiza.executeUpdate();
        } finally{
            try {stmtAtualiza.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar stmt.");}
            try {con.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar conexão.");}
 
        }

    }

    public void excluir(Contato contato) throws SQLException {
        Connection con = null;
        PreparedStatement stmtExcluir = null;
        try {
            con = ConnectionFactory.getConnection();
            stmtExcluir = con.prepareStatement(delete);                 
            stmtExcluir.setLong(1, contato.getId());
            stmtExcluir.executeUpdate();
        } finally{
            try {stmtExcluir.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar stmt.");}
            try {con.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar conexão.");}
 
        }

    }
    
    public Contato obterContato(long id){
        Connection con = null;
        PreparedStatement stmtObter = null;
        ResultSet rs = null;
        Contato contato = new Contato();
        try {
            con = ConnectionFactory.getConnection();
            stmtObter = con.prepareStatement(selectPorId);
            stmtObter.setLong(1, id);
            rs = stmtObter.executeQuery();
            if(rs.next()){
                contato.setNome(rs.getString("nome"));
                contato.setId(rs.getLong("id"));
                contato.setEmail(rs.getString("email"));
                // montando a data através do Calendar
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                contato.setDataNascimento(data);
                contato.setEndereco(rs.getString("endereco"));
            }else{
                throw new RuntimeException("Id inválido="+id);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try {rs.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar rs.");}
            try {stmtObter.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar stmt.");}
            try {con.close();} catch (SQLException ex) {throw new RuntimeException("Falha ao fechar conexão.");}
            
        }
        return contato;
        
    }
}
