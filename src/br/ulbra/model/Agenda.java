/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

/**
 *
 * @author s.lucas
 */
public class Agenda {
    private int cod;
    private String nome, email, celular, telefone, aniversario;
    public Agenda(){
        
    }
    public Agenda(int cod, String nome, String celular, String telefone, String aniversario, String email){
        this.aniversario=aniversario;
        this.email=email;
        this.celular=celular;
        this.telefone=telefone;
        this.nome=nome;
        this.cod=cod;
        
    }

    @Override
    public String toString() {
        return "Agenda{" + "cod=" + cod + ", nome=" + nome + ", email=" + email + ", celular=" + celular + ", telefone=" + telefone + ", aniversario=" + aniversario + '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
}
