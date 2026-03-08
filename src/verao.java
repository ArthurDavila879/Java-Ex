public class verao {
    public static void main(String[] args) {
        int temp,tempMedia,i,soma = 0;
        for ( i=0;i<15;i++){
            temp = InOut.leInt("Insira a temperatura: ");
            if (temp<28){
                System.out.printf("Brother, ta fazendo calor dmsss, onde que a temperatura ta %d °C. Erro no sistema po\n",temp);
                break;

            }
            soma +=temp;
        }
        tempMedia = soma/i;
        System.out.println("A media de temperatura foi: "+tempMedia);

    }
}
