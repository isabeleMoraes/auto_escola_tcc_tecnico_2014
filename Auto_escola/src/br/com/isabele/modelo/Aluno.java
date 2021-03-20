package br.com.isabele.modelo;

import java.util.Date;

/**
 *
 * @author Belinha
 */
public class Aluno {
   private int codAluno;
   private String nome; 
   private int CPF;
   private Date dataNascimento;
   private String rua;
   private String bairro;
   private int numero;
   private String categoria;
   private int telResidencial;
   private int celular1;
   private int celular2;
   private int cep;
   public String Tela;

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
   
    public int getCep(){
        return cep;
    }
    
    public void setCep(int cep){
        this.cep = cep;
    }
   
}
