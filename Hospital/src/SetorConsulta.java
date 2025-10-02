public class SetorConsulta extends SetorBase {
    private Fila filaPacientes;
    
    public SetorConsulta(int capacidade) {
        super("Consulta", capacidade);
        this.filaPacientes = new Fila(capacidade);
    }
    
    @Override
    public void adicionarPaciente(Paciente paciente) {
        if (paciente.getPrioridade() < 3) {
            System.out.println("Paciente com prioridade muito baixa para consulta.");
            return;
        }
        filaPacientes.enfileirar(paciente);
        System.out.println("Paciente " + paciente.getNome() + " adicionado à fila de consulta.");
    }
    
    @Override
    public Paciente atenderPaciente() {
        Paciente paciente = filaPacientes.desenfileirar();
        if (paciente != null) {
            System.out.println("Atendendo paciente na consulta: " + paciente.getNome());
        }
        return paciente;
    }
    
    @Override
    public void exibirEstado() {
        System.out.println("=== Setor de Consulta ===");
        filaPacientes.exibir();
    }
    
    @Override
    public boolean temPacientes() {
        return !filaPacientes.vazia();
    }
}

