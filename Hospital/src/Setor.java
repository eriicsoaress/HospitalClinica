public interface Setor {
    void adicionarPaciente(Paciente paciente);
    Paciente atenderPaciente();
    void exibirEstado();
    String getNome();
    boolean temPacientes();
}

