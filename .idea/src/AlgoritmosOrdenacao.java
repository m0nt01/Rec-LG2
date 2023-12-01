import java.util.Arrays;

public class AlgoritmosOrdenacao<T extends Comparable<T>> {
    public void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(chave) < 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = chave;
        }
    }

    public void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[indiceMinimo]) > 0) {
                    indiceMinimo = j;
                }
            }

            T temp = array[indiceMinimo];
            array[indiceMinimo] = array[i];
            array[i] = temp;
        }
    }
}
