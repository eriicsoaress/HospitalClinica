public class App {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gerenciamento Hospitalar ===");
        
        SetorEmergencia emergencia = new SetorEmergencia(5);
        SetorConsulta consulta = new SetorConsulta(10);
        SetorCirurgia cirurgia = new SetorCirurgia(8);
        HistoricoPacientes historico = new HistoricoPacientes(20);
        
        System.out.println("\n1. Cadastrando pacientes nos setores:");
        
        Paciente paciente1 = new Paciente("João Silva", 45, "12345678901", "Dor no peito", 9);
        Paciente paciente2 = new Paciente("Maria Santos", 32, "98765432109", "Febre alta", 8);
        Paciente paciente3 = new Paciente("Pedro Costa", 28, "45678912345", "Dor de cabeça", 4);
        Paciente paciente4 = new Paciente("Ana Oliveira", 55, "78912345678", "Fratura no braço", 7);
        Paciente paciente5 = new Paciente("Carlos Lima", 67, "32165498701", "Dor abdominal", 6);
        Paciente paciente6 = new Paciente("Lucia Ferreira", 41, "65498732109", "Consulta de rotina", 3);
        
        emergencia.adicionarPaciente(paciente1);
        emergencia.adicionarPaciente(paciente2);
        consulta.adicionarPaciente(paciente3);
        consulta.adicionarPaciente(paciente6);
        cirurgia.adicionarPaciente(paciente4);
        cirurgia.adicionarPaciente(paciente5);
        
        System.out.println("\n2. Estado atual dos setores:");
        emergencia.exibirEstado();
        consulta.exibirEstado();
        cirurgia.exibirEstado();
        
        System.out.println("\n3. Atendendo pacientes:");
        Paciente atendido1 = emergencia.atenderPaciente();
        if (atendido1 != null) {
            historico.adicionarAoHistorico(atendido1);
        }
        
        Paciente atendido2 = consulta.atenderPaciente();
        if (atendido2 != null) {
            historico.adicionarAoHistorico(atendido2);
        }
        
        Paciente atendido3 = cirurgia.atenderPaciente();
        if (atendido3 != null) {
            historico.adicionarAoHistorico(atendido3);
        }
        
        System.out.println("\n4. Estado após atendimentos:");
        emergencia.exibirEstado();
        consulta.exibirEstado();
        cirurgia.exibirEstado();
        
        System.out.println("\n5. Consultando último paciente atendido:");
        Paciente ultimoAtendido = historico.getUltimoAtendido();
        if (ultimoAtendido != null) {
            System.out.println("Último paciente atendido: " + ultimoAtendido);
        } else {
            System.out.println("Nenhum paciente foi atendido ainda.");
        }
        
        System.out.println("\n6. Histórico completo de pacientes atendidos:");
        historico.exibirHistorico();
        
        System.out.println("\n7. Testando polimorfismo:");
        Setor[] setores = {emergencia, consulta, cirurgia};
        
        for (Setor setor : setores) {
            System.out.println("\nSetor: " + setor.getNome());
            System.out.println("Tem pacientes: " + setor.temPacientes());
            setor.exibirEstado();
        }
        
        System.out.println("\n=== Fim da simulação ===");
    }
}
