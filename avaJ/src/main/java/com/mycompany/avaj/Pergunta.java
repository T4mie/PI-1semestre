
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
        ConnectionFactory cb = new ConnectionFactory();
        try (Connection c = cb.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, codPista);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String dica = rs.getString("pista");
                p = String.format("Dica: %s", dica);
            }
            ps.execute();
        }   
        catch (Exception e){
            p+= "Não há registros";
            e.printStackTrace();
        }
        return p;
    }
    public String palavras () {
        String sql = "SELECT palavras FROM pistas where codPista= ? ";
        String pa = "";
        ConnectionFactory c = new ConnectionFactory();
        try (Connection co = c.obtemConexao()){
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, codPista);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String resposta = rs.getString("palavras");
                pa = resposta;
            }
            ps.execute();
        }   
        catch (Exception e){
            pa+= "Não há registros";
            e.printStackTrace();
        }
        return pa;
    }
}
