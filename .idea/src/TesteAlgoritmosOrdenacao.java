import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class TesteAlgoritmosOrdenacao {
    public static void main(String[] args) {
        Random rand = new Random();

        // Gerar 10 vetores aleatórios
        for (int i = 0; i < 10; i++) {
            Integer[] vetor = new Integer[10000];

            // Preencher vetor com números aleatórios
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = rand.nextInt(100000);
            }

            AlgoritmosOrdenacao<Integer> algoritmos = new AlgoritmosOrdenacao<>();

            // Medir o tempo de ordenação para o InsertionSort
            long startTime = System.nanoTime();
            algoritmos.insertionSort(vetor.clone());
            long endTime = System.nanoTime();
            double tempoEmSegundos = (endTime - startTime) / 1e9;

            // Gravar o tempo do InsertionSort em um arquivo texto
            try (PrintWriter writer = new PrintWriter(new FileWriter("tempo_insertion_sort_" + i + ".txt"))) {
                writer.println("Tempo do InsertionSort: " + tempoEmSegundos + " segundos");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Medir o tempo de ordenação para o SelectionSort
            startTime = System.nanoTime();
            algoritmos.selectionSort(vetor.clone());
            endTime = System.nanoTime();
            tempoEmSegundos = (endTime - startTime) / 1e9;

            // Gravar o tempo do SelectionSort em um arquivo texto
            try (PrintWriter writer = new PrintWriter(new FileWriter("tempo_selection_sort_" + i + ".txt"))) {
                writer.println("Tempo do SelectionSort: " + tempoEmSegundos + " segundos");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

