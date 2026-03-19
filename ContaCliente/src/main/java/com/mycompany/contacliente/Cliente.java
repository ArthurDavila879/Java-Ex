/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacliente;

/**
 *
 * @author alunolab10
 */
public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereco: "+ endereco);
        System.out.println("CPF: "+cpf);
    }

    public String getNome() {
        return nome;
    }

  
}
