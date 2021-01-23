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
public class GerenciadorAlunos {
    private ArrayList <Aluno> listaAlunos = new ArrayList();
    public ArrayList <Aluno> alunosCurso = new ArrayList();
    
    public void cadastrarAluno(String nome, String cpf, int idade, String rg,String numMatricula, Curso curso){
        listaAlunos.add(new Aluno(nome, cpf, idade, rg, numMatricula, curso));
    }
    
    public Aluno consultarAlunoPorMatricula(String numMatricula){
        for(int i=0 ; i<listaAlunos.size() ; i++){
            if(numMatricula.equals(listaAlunos.get(i).getNumMatricula())){
                return listaAlunos.get(i);
            }
        }
        return null;
    }
    
    public ArrayList consultarAlunoPorCurso(String nomeCurso){
        for(int i=0 ; i<listaAlunos.size() ; i++){
            if(listaAlunos.get(i).getCurso().getNome().equals(nomeCurso)){
                alunosCurso.add(listaAlunos.get(i));
            }
        }
        return alunosCurso;
    }
    
    public void matricularAlunoEmDisciplina(String numMatricula,String codigo){
        consultarAlunoPorMatricula(numMatricula).matricularDisciplina(codigo);
    }
    public void matricularAluno(String numMatricula, Curso curso){
        Aluno a = consultarAlunoPorMatricula(numMatricula);
        a.setCurso(curso);
    }
    
    @Override
    public String toString(){
        return (listaAlunos.toString());
    }

}
