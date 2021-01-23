/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtp;

/**
 *
 * @author ufa00717
 */
public class Disciplina {
    private String nome;
    private int periodo;
    private String codigo;
    private int cargaHoraria;
    private String tipo;
    
    public Disciplina(String nome, int periodo, String codigo, int cargaHoraria,
            String tipo){
        this.nome = nome;
        this.periodo = periodo;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.tipo = tipo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getPeriodo(){
        return periodo;
    }
    public String getCodigo(){
        return codigo;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public String getTipo(){
        return tipo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    @Override
    public String toString(){
        return("\nNome: " + nome+"\nPeriodo: "+ periodo + "\nCodigo" + codigo + "\nCarga Horaria"+cargaHoraria + 
            "\ntipo" + tipo);
    }
}
