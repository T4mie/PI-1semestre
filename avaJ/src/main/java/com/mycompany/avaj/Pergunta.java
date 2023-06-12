
package com.mycompany.avaj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pergunta {
    private int codPista;
    private String pista;
    
    public String getPistas() {
        return pista;
    }

    public void setPistas(String pistas) {
        this.pista = pistas;
    }

    public int getCodPista() {
        return codPista;
    }

    public void setCodPista(int codPista) {
        this.codPista = codPista;
    }
    
    public String pista () {
        String sql = "SELECT pista FROM pistas where codPista=?";
        String p = "";
        ConnectionFactory connect = new ConnectionFactory();
        try (Connection c = connect.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setInt(1, codPista);
            ps.execute();
            p += String.format("Dica: %s", pista);
        }   
        catch (Exception e){
            p+= "Não há registros";
            e.printStackTrace();
        }
        return p;
    }
}
