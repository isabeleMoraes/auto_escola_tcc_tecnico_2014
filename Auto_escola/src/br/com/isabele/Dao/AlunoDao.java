/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Dao;

import br.com.isabele.modelo.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Belinha
 */
public class AlunoDao {
    private Connection con;
    
    public AlunoDao(){
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
    int codigoAluno;
    
    public void pegaCodigo(int codigo){
        codigoAluno = codigo;
        
    }
    public int exibeCodigo(){
        return codigoAluno;
    }
    
    public void cadastrarAluno(Aluno a){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql = "insert into alunos "
                + "(nome, cpf, dataNascimento, bairro, rua, numeroCasa, categoria, telResidencial, celular, celular1, cep) "
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getCPF());
            ps.setDate(3, new java.sql.Date (a.getDataNascimento().getTime()));//Colocar a data. verificar como fazer.
            ps.setString(4, a.getBairro());
            ps.setString(5, a.getRua());
            ps.setInt(6, a.getNumero());
            ps.setString(7, a.getCategoria());
            ps.setInt(8, a.getTelResidencial());
            ps.setInt(9, a.getCelular1());
            ps.setInt(10,a.getCelular2());
            ps.setInt(11, a.getCep());
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            rs.next();            
            pegaCodigo(rs.getInt(1)); 
            
        }catch(SQLException e){
            System.out.printf(e.getMessage());
            throw new IllegalArgumentException(e/*"Erro ao cadastrar o aluno!\n Por favor, verifique se os campos e os dados estao corretos!"*/);
        }finally{
            liberarRecursos(con,ps);
        }
    }
    public void alterarAluno(Aluno a){
        PreparedStatement ps = null;
        String sql = "update Alunos "
                + "set nome=?, cpf=?, dataNascimento=?, "
                + "bairro=?, rua=?, numeroCasa=?, categoria=?, "
                + "telResidencial=?, celular=?, celular1=?, cep=? "
                + "where codAlunos = ?" ;
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getCPF());
            ps.setDate(3, new java.sql.Date(a.getDataNascimento().getTime()));//Colocar a data. verificar como fazer.
            ps.setString(4, a.getBairro());
            ps.setString(5, a.getRua());
            ps.setInt(6, a.getNumero());
            ps.setString(7, a.getCategoria());
            ps.setInt(8, a.getTelResidencial());
            ps.setInt(9, a.getCelular1());
            ps.setInt(10,a.getCelular2());
            ps.setInt(11, a.getCep());
            ps.setInt(12, a.getCodAluno());
                   
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new IllegalArgumentException(e/*"Erro ao alterar o aluno!\n Por favor, verifique se os campos e os dados estao corretos!"*/);
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
    public void excluirAluno(Aluno o){
        PreparedStatement ps = null;
        String sql = "delete from Alunos "
                + "where codAlunos = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, o.getCodAluno());
            
            ps.executeUpdate();
        }catch(SQLException e){
            throw new IllegalArgumentException(e/*"Erro ao excluir aluno"*/);
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
   public ArrayList<Aluno> listarAlunos(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aluno> alunos = null;
        try{
            ps = this.con.prepareStatement("select * from Alunos");
            rs = ps.executeQuery();
            
            alunos = new ArrayList<>();

            while (rs.next()) {
                Aluno a = new Aluno();
                
                a.setCodAluno(rs.getInt("codAlunos"));
                a.setNome(rs.getString("nome"));
                a.setCPF(rs.getInt("cpf"));
                a.setDataNascimento(rs.getDate("dataNascimento"));// verificar como fazer com data
                a.setBairro(rs.getString("bairro"));
                a.setRua(rs.getString("rua"));
                a.setNumero(rs.getInt("numeroCasa"));
                a.setCategoria(rs.getString("categoria"));
                a.setTelResidencial(rs.getInt("telResidencial"));
                a.setCelular1(rs.getInt("celular"));
                a.setCelular2(rs.getInt("celular1"));

                alunos.add(a);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return alunos;        
    }
    
    public Aluno buscarAlunos(int codigo){
        PreparedStatement ps = null;
        ResultSet rs = null;
     
        Aluno a = new Aluno();
        try{
                       
            ps = this.con.prepareStatement("select * from Alunos where codAlunos = ?");// verificar como fazer pra buscar por codigo tbm
            
            ps.setInt(1, codigo);
            
            rs = ps.executeQuery();
            
         
                rs.next();
                
                a.setCodAluno(rs.getInt("codAlunos"));
                a.setNome(rs.getString("nome"));
                a.setCPF(rs.getInt("cpf"));
                a.setDataNascimento(rs.getDate("dataNascimento"));// verificar como fazer com data
                a.setBairro(rs.getString("bairro"));
                a.setRua(rs.getString("rua"));
                a.setNumero(rs.getInt("numeroCasa"));
                a.setCategoria(rs.getString("categoria"));
                a.setTelResidencial(rs.getInt("TelResidencial"));
                a.setCelular1(rs.getInt("Celular"));
                a.setCelular2(rs.getInt("Celular1"));
                
                
            //}
        } catch(Exception e){
            throw new IllegalArgumentException(e);
        } finally{
            liberarRecursos(con, ps, rs);
        }        
           return a;  
    }
    

    public ArrayList<Aluno> buscarAlunoTexto(String s){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aluno> alunos = null;
        
        try{
            if(s==null){
                ps = this.con.prepareStatement("select * from Alunos");
                rs = ps.executeQuery();

                
                alunos = new ArrayList<>();
                
                while(rs.next()){
                    Aluno a = new Aluno(); 
                    
                    a.setCodAluno(rs.getInt("codAlunos"));
                    a.setNome(rs.getString("nome"));
                    a.setCPF(rs.getInt("cpf"));
                    a.setDataNascimento(rs.getDate("dataNascimento"));// verificar como fazer com data
                    a.setBairro(rs.getString("bairro"));
                    a.setRua(rs.getString("rua"));
                    a.setNumero(rs.getInt("numeroCasa"));
                    a.setCategoria(rs.getString("categoria"));
                    a.setTelResidencial(rs.getInt("TelResidencial"));
                    a.setCelular1(rs.getInt("Celular"));
                    a.setCelular2(rs.getInt("Celular1"));
                    
                    alunos.add(a);
                }
            }else{
                ps = this.con.prepareStatement("select * from Alunos where nome like ?");
                
                ps.setString(1, "%"+s+"%");
            
                rs = ps.executeQuery();

                alunos = new ArrayList<>();
                while(rs.next()){
                    Aluno a = new Aluno(); 
                    
                    a.setCodAluno(rs.getInt("codAlunos"));
                    a.setNome(rs.getString("nome"));
                    a.setCPF(rs.getInt("cpf"));
                    a.setDataNascimento(rs.getDate("dataNascimento"));// verificar como fazer com data
                    a.setBairro(rs.getString("bairro"));
                    a.setRua(rs.getString("rua"));
                    a.setNumero(rs.getInt("numeroCasa"));
                    a.setCategoria(rs.getString("categoria"));
                    a.setTelResidencial(rs.getInt("TelResidencial"));
                    a.setCelular1(rs.getInt("Celular"));
                    a.setCelular2(rs.getInt("Celular1"));
                    
                    alunos.add(a);
                }
            }
           
        } catch(Exception e){
            throw new IllegalArgumentException(e/*"Erro ao buscar Veiculo"*/);
        } finally{
            liberarRecursos(con, ps, rs);
        }        
        return alunos; 
    }
    
    public ArrayList<Aluno> listarPesquisaAluno(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aluno> alunos = null;
       try{ 
        ps = this.con.prepareStatement("select * from Alunos");
        rs = ps.executeQuery();


        alunos = new ArrayList<>();

        while(rs.next()){
            Aluno a = new Aluno(); 

            a.setCodAluno(rs.getInt("codAlunos"));
            a.setNome(rs.getString("nome"));
            a.setCPF(rs.getInt("cpf"));

            alunos.add(a);
        }
        return alunos;
       }catch(Exception e){
           throw new RuntimeException(e);
       }
    }
    
    public boolean verificaAlunoExiste(String nome){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = this.con.prepareStatement("select * from Alunos where nome like ?");
            ps.setString(1, nome);

            rs = ps.executeQuery();

            return rs.next();
        }catch(Exception ex){
            return false;
        }
        
    }
    
}
