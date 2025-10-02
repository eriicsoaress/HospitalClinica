public class Paciente {
    private String nome;
    private int idade;
    private String cpf;
    private String sintomas;
    private int prioridade;
    
    public Paciente(String nome, int idade, String cpf, String sintomas, int prioridade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sintomas = sintomas;
        this.prioridade = prioridade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getSintomas() {
        return sintomas;
    }
    
    public int getPrioridade() {
        return prioridade;
    }
    
    @Override
    public String toString() {
        return "Paciente: " + nome + " (CPF: " + cpf + ", Idade: " + idade + ", Sintomas: " + sintomas + ", Prioridade: " + prioridade + ")";
    }
}

