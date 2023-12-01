import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TesteArvoreBinariaBusca {
    public static void main(String[] args) {
        Random rand = new Random();

        // Gerar 10 árvores diferentes
        for (int i = 0; i < 10; i++) {
            ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();

            // Inserir elementos na árvore
            for (int j = 0; j < 100; j++) {
                arvore.inserir(rand.nextInt(1000));
            }

            // Criar arquivo para gravar os resultados
            try (PrintWriter writer = new PrintWriter(new FileWriter("resultados_arvore_" + i + ".txt"))) {
                long startTime;

                // Passeio em ordem
                startTime = System.nanoTime();
                arvore.emOrdem();
                writer.println("Em Ordem: " + (System.nanoTime() - startTime) / 1e9 + " segundos");

                // Passeio em pré-ordem
                startTime = System.nanoTime();
                arvore.preOrdem();
                writer.println("Pré-Ordem: " + (System.nanoTime() - startTime) / 1e9 + " segundos");

                // Passeio em pós-ordem
                startTime = System.nanoTime();
                arvore.posOrdem();
                writer.println("Pós-Ordem: " + (System.nanoTime() - startTime) / 1e9 + " segundos");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
