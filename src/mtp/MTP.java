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
public class MTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciadorCursos gc =  new GerenciadorCursos();
        
        gc.cadastrarCurso("Eng", "Telecom", 10);
        
        gc.consultarCursoPorSigla("Telecom").cadastrarDisciplina("MTP", 2, "GEE508", 90, "Obrigatoria");
        gc.consultarCursoPorSigla("Telecom").cadastrarDisciplina("ESOF", 3, "GEE514", 60, "Obrigatoria");
        
        GerenciadorAlunos ga = new GerenciadorAlunos();
        
        ga.cadastrarAluno("Victor", "123", 17, "717171", "11211ebi044", gc.consultarCursoPorSigla("Telecom"));
        ga.matricularAlunoEmDisciplina("11211ebi044", "GEE508");
        
        
        System.out.println(ga);
        
        
        
        
    }
}
