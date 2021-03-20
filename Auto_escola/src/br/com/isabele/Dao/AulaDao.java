/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Dao;

import br.com.isabele.modelo.Aluno;
import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.Instrutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author Belinha
 */
public class AulaDao {
     private Connection con;
    
    public AulaDao(){
        con = new Conexao().criarConexao();
    }
    
    private void liberarRecursos(Connection con, PreparedStatement ps){
        if(ps != null){
            try{
                ps.close();
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
        if(con != null){
            try{
                con.close();
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
    }
    private void liberarRecursos(Connection con, PreparedStatement ps, ResultSet rs){
        if(ps != null){
            try{
                ps.close();
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
        if(rs != null){
            try{
                rs.close();
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
        if(con != null){
            try{
                con.close();
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
    }
    int codigoAula;
    
    public void pegaCodigo(int codigo){
        codigoAula = codigo;
        
    }
    public int exibeCodigo(){
        return codigoAula;
    }
    
    
    public void cadastrarAula(Aula a){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql = "insert into aulas "
                + "(categoria, dataAula, codAlunos, codInstrutor, placa, realizada, hora) "
                + "values(?, ?, ?, ?, ?, ?, ?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(3, a.getCodAluno());
            ps.setInt(4, a.getCodInstrutor());
            ps.setDate(2, new java.sql.Date (a.getDataAula().getTime()));//Colocar a data. verificar como fazer.
            ps.setString(5, a.getPlaca());
            ps.setString(1, a.getCategoria());
            ps.setInt(6, a.getRealizada());
            ps.setTime(7, a.getHora());
                      
            ps.executeUpdate();
            
            /*
            rs = ps.getGeneratedKeys();
            rs.next();            
            pegaCodigo(rs.getInt(1)); */
            
            
        }catch(SQLException e){
            throw new IllegalArgumentException(e/*"Erro ao cadastrar Aula!\n Por favor, verifique se os campos e os dados estao corretos"*/);
        }finally{
            liberarRecursos(con,ps);
        }
    }
    public void alterarAula(Aula a){
        PreparedStatement ps = null;
        String sql = "update aulas "
                + "set categoria=?, dataAula=?, codAlunos=?, codInstrutor=?, placa=?, realizada=?, hora =? "
                + "where codAula = ?";
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getCategoria());
            ps.setDate(2, new java.sql.Date (a.getDataAula().getTime()));//Colocar a data. verificar como fazer.           
            ps.setInt(3, a.getCodAluno());
            ps.setInt(4, a.getCodInstrutor());
            ps.setString(5, a.getPlaca());
            ps.setInt(6, a.getRealizada());
            ps.setTime(7, a.getHora());
            ps.setInt(8, a.getCodAula());
            
            ps.executeUpdate();
        }catch(SQLException e){
            throw new IllegalArgumentException(e/*"Erro ao alterar os dados da aula"
                    + ""
                    + "!\n Por favor, verifique se os campos e os dados estao corretos!"*/);
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
    public void excluirAula(Aula i){
        PreparedStatement ps = null;
        String sql = "delete from aulas "
                + "where codAula = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, i.getCodAula());
            
            ps.executeUpdate();
        }catch(SQLException e){
            throw new IllegalArgumentException("Erro ao excluir a aula");
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
   public ArrayList<Aula> listarAula(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aula> aulas = null;
        try{
            ps = this.con.prepareStatement("select al.codAula, al.codAlunos, al.codInstrutor, al.Categoria, al.dataAula, al.placa, al.hora, al.realizada, a.nome, i.nomeInstrutor "
                        + "from aulas al, alunos a, instrutores i "
                        + "where al.codAlunos = a.codAlunos and al.codInstrutor = i.codInstrutor and al.realizada = 0 order by (al.DataAula) asc");
            rs = ps.executeQuery();
            
            aulas = new ArrayList<>();

            while (rs.next()) {
                Aula a = new Aula();
                
                a.setCodAula(rs.getInt("codAula"));
                a.setCategoria(rs.getString("Categoria"));
                a.setDataAula(rs.getDate("dataAula"));// verificar como fazer com data
                a.setCodAluno(rs.getInt("codAlunos"));
                a.setNomeAluno(rs.getString("nome"));
                a.setNomeInstrutor(rs.getString("nomeInstrutor"));
                a.setCodInstrutor(rs.getInt("codInstrutor"));
                a.setPlaca(rs.getString("Placa"));
                a.setRealizada(rs.getInt("realizada"));
                a.setHora(rs.getTime("hora"));
                
                aulas.add(a);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return aulas;        
    }
   public ArrayList<Aula> listarAulaAluno(String al){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aula> aulas = null;
        try{
            //Caso de erro na tela do aluno(Excluir) retirar esse trecho que esta dentro do if e deixar o do else
            
            if(al.isEmpty()){
                ps = this.con.prepareStatement("select al.codAula, al.Categoria, al.dataAula, al.placa, al.hora, al.realizada, a.nome, i.nomeInstrutor "
                        + "from aulas al, alunos a, instrutores i "
                        + "where al.codAlunos = a.codAlunos and al.codInstrutor = i.codInstrutor order by (al.DataAula) asc");
                rs = ps.executeQuery();
                aulas = new ArrayList<>();
                
                while (rs.next()) {
                Aula a = new Aula();
                
                a.setCodAula(rs.getInt("codAula"));
                a.setCategoria(rs.getString("Categoria"));
                a.setDataAula(rs.getDate("dataAula"));
                a.setNomeAluno(rs.getString("nome"));
                a.setNomeInstrutor(rs.getString("nomeInstrutor"));
                a.setPlaca(rs.getString("Placa"));
                a.setRealizada(rs.getInt("realizada"));
                a.setHora(rs.getTime("hora"));
                
                aulas.add(a);
            }
            }else{
            ps = this.con.prepareStatement("select * from aulas al inner join alunos a "
                    + "on a.codAlunos = al.codAlunos "
                    + "inner join instrutores i "
                    + "on i.codInstrutor = al.codInstrutor where a.nome like ?");
            ps.setString(1, "%"+al+"%");
            rs = ps.executeQuery();
            
            aulas = new ArrayList<>();

            while (rs.next()) {
                Aula a = new Aula();
                
                a.setCodAula(rs.getInt("codAula"));
                a.setCategoria(rs.getString("Categoria"));
                a.setDataAula(rs.getDate("dataAula"));
                a.setNomeAluno(rs.getString("nome"));
                a.setNomeInstrutor(rs.getString("nomeInstrutor"));
                a.setPlaca(rs.getString("Placa"));
                a.setRealizada(rs.getInt("realizada"));
                a.setHora(rs.getTime("hora"));
                
                aulas.add(a);
            }
          }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return aulas;        
    }
    public ArrayList<Aula> listarAulaInstrutor(int ex){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aula> aulas = null;
        try{
            //Caso de erro na tela do aluno(Excluir) retirar esse trecho que esta dentro do if e deixar o do else
            if(ex == 0){
                ps = this.con.prepareStatement("select al.codAula, al.Categoria, al.dataAula, al.placa, al.hora, al.realizada, a.nome, i.nomeInstrutor "
                        + "from aulas al, alunos a, instrutores i "
                        + "where al.codAlunos = a.codAlunos and al.codInstrutor = i.codInstrutor order by (al.DataAula) asc");
                rs = ps.executeQuery();
                aulas = new ArrayList<>();
                
                while (rs.next()) {
                Aula a = new Aula();
                
                a.setCodAula(rs.getInt("codAula"));
                a.setCategoria(rs.getString("Categoria"));
                a.setDataAula(rs.getDate("dataAula"));
                a.setCodAluno(rs.getInt("codAlunos"));
                a.setCodInstrutor(rs.getInt("codInstrutor"));
                a.setPlaca(rs.getString("Placa"));
                a.setRealizada(rs.getInt("realizada"));
                a.setHora(rs.getTime("hora"));
                
                aulas.add(a);
            }
            }else{
            ps = this.con.prepareStatement("\"select * from aulas al inner join alunos a \"\n" +
"                    + \"on a.codAlunos = al.codAlunos \"\n" +
"                    + \"inner join instrutores i \"\n" +
"                    + \"on i.codInstrutor = al.codInstrutor where al.codAluno = ");
            ps.setInt(1, ex);
            rs = ps.executeQuery();
            
            aulas = new ArrayList<>();

            while (rs.next()) {
                Aula a = new Aula();
                
                a.setCodAula(rs.getInt("codAula"));
                a.setCategoria(rs.getString("Categoria"));
                a.setDataAula(rs.getDate("dataAula"));
                a.setCodAluno(rs.getInt("codAlunos"));
                a.setCodInstrutor(rs.getInt("codInstrutor"));
                a.setPlaca(rs.getString("Placa"));
                a.setRealizada(rs.getInt("realizada"));
                a.setHora(rs.getTime("hora"));
                
                aulas.add(a);
            }
          }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return aulas;        
    }
    public ArrayList<Aula> listarAulaVeiculo(String ve){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aula> aulas = null;
        try{
            //Caso de erro na tela do aluno(Excluir) retirar esse trecho que esta dentro do if e deixar o do else
            if(ve == null){
                ps = this.con.prepareStatement("select al.codAula, al.Categoria, al.dataAula, al.placa, al.hora, al.realizada, a.nome, i.nomeInstrutor "
                        + "from aulas al, alunos a, instrutores i "
                        + "where al.codAlunos = a.codAlunos and al.codInstrutor = i.codInstrutor order by (al.DataAula) asc");
                rs = ps.executeQuery();
                aulas = new ArrayList<>();
                
                while (rs.next()) {
                Aula a = new Aula();
                
                a.setCodAula(rs.getInt("codAula"));
                a.setCategoria(rs.getString("Categoria"));
                a.setDataAula(rs.getDate("dataAula"));
                a.setCodAluno(rs.getInt("codAlunos"));
                a.setCodInstrutor(rs.getInt("codInstrutor"));
                a.setPlaca(rs.getString("Placa"));
                a.setRealizada(rs.getInt("realizada"));
                a.setHora(rs.getTime("hora"));
                
                aulas.add(a);
            }
            }else{
            ps = this.con.prepareStatement("select al.codAula, al.Categoria, al.dataAula, al.placa, al.hora, al.realizada, a.nome, i.nomeInstrutor \n" +
                        "from aulas al, alunos a, instrutores i\n" +
                        "where al.codAlunos = a.codAlunos and al.codInstrutor = i.codInstrutor and al.placa = ?");
            ps.setString(1, ve);
            rs = ps.executeQuery();
            
            aulas = new ArrayList<>();

            while (rs.next()) {
                Aula a = new Aula();
                
                a.setCodAula(rs.getInt("codAula"));
                a.setCategoria(rs.getString("Categoria"));
                a.setDataAula(rs.getDate("dataAula"));
                a.setCodAluno(rs.getInt("codAlunos"));
                a.setCodInstrutor(rs.getInt("codInstrutor"));
                a.setPlaca(rs.getString("Placa"));
                a.setRealizada(rs.getInt("realizada"));
                a.setHora(rs.getTime("hora"));
                
                aulas.add(a);
            }
          }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return aulas;        
    }
    
     public Aula buscarAula(int codigo){
        PreparedStatement ps = null;
        ResultSet rs = null;
     
        Aula au = new Aula();   
        try{
                       
            ps = this.con.prepareStatement("select al.codAula, al.Categoria, al.dataAula, al.placa, al.hora, al.realizada, a.nome, i.nomeInstrutor \n" +
                        "from aulas al, alunos a, instrutores i\n" +
                        "where al.codAlunos = a.codAlunos and al.codInstrutor = i.codInstrutor and al.codAula = ?");

            ps.setInt(1, codigo);
            
            rs = ps.executeQuery();
            
         
                rs.next();
                
                au.setCodAula(rs.getInt("codAula"));
                au.setCategoria(rs.getString("Categoria"));
                au.setDataAula(rs.getDate("dataAula"));
                au.setNomeAluno(rs.getString("nome"));
                au.setNomeInstrutor(rs.getString("nomeInstrutor"));
                au.setPlaca(rs.getString("placa"));
                au.setRealizada(rs.getInt("realizada"));
                au.setHora(rs.getTime("hora"));
                
                
        } catch(Exception e){
            throw new IllegalArgumentException(e);
        } finally{
            liberarRecursos(con, ps, rs);
        }        
           return au;  
    }   
     
}
