public class Lista {
    private Paciente[] elementos;
    private int tamanho;
    private int capacidade;
    
    public Lista(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Paciente[capacidade];
        this.tamanho = 0;
    }
    
    public boolean vazia() {
        return tamanho == 0;
    }
    
    public boolean cheia() {
        return tamanho == capacidade;
    }
    
    public void adicionar(Paciente paciente) {
        if (cheia()) {
            System.out.println("Lista cheia! Não é possível adicionar mais pacientes.");
            return;
        }
        elementos[tamanho] = paciente;
        tamanho++;
    }
    
    public void adicionarOrdenado(Paciente paciente) {
        if (cheia()) {
            System.out.println("Lista cheia! Não é possível adicionar mais pacientes.");
            return;
        }
        
        int posicao = 0;
        while (posicao < tamanho && elementos[posicao].getPrioridade() >= paciente.getPrioridade()) {
            posicao++;
        }
        
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }
        
        elementos[posicao] = paciente;
        tamanho++;
    }
    
    public Paciente remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice inválido!");
            return null;
        }
        
        Paciente paciente = elementos[indice];
        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        return paciente;
    }
    
    public Paciente buscar(String cpf) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].getCpf().equals(cpf)) {
                return elementos[i];
            }
        }
        return null;
    }
    
    public Paciente get(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return null;
        }
        return elementos[indice];
    }
    
    public int tamanho() {
        return tamanho;
    }
    
    public void exibir() {
        if (vazia()) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.println("Pacientes na lista:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("  " + elementos[i]);
        }
    }
}

