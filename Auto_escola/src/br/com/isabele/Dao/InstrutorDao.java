
package br.com.isabele.Dao;

import br.com.isabele.modelo.Aluno;
import br.com.isabele.modelo.Instrutor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Belinha
 */
public class InstrutorDao {
      private Connection con;
    
    public InstrutorDao(){
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
    int codigoInstrutor;
    
    public void pegaCodigo(int codigo){
        codigoInstrutor = codigo;
        
    }
    public int exibeCodigo(){
        return codigoInstrutor;
    }
    
    public void cadastrarInstrutor(Instrutor i){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql = "insert into instrutores "
                + "(nomeInstrutor, dataNascimento, cpf, bairro, rua, numeroCasa, telResidencial, celular, celular1) "
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, i.getNome());
            ps.setDate(2, new java.sql.Date (i.getDataNascimento().getTime()));//Colocar a data. verificar como fazer.
            ps.setString(3, i.getCPF());
            ps.setString(4, i.getBairro());
            ps.setString(5, i.getRua());
            ps.setInt(6, i.getNumero());
            ps.setInt(7, i.getTelResidencial());
            ps.setInt(8, i.getCelular1());
            ps.setInt(9,i.getCelular2());
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            rs.next();            
            pegaCodigo(rs.getInt(1));
            
        }catch(SQLException e){
            throw new IllegalArgumentException(e/*"Erro ao cadastrar instrutor!\n Por favor, verifique se os campos e os dados estao corretos!"*/);
        }finally{
            liberarRecursos(con,ps);
        }
    }
    public void alterarInstrutor(Instrutor i){
        PreparedStatement ps = null;
        String sql = "update instrutores "
                + "set nomeInstrutor=?, dataNascimento=?, cpf=?, "
                + "bairro=?, rua=?, numeroCasa=?, "
                + "telResidencial=?, celular=?, celular1=? "
                + "where codInstrutor = ?";
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, i.getNome());
            ps.setDate(2, new java.sql.Date (i.getDataNascimento().getTime()));//Colocar a data. verificar como fazer.
            ps.setString(3, i.getCPF());
            ps.setString(4, i.getBairro());
            ps.setString(5, i.getRua());
            ps.setInt(6, i.getNumero());
            ps.setInt(7, i.getTelResidencial());
            ps.setInt(8, i.getCelular1());
            ps.setInt(9,i.getCelular2());
            ps.setInt(10, i.getCodInstrutor());
                   
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new IllegalArgumentException(e/*"Erro ao alterar os dados do Instrutor!\n Por favor, verifique se os campos e os dados estao corretos!"*/);
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
    public void excluirInstrutor(Instrutor i){
        PreparedStatement ps = null;
        String sql = "delete from instrutores "
                + "where codInstrutor = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, i.getCodInstrutor());
            
            ps.executeUpdate();
        }catch(SQLException e){
            throw new IllegalArgumentException("Erro ao excluir o instrutor");
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
   public ArrayList<Instrutor> listarInstrutor(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Instrutor> instrutores = null;
        try{
            ps = this.con.prepareStatement("select * from Instrutores");
            rs = ps.executeQuery();
            
            instrutores = new ArrayList<>();

            while (rs.next()) {
                Instrutor i = new Instrutor();
                
                i.setCodInstrutor(rs.getInt("codInstrutor"));
                i.setNome(rs.getString("nomeInstrutor"));
                i.setDataNascimento(rs.getDate("dataNascimento"));// verificar como fazer com data
                i.setCPF(rs.getString("cpf"));
                i.setBairro(rs.getString("bairro"));
                i.setRua(rs.getString("rua"));
                i.setNumero(rs.getInt("numeroCasa"));
                i.setTelResidencial(rs.getInt("telResidencial"));
                i.setCelular1(rs.getInt("celular"));
                i.setCelular2(rs.getInt("celular1"));

                instrutores.add(i);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return instrutores;        
    }
    
    public Instrutor buscarInstrutor(int codigo){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Instrutor i = new Instrutor();
        try{
                       
            ps = this.con.prepareStatement("select * from instrutores where codInstrutor = ?");// verificar como fazer pra buscar por codigo tbm
            
            ps.setInt(1, codigo);
            
            rs = ps.executeQuery();
            
                rs.next();
                
                i.setCodInstrutor(rs.getInt("codInstrutor"));
                i.setNome(rs.getString("nomeInstrutor"));
                i.setCPF(rs.getString("cpf"));
                i.setDataNascimento(rs.getDate("dataNascimento"));// verificar como fazer com data
                i.setBairro(rs.getString("bairro"));
                i.setRua(rs.getString("rua"));
                i.setNumero(rs.getInt("numeroCasa"));
                i.setTelResidencial(rs.getInt("TelResidencial"));
                i.setCelular1(rs.getInt("Celular"));
                i.setCelular2(rs.getInt("Celular1"));
                
        } catch(Exception e){
            throw new IllegalArgumentException(e);
        } finally{
            liberarRecursos(con, ps, rs);
        }        
           return i;  
    } 
    
    public ArrayList<Instrutor> buscarInstrutorTexto(String s){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Instrutor> instrutores = null;
        
        try{
            if(s==null){
                ps = this.con.prepareStatement("select * from instrutores");
                rs = ps.executeQuery();

                
                instrutores = new ArrayList<>();
                
                while(rs.next()){
                    Instrutor i = new Instrutor(); 
                    
                    i.setCodInstrutor(rs.getInt("codInstrutor"));
                    i.setNome(rs.getString("nomeInstrutor"));
                    i.setCPF(rs.getString("cpf"));
                    i.setDataNascimento(rs.getDate("dataNascimento"));// verificar como fazer com data
                    i.setBairro(rs.getString("bairro"));
                    i.setRua(rs.getString("rua"));
                    i.setNumero(rs.getInt("numeroCasa"));
                    i.setTelResidencial(rs.getInt("TelResidencial"));
                    i.setCelular1(rs.getInt("Celular"));
                    i.setCelular2(rs.getInt("Celular1"));
                   
                    instrutores.add(i);
                }
            }else{
                ps = this.con.prepareStatement("select * from instrutores where nomeInstrutor like ?");
                
                ps.setString(1, "%"+s+"%");
            
                rs = ps.executeQuery();

                instrutores = new ArrayList<>();
                while(rs.next()){
                    Instrutor i = new Instrutor(); 
                    
                    i.setCodInstrutor(rs.getInt("codInstrutor"));
                    i.setNome(rs.getString("nomeInstrutor"));
                    i.setCPF(rs.getString("cpf"));
                    i.setDataNascimento(rs.getDate("dataNascimento"));// verificar como fazer com data
                    i.setBairro(rs.getString("bairro"));
                    i.setRua(rs.getString("rua"));
                    i.setNumero(rs.getInt("numeroCasa"));
                    i.setTelResidencial(rs.getInt("TelResidencial"));
                    i.setCelular1(rs.getInt("Celular"));
                    i.setCelular2(rs.getInt("Celular1"));
                    
                    instrutores.add(i);
                }
            }
           
        } catch(Exception e){
            throw new IllegalArgumentException(e/*"Erro ao buscar Veiculo"*/);
        } finally{
            liberarRecursos(con, ps, rs);
        }        
        return instrutores; 
    }
    public boolean verificaInstrutorExiste(String nome){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = this.con.prepareStatement("select * from intrutores where nomeInstrutor like ?");
            ps.setString(1, nome);

            rs = ps.executeQuery();

            return rs.next();
        }catch(Exception ex){
            return false;
        }
        
    }
}
