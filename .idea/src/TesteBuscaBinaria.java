import java.util.Random;

public class TesteBuscaBinaria {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] vetor = new Integer[10000];

        // Preencher vetor com números aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100000);
        }

        BuscaBinaria<Integer> buscaBinaria = new BuscaBinaria<>();

        // Buscar aleatoriamente 10% dos elementos
        for (int i = 0; i < vetor.length / 10; i++) {
            int chave = vetor[rand.nextInt(vetor.length)];
            long startTime = System.nanoTime();
            int resultado = buscaBinaria.buscaBinaria(vetor, chave);
            long endTime = System.nanoTime();
            double tempoEmSegundos = (endTime - startTime) / 1e9;

            // Gravar o resultado da busca e o tempo em um arquivo texto
            // (Implementação do arquivo não fornecida aqui)
        }
    }
}
