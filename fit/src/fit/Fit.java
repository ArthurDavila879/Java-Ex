/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fit;

/**
 *
 * @author alunolab10
 */
public class Fit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float altura = InOut.leFloat("Insira sua altura em metro");
     char sexo = InOut.leChar("Insira seu sexo (M/F)");
     
     if(sexo == 'M'){
         System.out.printf("Seu peso ideal: %.2f\n",((72.7*altura)-58));
     }
      if(sexo == 'F'){
         System.out.printf("Seu peso ideal: %.2f\n",((62.1*altura)-44.7));
     }
    }
    
}
