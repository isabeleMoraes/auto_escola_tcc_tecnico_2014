package br.com.isabele.modelo;

import java.util.Date;

/**
 *
 * @author Belinha
 */
public class Instrutor {
    private int codInstrutor;
    private String nome;
    private Date dataNascimento;
    private String CPF;
    private String rua;
    private String bairro;
    private int numero;
    private int telResidencial;
    private int celular1;
    private int celular2; 

    public int getCodInstrutor() {
        return codInstrutor;
    }

    public void setCodInstrutor(int codInstrutor) {
        this.codInstrutor = codInstrutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(int telResidencial) {
        this.telResidencial = telResidencial;
    }

    public int getCelular1() {
        return celular1;
    }

    public void setCelular1(int celular1) {
        this.celular1 = celular1;
    }

    public int getCelular2() {
        return celular2;
    }

    public void setCelular2(int celular2) {
        this.celular2 = celular2;
    }

   /* public java.sql.Date getDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    
}
