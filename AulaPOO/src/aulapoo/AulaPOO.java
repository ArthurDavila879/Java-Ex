/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo;


public class AulaPOO {


    public static void main(String[] args) {
        
        Endereco end1 = new Endereco();
        end1.rua = "Av. Coronel Pedro Maia";
        end1.cep = "29102-570";
        end1.referencia = " Ali chefe";
        end1.numero = 805;
        
        Empregado e1 = new Empregado("Arthur D'Avila",202526169,10000f,end1);
        
        e1.imprimir();
 
        
    }
    
}
