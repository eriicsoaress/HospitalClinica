public class HistoricoPacientes {
    private Paciente[] historico;
    private int tamanho;
    private int capacidade;
    private int indice;
    
    public HistoricoPacientes(int capacidade) {
        this.capacidade = capacidade;
        this.historico = new Paciente[capacidade];
        this.tamanho = 0;
        this.indice = 0;
    }
    
    public void adicionarAoHistorico(Paciente paciente) {
        if (tamanho < capacidade) {
            historico[tamanho] = paciente;
            tamanho++;
        } else {
            historico[indice] = paciente;
            indice = (indice + 1) % capacidade;
        }
    }
    
    public Paciente getUltimoAtendido() {
        if (tamanho == 0) {
            return null;
        }
        if (tamanho < capacidade) {
            return historico[tamanho - 1];
        } else {
            int ultimoIndice = (indice - 1 + capacidade) % capacidade;
            return historico[ultimoIndice];
        }
    }
    
    public void exibirHistorico() {
        if (tamanho == 0) {
            System.out.println("Nenhum paciente foi atendido ainda.");
            return;
        }
        
        System.out.println("Histórico de pacientes atendidos:");
        if (tamanho < capacidade) {
            for (int i = 0; i < tamanho; i++) {
                System.out.println("  " + historico[i]);
            }
        } else {
            for (int i = 0; i < capacidade; i++) {
                int indiceAtual = (indice + i) % capacidade;
                System.out.println("  " + historico[indiceAtual]);
            }
        }
    }
    
    public int getTotalAtendidos() {
        return tamanho;
    }
}

