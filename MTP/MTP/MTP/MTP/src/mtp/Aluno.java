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
public class Aluno extends Pessoa{
    private String numMatricula;
    private Curso curso;
    private ArrayList <Disciplina> listaDisciplinas = new ArrayList();
    public Aluno(String nome, String cpf, int idade, String rg,String numMatricula, Curso curso){
        super(nome,cpf,idade,rg);
        this.numMatricula = numMatricula;
        this.curso = curso;
    }
    
    public String getNumMatricula(){
        return numMatricula;
    }
    public Curso getCurso(){
        return curso;
    }
    public ArrayList getListaDisciplinas(){
        return listaDisciplinas;
    }
    
    public void setNumMatricula(String numMatricula){
        this.numMatricula = numMatricula;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    public void setListaDisciplinas(ArrayList listaDisciplinas){
        this.listaDisciplinas = listaDisciplinas;
    }
    
    public void matricularDisciplina(String codigo){
        for(int i=0 ; i<this.curso.getListaDisciplinasGrade().size() ; i++){
            if(codigo.equals(this.curso.getListaDisciplinasGrade().get(i).getCodigo())){
                this.listaDisciplinas.add(this.curso.getListaDisciplinasGrade().get(i));
            }
        }
            
    }
    
    @Override
    public String toString(){
        return("\nNumero de Matricula: " + numMatricula + "\nCurso: " + curso + "\nLista de Disciplinas: " + listaDisciplinas);
    }
            
    
}
