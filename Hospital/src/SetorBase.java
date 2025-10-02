public abstract class SetorBase implements Setor {
    protected String nome;
    protected int capacidade;
    
    public SetorBase(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    protected boolean verificarCapacidade() {
        return true;
    }
}

