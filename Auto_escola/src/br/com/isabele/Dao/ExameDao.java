package br.com.isabele.Dao;

import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.Exame;
import br.com.isabele.modelo.Instrutor;
import br.com.isabele.modelo.Veiculo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Belinha
 */
public class ExameDao {
     private Connection con;
    
    public ExameDao(){
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
    
    public void cadastrarExame(Exame e){
        PreparedStatement ps = null;
        
        String sql = "insert into Exame "
                + "(codAlunos, placa, categoria, dataExame, realizado, hora) "
                + "values(?, ?, ?, ?, ?, ?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, e.getCodAluno());
            ps.setString(2, e.getPlaca());
            ps.setString(3, e.getCategoria());
            ps.setDate(4, new java.sql.Date (e.getDataExame().getTime()));
            ps.setInt(5, e.getRealizado());
            ps.setTime(6, e.getHora());
            
            
            ps.executeUpdate();
        }catch(SQLException s){
            throw new IllegalArgumentException(s/*"Erro ao cadastrar Exame!\n Por favor, verifique se os campos e os dados estao corretos!"*/);
        }finally{
            liberarRecursos(con,ps);
        }
    }
    public void alterarExame(Exame e){
        PreparedStatement ps = null;
        String sql = "update Exame "
                + "set codAlunos=?, placa=?, categoria=?, dataExame=?, realizado =?, hora = ? "
                + "where codExame = ?";
        try{
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, e.getCodAluno());
            ps.setString(2, e.getPlaca());
            ps.setString(3, e.getCategoria());
            ps.setDate(4, new java.sql.Date(e.getDataExame().getTime()));
            ps.setInt(5, e.getRealizado());
            ps.setTime(6, e.getHora());
            ps.setInt(7, e.getCodExame());
                   
            ps.executeUpdate();
        }catch(SQLException s){
            System.out.println(s.getMessage());
            throw new IllegalArgumentException("Erro ao alterar os dados do Exame!\n Por favor, verifique se os campos e os dados estao corretos!");
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
    public void excluirExame(Exame e){
        PreparedStatement ps = null;
        String sql = "delete from Exame "
                + "where codExame = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, e.getCodExame());
            
            ps.executeUpdate();
        }catch(SQLException s){
            throw new IllegalArgumentException("Erro ao excluir o exame");
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
   public ArrayList<Exame> listarExame(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exame> exames = null;
        try{
            ps = this.con.prepareStatement("select ex.codExame, a.nome, ex.codAlunos, ex.placa, ex.Categoria, ex.dataExame, ex.realizado,  ex.hora "
                        + "from Exame ex, alunos a "
                        + "where ex.codAlunos = ex.codAlunos and ex.realizado = 0  "
                        + "order by (ex.DataExame) asc");
            rs = ps.executeQuery();
            
            exames = new ArrayList<>();

            while (rs.next()) {
                Exame e = new Exame();
                
                e.setCodExame(rs.getInt("codExame"));
                e.setNomeAluno(rs.getString("nome"));
                e.setCodAluno(rs.getInt("codAlunos"));
                e.setPlaca(rs.getString("placa"));
                e.setCategoria(rs.getString("Categoria"));
                e.setDataExame(rs.getDate("dataExame"));// verificar como fazer com data
                e.setRealizado(rs.getInt("realizado"));
                e.setHora(rs.getTime("hora"));
                
                exames.add(e);
            }
        } catch(SQLException s){
            throw new RuntimeException(s);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exames;        
    }
    
     public Exame buscarExame(int codigo){
        PreparedStatement ps = null;
        ResultSet rs = null;
     
        Exame ex = new Exame();   
        try{
                       
            ps = this.con.prepareStatement("select ex.codExame, a.nome, ex.codAlunos, ex.placa, ex.Categoria, ex.dataExame, ex.realizado,  ex.hora "
                        + "from Exame ex, alunos a "
                        + "where ex.codAlunos = a.codAlunos and ex.codExame = ? "
                        + "order by (ex.DataExame) asc");
            
            ps.setInt(1, codigo);
            
            rs = ps.executeQuery();
            
         
                rs.next();
                
                ex.setCodExame(rs.getInt("codExame"));
                ex.setNomeAluno(rs.getString("nome"));
                ex.setCodAluno(rs.getInt("codAlunos"));
                ex.setPlaca(rs.getString("placa"));
                ex.setDataExame(rs.getDate("dataExame"));
                ex.setCategoria(rs.getString("Categoria"));
                ex.setRealizado(rs.getInt("realizado"));
                ex.setHora(rs.getTime("hora"));
                
        } catch(Exception e){
            throw new IllegalArgumentException(e);
        } finally{
            liberarRecursos(con, ps, rs);
        }        
           return ex;  
    }
     public ArrayList<Exame> listarExameAluno(String exx){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exame> exames = null;
        try{
            //Caso de erro na tela do aluno(Excluir) retirar esse trecho que esta dentro do if e deixar o do else
            if(exx.isEmpty()){
                ps = this.con.prepareStatement("select ex.codExame, ex.Categoria, ex.dataExame, ex.placa, ex.hora, ex.realizado, a.nome "
                        + "from exame ex, alunos a "
                        + "where ex.codAlunos = a.codAlunos"
                        + " order by (ex.DataExame) asc");
                rs = ps.executeQuery();
                exames = new ArrayList<>();
                
                while (rs.next()) {
                Exame ex = new Exame();
                
                ex.setCodExame(rs.getInt("codExame"));
                ex.setNomeAluno(rs.getString("nome"));
                ex.setCodAluno(rs.getInt("codAlunos"));
                ex.setPlaca(rs.getString("placa"));
                ex.setDataExame(rs.getDate("dataExame"));
                ex.setCategoria(rs.getString("Categoria"));
                ex.setRealizado(rs.getInt("realizado"));
                ex.setHora(rs.getTime("hora"));
                
                exames.add(ex);
            }
            }else{
            ps = this.con.prepareStatement("select * from exame ex inner join alunos a "
                    + "on ex.codAlunos = a.codAlunos where a.nome like ?");
            ps.setString(1, "%"+exx+"%");
            rs = ps.executeQuery();
            
            exames = new ArrayList<>();

            while (rs.next()) {
                Exame ex = new Exame();
                
                ex.setCodExame(rs.getInt("codExame"));
                ex.setNomeAluno(rs.getString("nome"));
                //ex.setCodAluno(rs.getInt("codAlunos"));
                ex.setPlaca(rs.getString("placa"));
                ex.setDataExame(rs.getDate("dataExame"));
                ex.setCategoria(rs.getString("Categoria"));
                ex.setRealizado(rs.getInt("realizado"));
                ex.setHora(rs.getTime("hora"));
                
                exames.add(ex);
            }
          }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exames;        
    }
}
