/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Natalie
 */
public class CadastroFuncionarioModel {
    private static short contador = 0;
    private String nome;
    private String endereco;
    private String cep;
    private String complemento;
    private String numero;
    private String cpf;
    private String sexo;
    private String rg;
    private short matricula;

        
    public CadastroFuncionarioModel(){
        matricula = ++CadastroFuncionarioModel.contador;
        }
    public short getMatricula(){
        return matricula;
    }
   
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
         this.nome = nome;
    }
 
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public String getCep(){
        return cep;
    }
    public void setCep(String cpf){
        this.cep = cep;
    }
    
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }

      
}
