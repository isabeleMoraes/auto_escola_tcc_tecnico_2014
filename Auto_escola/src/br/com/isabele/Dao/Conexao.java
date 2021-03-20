/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Belinha
 */
public class Conexao {
     public Connection criarConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Auto_Escola", "root", "root");
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
