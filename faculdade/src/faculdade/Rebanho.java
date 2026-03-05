
package faculdade;


public class Rebanho {

  
    public static void main(String[] args) {
      
       float pesos = 0.0f;
       float quantidade = InOut.leInt("Insira quantos bois deseja");
       float maisgordo = 0.0f;
       float maismagro = 10000.0f;
       
       
       for(int i =0;i<quantidade;i++){
       float peso = InOut.leFloat("Insira o peso em KG do Boi ");
       
       if(peso > maisgordo){
           maisgordo = peso;
       }
       if(peso <maismagro){
           maismagro= peso;
       }
       pesos +=peso;
      

       }
     
       float media = (pesos/quantidade);
       System.out.printf("Media: %.2f\n",media);
       System.out.printf("Mais gordo: %.2f\n",maisgordo);
       System.out.printf("Mais magro: %.2f\n",maismagro);
    }
    
}
