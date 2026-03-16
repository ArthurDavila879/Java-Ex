

package com.mycompany.contacliente;

public class ContaCliente {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Arthur D'Avila","AliDoLado","2045456467");
        Cliente cli2 = new Cliente("CauaPassos","XIQUEXIQUE","213246467");

        Conta c1 = new Conta(20001,122,cli1);
        Conta c2 = new Conta(20000,123,cli2);
        
        c1.imprimir();
        
        c1.saca(1000);
        
        System.out.println("");
        
        c1.imprimir();
        
        System.out.println("");

        c1.deposito(2000);
        
        System.out.println("");

        c1.imprimir();
        
        System.out.println("");

        if(c1.verificarTransacao(2000000)){
            c1.transfere(c2,2000000);
        }
      
        
        System.out.println("");
        
        c1.transfere(c2, 1000);

        System.out.println("");
        
        c1.imprimir();
    }
}
