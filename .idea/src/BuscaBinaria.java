import java.util.Arrays;

public class BuscaBinaria<T extends Comparable<T>> {
    public int buscaBinaria(T[] array, T chave) {
        Arrays.sort(array); // Ordenar o array antes da busca binária
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio].compareTo(chave) == 0) {
                return meio;
            } else if (array[meio].compareTo(chave) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1; // Retorna -1 se a chave não for encontrada
    }
}
