public class Pilha {
    private Paciente[] elementos;
    private int topo;
    private int capacidade;
    
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Paciente[capacidade];
        this.topo = -1;
    }
    
    public boolean vazia() {
        return topo == -1;
    }
    
    public boolean cheia() {
        return topo == capacidade - 1;
    }
    
    public void empilhar(Paciente paciente) {
        if (cheia()) {
            System.out.println("Pilha cheia! Não é possível adicionar mais pacientes.");
            return;
        }
        topo++;
        elementos[topo] = paciente;
    }
    
    public Paciente desempilhar() {
        if (vazia()) {
            System.out.println("Pilha vazia! Não há pacientes para atender.");
            return null;
        }
        Paciente paciente = elementos[topo];
        elementos[topo] = null;
        topo--;
        return paciente;
    }
    
    public Paciente topo() {
        if (vazia()) {
            return null;
        }
        return elementos[topo];
    }
    
    public int tamanho() {
        return topo + 1;
    }
    
    public void exibir() {
        if (vazia()) {
            System.out.println("Pilha vazia.");
            return;
        }
        System.out.println("Pacientes na pilha (do topo para a base):");
        for (int i = topo; i >= 0; i--) {
            System.out.println("  " + elementos[i]);
        }
    }
}

