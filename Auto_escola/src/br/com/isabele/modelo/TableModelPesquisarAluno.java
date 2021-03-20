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


public class TableModelPesquisarAluno extends AbstractTableModel {
    
    private String[] nomeColunas = {"Codigo", "Nome", "CPF"};
    private ArrayList<Aluno> alunos;

    public TableModelPesquisarAluno(){
        alunos = new ArrayList<>();
    }
    
    public TableModelPesquisarAluno(ArrayList<Aluno> listaDeAlunos){
        this();
        alunos.addAll(listaDeAlunos);
    }
    
    public Aluno retornarAlunoSelecionado(int linha){
        return alunos.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return alunos.size();
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
        Aluno aluno = alunos.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return aluno.getCodAluno();
            case 1:
                return aluno.getNome();
            case 2:
                return aluno.getCPF();
            default:
                throw new UnsupportedOperationException("Operaçao sem suporte");
        }
    }

}
