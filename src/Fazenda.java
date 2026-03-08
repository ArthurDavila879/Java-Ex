public class Fazenda {
    public static void main(String[] args) {
        float pesos = 0.0F;
        float quantidade = (float)InOut.leInt("Insira quantos bois deseja");
        float maisgordo = 0.0F;
        float maismagro = 10000.0F;

        for(int i = 0; (float)i < quantidade; ++i) {
            float peso = InOut.leFloat("Insira o peso em KG do Boi ");
            if (peso > maisgordo) {
                maisgordo = peso;
            }

            if (peso < maismagro) {
                maismagro = peso;
            }

            pesos += peso;
        }

        float media = pesos / quantidade;
        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Mais gordo: %.2f\n", maisgordo);
        System.out.printf("Mais magro: %.2f\n", maismagro);
    }
}
