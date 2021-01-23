
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtp;

import java.util.ArrayList;

/**
 *
 * @author ufa00717
 */
public class Curso {
    private String nome;
    private String sigla;
    private float duracao;
    private ArrayList <Disciplina> listaDisciplinasGrade = new ArrayList();
    
    public Curso(String nome, String sigla, float duracao){
        this.nome = nome;
        this.sigla = sigla;
        this.duracao = duracao;
    }
    
    //getters
    public String getNome(){
        return nome;
    }
    public String getSigla(){
        return sigla;
    }
    public float getDuracao(){
        return duracao;
    }
    public ArrayList <Disciplina> getListaDisciplinasGrade(){
        return this.listaDisciplinasGrade;
    }
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public void setListaDisciplinasGrade(ArrayList listaDisciplinasGrade){
        this.listaDisciplinasGrade = listaDisciplinasGrade;
    }
    //Cadastrar Disciplinas
    public void cadastrarDisciplina(String nome, int periodo, String codigo, int cargaHoraria, String tipo){
        listaDisciplinasGrade.add(new Disciplina(nome, periodo, codigo, cargaHoraria, tipo));

    }
    
    public Disciplina consultarDiscPorCodigo(String cod){
        for(int i=0 ; i<listaDisciplinasGrade.size() ; i++){
            if(cod.equals(listaDisciplinasGrade.get(i).getCodigo())){
                return listaDisciplinasGrade.get(i);
            }
        }
        return null;
    }
    @Override
    public String toString(){
        return("\nNome: "+nome+"\nSigla: "+sigla+"\nDuracao: "+duracao + "\nLista de Disciplinas da Grade: " + listaDisciplinasGrade);
    }
}


