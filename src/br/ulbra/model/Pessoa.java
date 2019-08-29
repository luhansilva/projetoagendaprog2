/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

public class Pessoa {
    int cod;
    String nome;
    String celular;
    String telefone;
    String email;
    String dataani;
    public Pessoa(){
        
    }
    public Pessoa(int cod, String nome, String celular, String telefone, String email, String dataani){
        this.cod=cod;
        this.nome=nome;
        this.celular=celular;
        this.telefone=telefone;
        this.email=email;
        this.dataani=dataani;        
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataani() {
        return dataani;
    }

    public void setDataani(String dataani) {
        this.dataani = dataani;
    }

    public String toString() {
        return "Pessoa{" + "cod=" + cod + ", nome=" + nome + ", celular=" + celular + ", telefone=" + telefone + ", email=" + email + ", dataani=" + dataani + '}';
    }
    
    
}
