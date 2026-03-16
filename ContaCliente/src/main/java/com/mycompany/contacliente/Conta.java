/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacliente;


public class Conta {
    private double saldo;
    private int numero;
    public Cliente cliente;
    
    public Conta(){
        
    }

    public Conta(double saldo, int numero, Cliente cliente) {
        this.saldo = saldo;
        this.numero = numero;
        this.cliente = cliente;
    }
    public boolean saca(double valor){
        if(this.saldo>0){
            System.out.println("Valor sacado: "+valor);
            saldo -=valor;
            return true;
        }
        else System.out.println("Saldo negativo");
        return false;
    }
    
    public void deposito(double valor){
        saldo+=valor;
        System.out.println("Saldo atual apos deposito:"+this.saldo);
    }
   public void transfere(Conta destino,double valor){
       destino.saldo +=valor;
       this.saldo -=valor;
   }
   
   public boolean verificarTransacao(double valor){
       if(this.saldo >=valor){
           System.out.println("Possivel trasferir");
           return true;
       }
       else {
           System.out.println("Saldo insuficiente ");
           return false;
       }
   }
   public void imprimir(){
       System.out.println("Saldo: "+saldo);
       System.out.println("Numero: "+numero);
       cliente.imprimir();
   }

   
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
