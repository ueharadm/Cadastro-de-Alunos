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
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String rg;
    private Endereco endereco;
    
    public Pessoa(String nome, String cpf, int idade, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.rg = rg;
    }
    public void cadastrarEndereco(String logradouro, int numero, String complemento, String bairro, String cep){
        this.endereco = new Endereco("logradouro",1,"complemento","bairro","cep");
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    public String getRg(){
        return rg;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void getRg(String rg){
        this.rg = rg;
    }
    public void getEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return("\nNome: " + nome + "\nCPF: " + cpf+ "\nIdade: " + idade + "\nRG: " + rg + "\n" + endereco);
    }
}
