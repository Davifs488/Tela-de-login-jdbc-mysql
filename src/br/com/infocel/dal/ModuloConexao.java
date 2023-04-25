
package br.com.infocel.dal;

import java.sql.*;
public class ModuloConexao {
 //Método responsavel por establecer a conexão com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
 //Alinha a baixo "chama"o driver
        String driver = "com.mysql.cj.jdbc.Driver";
//Armazendo informações referente ao banco
    String url = "jdbc:mysql://localhost:3306/dvinfocel";
    String user = "root";
    String password = "";
//Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
 //A tela abaixo serve de apoio para esclarecer o erro
           // System.out.println(e);
            return null;
        }
        
    }
}
