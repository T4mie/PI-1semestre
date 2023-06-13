
package com.mycompany.avaj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pergunta {
    private int codPista;
    private String pista;
    
    public String getPista() {
        return pista;
    }

    public void setPista(String pistas) {
        this.pista = pistas;
    }

    public int getCodPista() {
        return codPista;
    }

    public void setCodPista(int codPista) {
        this.codPista = codPista;
    }
    
    public String pista () {
        String sql = "SELECT pista FROM pistas where codPista= ? ";
        String p = "";
        ConnectionFactory cu = new ConnectionFactory();
        try (Connection c = cu.obtemConexao()){
            PreparedStatement porra = c.prepareStatement(sql);
            porra.setInt(1, codPista);
            ResultSet rs = porra.executeQuery();
            while(rs.next()){
                String dica = rs.getString("pista");
                p = String.format("Dica: %s", dica);
            }
            porra.execute();
        }   
        catch (Exception e){
            p+= "Não há registros";
            e.printStackTrace();
        }
        return p;
    }
}
