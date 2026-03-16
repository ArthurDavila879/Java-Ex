package poo2.ex04;

import java.util.Random;

public class PopulacaoBaratas {
    Random random = new Random();
    int populacao = Math.abs(random.nextInt(1000000))+1;

    public void aumentarBaratas(){
        populacao = (int)(populacao*1.3);
    }
    public void sprayPulvarizador(){
        populacao = (int)(populacao*0.9);
    }
    public int getQtdBaratas(){
        return populacao;
    }
}
