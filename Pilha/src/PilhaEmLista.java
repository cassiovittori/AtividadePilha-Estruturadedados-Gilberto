public class PilhaEmLista {
    private Node topo;
    private int tamanho;

    public PilhaEmLista() {
        topo = null;
        tamanho = 0;
    }

    public void push(int valor) {
        Node novo = new Node(valor);
        novo.proximo = topo;
        topo = novo;
        tamanho++;
    }

    public int pop() {
        if (isEmpty()) {
        }
        int valor = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valor;
    }

    public int top() {
        if (isEmpty()) {
        }
        return topo.valor;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int size() {
        return tamanho;
    }

    private class Node {
        private int valor;
        private Node proximo;

        public Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
}