package com.mycompany.avaj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Pessoa {
     private int pontos;
     private String nome;
     private int ranking;
     private int turnos;
     private String pistas;
     private int codPista;
    public Pessoa() {
    }

    public Pessoa(int pontos, String nome, int ranking, int turnos) {
        this.pontos = pontos;
        this.nome = nome;
        this.ranking = ranking;
        this.turnos = turnos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public String getPistas() {
        return pistas;
    }

    public void setPistas(String pistas) {
        this.pistas = pistas;
    }

    public int getCodPista() {
        return codPista;
    }

    public void setCodPista(int codPista) {
        this.codPista = codPista;
    }

    public void inserir() {
        String sql = "INSERT INTO ranking (ranking, nome, pontos, turnos) VALUES (?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()) {
        // try with resources
            PreparedStatement ps = c.prepareStatement(sql);
            // pré compilando a instrução sql
            ps.setInt(1, ranking);
            ps.setString(2, nome);
            ps.setInt(3, pontos);
            ps.setInt(4, turnos);
            // preenchemos os dados faltantes 
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public void atualizar () {
        String sql = "UPDATE ranking set ranking=?, nome=?, pontos=?, turnos=? WHERE nome=?";
        ConnectionFactory cn = new ConnectionFactory();
        try (Connection c = cn.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, ranking);
            ps.setString(2, nome);
            ps.setInt(3, pontos);
            ps.setInt(4, turnos);
            ps.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deletar(){
        String sql = "DELETE from ranking WHERE nome=?";
        ConnectionFactory cum = new ConnectionFactory();
        try(Connection c = cum.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.execute();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String listar(){
        String sql = "SELECT * FROM ranking sort by pontos";
        // para fazer uma tavela de pontuação usar a string sql ^^ e botar um sort by
        String b = "";
        ConnectionFactory cock = new ConnectionFactory();
        try (Connection c = cock.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int ranking = rs.getInt("ranking");
                String nome =  rs.getString("nome");
                int pontos = rs.getInt("pontos");
                int turnos = rs.getInt("turnos");
                b += String.format("ranking: %d, nome: %s, pontos: %d, turnos: %d\n",
                        ranking, nome, pontos, turnos);
            }


        }
        catch (Exception e){
            b+= "Não há registros";
            e.printStackTrace();
        }
        return b;
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
            p += String.format("Dica: %s", pistas);
        }   
        catch (Exception e){
            p+= "Não há registros";
            e.printStackTrace();
        }
        return p;
    }

}

