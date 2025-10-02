public class SetorEmergencia extends SetorBase {
    private Pilha pilhaPacientes;
    
    public SetorEmergencia(int capacidade) {
        super("Emergência", capacidade);
        this.pilhaPacientes = new Pilha(capacidade);
    }
    
    @Override
    public void adicionarPaciente(Paciente paciente) {
        if (paciente.getPrioridade() < 8) {
            System.out.println("Paciente com prioridade baixa não pode ser atendido na emergência.");
            return;
        }
        pilhaPacientes.empilhar(paciente);
        System.out.println("Paciente " + paciente.getNome() + " adicionado à emergência.");
    }
    
    @Override
    public Paciente atenderPaciente() {
        Paciente paciente = pilhaPacientes.desempilhar();
        if (paciente != null) {
            System.out.println("Atendendo paciente na emergência: " + paciente.getNome());
        }
        return paciente;
    }
    
    @Override
    public void exibirEstado() {
        System.out.println("=== Setor de Emergência ===");
        pilhaPacientes.exibir();
    }
    
    @Override
    public boolean temPacientes() {
        return !pilhaPacientes.vazia();
    }
}

