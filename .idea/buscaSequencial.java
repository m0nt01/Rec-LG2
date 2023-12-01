import java.util.Arrays;

public class BuscaSequencial<T> {
    public int buscaSequencial(T[] array, T chave) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(chave)) {
                return i;
            }
        }
        return -1; // Retorna -1 se a chave não for encontrada
    }
}
