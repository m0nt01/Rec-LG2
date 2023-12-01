import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

        // Criar arquivo para gravar os resultados
        try (PrintWriter writer = new PrintWriter(new FileWriter("resultados_busca_binaria.txt"))) {
            // Buscar aleatoriamente 10% dos elementos
            for (int i = 0; i < vetor.length / 10; i++) {
                int chave = vetor[rand.nextInt(vetor.length)];
                long startTime = System.nanoTime();
                int resultado = buscaBinaria.buscaBinaria(vetor, chave);
                long endTime = System.nanoTime();
                double tempoEmSegundos = (endTime - startTime) / 1e9;

                // Gravar o resultado da busca e o tempo no arquivo
                writer.println("Chave: " + chave + ", Resultado: " + resultado + ", Tempo: " + tempoEmSegundos + " segundos");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
