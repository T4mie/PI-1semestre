package com.mycompany.avaj;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "528896751mysql";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "PI";

    public Connection obtemConexao () {
        try {
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://"+host+":"+porta+"/"+bd+"?user="+usuario+
            "&password="+senha+"&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}