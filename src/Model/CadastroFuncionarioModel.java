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
    private String nome;
    private String endereco;
    private String cep;
    private String complemento;
    private String numero;
    private String cpf;
    private String sexo;
    private String rg;
    private double matricula;

        
    public CadastroFuncionarioModel(double matricula){
        this.matricula = matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public String getCep(){
        return this.cep;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getSexo(){
        return this.sexo;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getRg(){
        return this.rg;
    }
      
}
