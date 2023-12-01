class No<T extends Comparable<T>> {
    T chave;
    No<T> esquerda, direita;

    public No(T chave) {
        this.chave = chave;
        this.esquerda = this.direita = null;
    }
}

public class ArvoreBinariaBusca<T extends Comparable<T>> {
    private No<T> raiz;

    // Método para inserir um elemento na árvore
    public void inserir(T chave) {
        raiz = inserirRec(raiz, chave);
    }

    private No<T> inserirRec(No<T> raiz, T chave) {
        if (raiz == null) {
            return new No<>(chave);
        }

        if (chave.compareTo(raiz.chave) < 0) {
            raiz.esquerda = inserirRec(raiz.esquerda, chave);
        } else if (chave.compareTo(raiz.chave) > 0) {
            raiz.direita = inserirRec(raiz.direita, chave);
        }

        return raiz;
    }

    // Métodos de passeio na árvore

    // Em ordem
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(No<T> raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.esquerda);
            System.out.print(raiz.chave + " ");
            emOrdemRec(raiz.direita);
        }
    }

    // Pré-ordem
    public void preOrdem() {
        preOrdemRec(raiz);
    }

    private void preOrdemRec(No<T> raiz) {
        if (raiz != null) {
            System.out.print(raiz.chave + " ");
            preOrdemRec(raiz.esquerda);
            preOrdemRec(raiz.direita);
        }
    }

    // Pós-ordem
    public void posOrdem() {
        posOrdemRec(raiz);
    }

    private void posOrdemRec(No<T> raiz) {
        if (raiz != null) {
            posOrdemRec(raiz.esquerda);
            posOrdemRec(raiz.direita);
            System.out.print(raiz.chave + " ");
        }
    }
}
