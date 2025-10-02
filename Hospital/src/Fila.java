public class Fila {
    private Paciente[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;
    
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Paciente[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }
    
    public boolean vazia() {
        return tamanho == 0;
    }
    
    public boolean cheia() {
        return tamanho == capacidade;
    }
    
    public void enfileirar(Paciente paciente) {
        if (cheia()) {
            System.out.println("Fila cheia! Não é possível adicionar mais pacientes.");
            return;
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = paciente;
        tamanho++;
    }
    
    public Paciente desenfileirar() {
        if (vazia()) {
            System.out.println("Fila vazia! Não há pacientes para atender.");
            return null;
        }
        Paciente paciente = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return paciente;
    }
    
    public Paciente primeiro() {
        if (vazia()) {
            return null;
        }
        return elementos[inicio];
    }
    
    public int tamanho() {
        return tamanho;
    }
    
    public void exibir() {
        if (vazia()) {
            System.out.println("Fila vazia.");
            return;
        }
        System.out.println("Pacientes na fila (do primeiro para o último):");
        int contador = 0;
        int indice = inicio;
        while (contador < tamanho) {
            System.out.println("  " + elementos[indice]);
            indice = (indice + 1) % capacidade;
            contador++;
        }
    }
}

