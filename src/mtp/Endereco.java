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
public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    
    public Endereco(String logradouro, int numero, String complemento, String bairro, String cep){
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }
    
    public String getLogradouro(){
        return logradouro;
    }
    public int getNumero(){
        return numero;
    }
    public String getComplemento(){
        return complemento;
    }
    public String getBairro(){
        return bairro;
    }
    public String getCep(){
        return cep;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
    
    @Override
    public String toString(){
        return("\nLogradouro: " + logradouro + "\nNumero: " + numero +
                "\nComplemento:"+ complemento + "\nBairro" + bairro + "\nCep: " + cep );
    }
}
