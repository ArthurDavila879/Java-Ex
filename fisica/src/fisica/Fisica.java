/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fisica;

public class Fisica {

  
    public static void main(String[] args) {
        float tempo = InOut.leFloat("Insira o tempo gasto em horas durante a viagem ");
        float vMedia = InOut.leFloat("Insira a velocidade media em km/h ");
        float distancia = tempo*vMedia;
        float litros = InOut.leFloat("Insira a quantidade de litros gastos ");
        float consumo = distancia/litros;
        
        System.out.println("Distancia: "+ distancia+"km");
        System.out.println("Consumo: "+consumo+"L");
    }
    
    
}
