/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Belinha
 */
public class TableModelPesquisarInstrutor extends AbstractTableModel {
    
    private String[] nomeColunas = {"Codigo", "Nome", "CPF"};
    private ArrayList<Instrutor> instrutores;

    public TableModelPesquisarInstrutor(){
        instrutores = new ArrayList<>();
    }
    
    public TableModelPesquisarInstrutor(ArrayList<Instrutor> listaDeInstrutores){
        this();
        instrutores.addAll(listaDeInstrutores);
    }
    
    public Instrutor retornarInstrutorSelecionado(int linha){
        return instrutores.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return instrutores.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
    @Override
    public String getColumnName(int column){
        return nomeColunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Instrutor instrutor = instrutores.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return instrutor.getCodInstrutor();
            case 1:
                return instrutor.getNome();
            case 2:
                return instrutor.getCPF();
            default:
                throw new UnsupportedOperationException("Operaçao sem suporte");
        }
    }
}
