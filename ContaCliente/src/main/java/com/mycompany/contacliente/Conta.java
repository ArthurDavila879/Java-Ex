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
    public boolean sacar(double valor){
        if(this.saldo>0 && this.saldo >=valor){
            System.out.println("Valor sacado: "+valor);
            saldo -=valor;
            return true;
        }
        else System.out.println("Saldo negativo");
        return false;
    }
    
    public void deposito(double valor){
        saldo+=valor;
        System.out.println("Saldo atual apos deposito: "+this.saldo);
    }
   public boolean transfere(Conta contaDestino,double valor){
      if(verificarTransacao(valor)){ 
       contaDestino.deposito(valor);
       this.sacar(valor);
       return true;
      }
      else return false;
   }
   
   private boolean verificarTransacao(double valor){
   return saldo>valor;
       }
   
   public void imprimir(){
       System.out.println("Saldo: "+saldo);
       System.out.println("Numero: "+numero);
       cliente.imprimir();
   }   
    
}
