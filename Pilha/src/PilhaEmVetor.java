public class PilhaEmVetor {
    private int[] pilha;
    private int topo;

    public PilhaEmVetor(int tamanho) {
        pilha = new int[tamanho];
        topo = -1;
    }

    public void push(int valor) {
        if (isFull()) {

        }
        topo++;
        pilha[topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {

        }
        int valor = pilha[topo];
        topo--;
        return valor;
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return pilha[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == pilha.length - 1;
    }

    public int size() {
        return topo + 1;
    }
}