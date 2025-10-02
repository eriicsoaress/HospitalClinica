public class SetorCirurgia extends SetorBase {
    private Lista listaPacientes;
    
    public SetorCirurgia(int capacidade) {
        super("Cirurgia", capacidade);
        this.listaPacientes = new Lista(capacidade);
    }
    
    @Override
    public void adicionarPaciente(Paciente paciente) {
        if (paciente.getPrioridade() < 5) {
            System.out.println("Paciente com prioridade baixa para cirurgia.");
            return;
        }
        listaPacientes.adicionarOrdenado(paciente);
        System.out.println("Paciente " + paciente.getNome() + " adicionado à lista de cirurgia.");
    }
    
    @Override
    public Paciente atenderPaciente() {
        if (listaPacientes.vazia()) {
            System.out.println("Não há pacientes para cirurgia.");
            return null;
        }
        
        Paciente paciente = listaPacientes.remover(0);
        if (paciente != null) {
            System.out.println("Atendendo paciente na cirurgia: " + paciente.getNome());
        }
        return paciente;
    }
    
    @Override
    public void exibirEstado() {
        System.out.println("=== Setor de Cirurgia ===");
        listaPacientes.exibir();
    }
    
    @Override
    public boolean temPacientes() {
        return !listaPacientes.vazia();
    }
}

