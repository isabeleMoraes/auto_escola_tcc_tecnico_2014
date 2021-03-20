package br.com.isabele.modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Belinha
 */
public class Aula {
    
    
    
    private int codAula;
    private int codAluno;
    private String categoria;
    private Date dataAula;
    private int codInstrutor;
    private String placa;
    private int realizada;
    private Time hora;
    private String nomeAluno;
    private String nomeInstrutor;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    
    
    
    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
    public int getRealizada() {
        return realizada;
    }

    public void setRealizada(int realizada) {
        this.realizada = realizada;
    }

    public int getCodAula() {
        return codAula;
    }

    public void setCodAula(int codAula) {
        this.codAula = codAula;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataAula() {
        return dataAula;
    }

    public void setDataAula(Date dataAula) {
        this.dataAula = dataAula;
    }

    public int getCodInstrutor() {
        return codInstrutor;
    }

    public void setCodInstrutor(int codInstrutor) {
        this.codInstrutor = codInstrutor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
