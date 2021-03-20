package br.com.isabele.modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Belinha
 */
public class Exame {
  private int codExame;
  private int codAluno;
  private String placa;
  private String categoria;
  private Date dataExame;
  private int realizado;
  private Time hora;
  private String nomeAluno;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
  
  

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getRealizado() {
        return realizado;
    }

    public void setRealizado(int realizado) {
        this.realizado = realizado;
    }

    public int getCodExame() {
        return codExame;
    }

    public void setCodExame(int codExame) {
        this.codExame = codExame;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataExame() {
        return dataExame;
    }

    public void setDataExame(Date dataExame) {
        this.dataExame = dataExame;
    }
}
