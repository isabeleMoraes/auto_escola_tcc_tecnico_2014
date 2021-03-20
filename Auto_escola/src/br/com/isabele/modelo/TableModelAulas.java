/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.isabele.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Belinha
 */
public class TableModelAulas extends AbstractTableModel {
    
    private String[] nomeColunas = {"Data", "Hora", "Aluno", "Instrutor", "Veiculo", "Categoria", "Realizada"};
    private ArrayList<Aula> aulas;
    SimpleDateFormat formatacaoData;
    SimpleDateFormat sdf;

    public TableModelAulas(){
        aulas = new ArrayList<>();
        formatacaoData = new SimpleDateFormat("dd/MM/yyyy");
        sdf = new SimpleDateFormat("HH:mm");
    }
    
    public TableModelAulas(ArrayList<Aula> listaDeAulas){
        this();
        aulas.addAll(listaDeAulas);
    }
    
    public Aula retornarAulaSelecionada(int linha){
        return aulas.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return aulas.size();
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
        Aula aula = aulas.get(rowIndex);
               
       // while(aula.getRealizada()==0){
        switch(columnIndex){
            case 0:
                return formatacaoData.format(aula.getDataAula()); 
            case 1:
                return sdf.format(aula.getHora());
            case 2:
                return aula.getNomeAluno();
            case 3:
                return aula.getNomeInstrutor();
            case 4:
                return aula.getPlaca();
            case 5:
                return aula.getCategoria();
            case 6:
                if(aula.getRealizada() == 1){
                    return "Sim";
                }else{
                    return "Nao";
                }
            default:
                throw new UnsupportedOperationException("Operação nao suportada"); 
        }       
    }
}





