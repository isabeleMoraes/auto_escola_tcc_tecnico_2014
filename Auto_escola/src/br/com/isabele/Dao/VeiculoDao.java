/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Dao;


import br.com.isabele.modelo.Aula;
import br.com.isabele.modelo.Instrutor;
import br.com.isabele.modelo.Veiculo;
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
public class VeiculoDao {
    private Connection con;
    
    public VeiculoDao(){
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
    
    public void cadastrarVeiculo(Veiculo v){
        PreparedStatement ps = null;
        
        String sql = "insert into veiculos "
                + "(placa, cor, TipoDeCombustivel, modelo, ano) "
                + "values(?, ?, ?, ?, ?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getCor());//Colocar a data. verificar como fazer.
            ps.setString(3, v.getTipoCombustivel());
            ps.setString(4, v.getModelo());
            ps.setInt(5, v.getAno());
                        
            ps.executeUpdate();
        }catch(SQLException e){
            throw new IllegalArgumentException(e/*"Erro ao cadastrar Veiculo!\n Por favor, verifique se os campos e os dados estao corretos!"*/);
        }finally{
            liberarRecursos(con,ps);
        }
    }
    public void alterarVeiculo(Veiculo v){
        PreparedStatement ps = null;
        String sql = "update veiculos "
                + "set cor=?, TipoDeCombustivel=?, modelo=?, ano=? "
                + "where placa = ?";
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getCor());//Colocar a data. verificar como fazer.
            ps.setString(2, v.getTipoCombustivel());
            ps.setString(3, v.getModelo());
            ps.setInt(4, v.getAno());
            ps.setString(5, v.getPlaca());
                        
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new IllegalArgumentException(e/*"Erro ao alterar os dados do Veiculo!\n Por favor, verifique se os campos e os dados estao corretos!"*/);
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
    public void excluirVeiculo(Veiculo v){
        PreparedStatement ps = null;
        String sql = "delete from veiculos "
                + "where placa = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getPlaca());
            
            ps.executeUpdate();
        }catch(SQLException e){
            throw new IllegalArgumentException("Erro ao excluir o veiculo");
        }finally{
            liberarRecursos(con, ps);
        }
    }
    
   public ArrayList<Veiculo> listarVeiculo(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Veiculo> veiculos = null;
        try{
            ps = this.con.prepareStatement("select * from veiculos");
            rs = ps.executeQuery();
            
            veiculos = new ArrayList<>();

            while (rs.next()) {
                Veiculo v = new Veiculo();
                
                v.setPlaca(rs.getString("placa"));
                v.setCor(rs.getString("cor"));
                v.setTipoCombustivel(rs.getString("TipoDeCombustivel"));// verificar como fazer com data
                v.setModelo(rs.getString("modelo"));
                v.setAno(rs.getInt("ano"));
                

                veiculos.add(v);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return veiculos;        
    }
    
    public Veiculo buscarVeiculo(String s){
        PreparedStatement ps = null;
        ResultSet rs = null;
              
        Veiculo v = new Veiculo();
        try{
            
            ps = this.con.prepareStatement("select * from veiculos where placa like ?");
            
            ps.setString(1, s);
            
            rs = ps.executeQuery();
            
            rs.next();
             
                v.setPlaca(rs.getString("placa"));
                v.setCor(rs.getString("cor"));
                v.setTipoCombustivel(rs.getString("TipoDeCombustivel"));
                v.setModelo(rs.getString("Modelo"));
                v.setAno(rs.getInt("Ano"));
                
           
        } catch(Exception e){
            throw new IllegalArgumentException(e/*"Erro ao buscar Veiculo"*/);
        } finally{
            liberarRecursos(con, ps, rs);
        }        
        return v;         
    }
    
    public ArrayList<Veiculo> buscarVeiculoTexto(String s){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Veiculo> veiculos = null;
        
        try{
            if(s==null){
                ps = this.con.prepareStatement("select * from veiculos");
                rs = ps.executeQuery();

                
                veiculos = new ArrayList<>();
                
                while(rs.next()){
                    Veiculo v = new Veiculo(); 
                    
                    v.setPlaca(rs.getString("placa"));
                    v.setCor(rs.getString("cor"));
                    v.setTipoCombustivel(rs.getString("TipoDeCombustivel"));
                    v.setModelo(rs.getString("Modelo"));
                    v.setAno(rs.getInt("Ano"));
                    
                    veiculos.add(v);
                }
            }else{
                ps = this.con.prepareStatement("select * from veiculos where placa like ?");
                
                ps.setString(1, "%"+s+"%");
            
                rs = ps.executeQuery();

                veiculos = new ArrayList<>();
                while(rs.next()){
                    Veiculo v = new Veiculo(); 
                    
                    v.setPlaca(rs.getString("placa"));
                    v.setCor(rs.getString("cor"));
                    v.setTipoCombustivel(rs.getString("TipoDeCombustivel"));
                    v.setModelo(rs.getString("Modelo"));
                    v.setAno(rs.getInt("Ano"));
                    
                    veiculos.add(v);
                }
            }
           
        } catch(Exception e){
            throw new IllegalArgumentException(e/*"Erro ao buscar Veiculo"*/);
        } finally{
            liberarRecursos(con, ps, rs);
        }        
        return veiculos; 
    }

    public void alterarVeiculo(Aula au) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
