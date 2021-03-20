/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Belinha
 */
public class TableModelExames extends AbstractTableModel {
    
    private String[] nomeColunas = {"Data", "Hora", "Aluno", "Veiculo", "Categoria", "Realizada"};
    private ArrayList<Exame> exames;
    SimpleDateFormat formatacaoData;
    SimpleDateFormat sdf;

    public TableModelExames(){
        exames = new ArrayList<>();
        formatacaoData = new SimpleDateFormat("dd/MM/yyyy");
        sdf = new SimpleDateFormat("HH:mm");
    }
    
    public TableModelExames(ArrayList<Exame> listaDeExame){
        this();
        exames.addAll(listaDeExame);
    }
    
    public Exame retornarExameSelecionada(int linha){
        return exames.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return exames.size();
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
        Exame exame = exames.get(rowIndex);
         
        switch(columnIndex){
            case 0:
                return formatacaoData.format(exame.getDataExame());
            case 1:
                return sdf.format(exame.getHora());
            case 2:
                return exame.getNomeAluno();
            case 3:
                return exame.getPlaca();
            case 4:
                return exame.getCategoria();
            case 5:
                if(exame.getRealizado() == 1){
                    return "Sim";
                }else{
                    return "Nao";
                }
            default:
                throw new UnsupportedOperationException("Operação nao suportada"); 
        }
    } 
}
