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
public class GerenciadorCursos {
    private ArrayList <Curso> listaCursos = new ArrayList();
  
    public void cadastrarCurso(String nome, String sigla, float duracao){
        listaCursos.add(new Curso(nome, sigla, duracao));
    }
    
    public Curso consultarCursoPorSigla(String sigla){
        for(int i=0 ; i<listaCursos.size() ; i++){
            if(sigla.equals(listaCursos.get(i).getSigla())){
                return listaCursos.get(i);
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        return(listaCursos.toString());
    }
}
