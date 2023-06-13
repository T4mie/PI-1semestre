package com.mycompany.avaj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Pessoa {
     private int pontos;
     private String nome;
     private int turnos;
    public Pessoa() {
    }

    public Pessoa(int pontos, String nome, int turnos) {
        this.pontos = pontos;
        this.nome = nome;
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

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }


    public void inserir() {
        String sql = "INSERT INTO ranking (nome, pontos, turnos) VALUES (?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()) {
        // try with resources
            PreparedStatement ps = c.prepareStatement(sql);
            // pré compilando a instrução sql
            ps.setString(1, nome);
            ps.setInt(2, pontos);
            ps.setInt(3, turnos);
            // preenchemos os dados faltantes 
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public String listar(){
        String sql = "SELECT * FROM ranking order by pontos desc";
        // para fazer uma tavela de pontuação usar a string sql ^^ e botar um sort by
        String b = "";
        ConnectionFactory cc = new ConnectionFactory();
        try (Connection c = cc.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String nome =  rs.getString("nome");
                int pontos = rs.getInt("pontos");
                int turnos = rs.getInt("turnos");
                b += String.format(" nome: %s, pontos: %d, turnos: %d\n",
                         nome, pontos, turnos);
            }


        }
        catch (Exception e){
            b+= "Não há registros";
            e.printStackTrace();
        }
        return b;
    }


}

