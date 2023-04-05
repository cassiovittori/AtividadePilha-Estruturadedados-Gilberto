public class Main {
    public static void main(String[] args) {
        // testando a pilha sobre vetor
        PilhaEmVetor pilhaVetor = new PilhaEmVetor(5);

        System.out.println("Pilha vazia? " + pilhaVetor.isEmpty());
        System.out.println("Tamanho da pilha: " + pilhaVetor.size());

        pilhaVetor.push(13);
        pilhaVetor.push(26);
        pilhaVetor.push(39);

        System.out.println("Pilha vazia? " + pilhaVetor.isEmpty());
        System.out.println("Tamanho da pilha: " + pilhaVetor.size());
        System.out.println("Topo da pilha: " + pilhaVetor.top());

        pilhaVetor.pop();
        System.out.println("Topo da pilha após pop: " + pilhaVetor.top());

        // testando a pilha sobre lista encadeada
        PilhaEmLista pilhaLista = new PilhaEmLista();

        System.out.println("Pilha vazia? " + pilhaLista.isEmpty());
        System.out.println();
    }