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
public class TableModelPesquisarVeiculo extends AbstractTableModel {
    
    private String[] nomeColunas = {"Placa", "Modeo", "Cor"};
    private ArrayList<Veiculo> veiculos;

    public TableModelPesquisarVeiculo(){
        veiculos = new ArrayList<>();
    }
    
    public TableModelPesquisarVeiculo(ArrayList<Veiculo> listaDeVeiculos){
        this();
        veiculos.addAll(listaDeVeiculos);
    }
    
    public Veiculo retornarVeiculoSelecionado(int linha){
        return veiculos.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return veiculos.size();
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
        Veiculo veiculo = veiculos.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return veiculo.getPlaca();
            case 1:
                return veiculo.getModelo();
            case 2:
                return veiculo.getCor();
            default:
                throw new UnsupportedOperationException("Operaçao sem suporte");
        }
    }
}
