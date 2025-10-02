# Sistema de Gerenciamento Hospitalar

Sistema orientado a objetos em Java para gerenciar pacientes em diferentes setores de um hospital, implementando estruturas de dados manualmente.

## Estruturas de Dados Implementadas

- **Pilha**: Usada no setor de Emergência (LIFO - Last In, First Out)
- **Fila**: Usada no setor de Consulta (FIFO - First In, First Out)  
- **Lista**: Usada no setor de Cirurgia (ordenada por prioridade)

## Setores do Hospital

1. **Emergência**: Utiliza pilha para atendimento imediato do último paciente adicionado
2. **Consulta**: Utiliza fila para atendimento por ordem de chegada
3. **Cirurgia**: Utiliza lista ordenada por prioridade dos pacientes

## Funcionalidades

- Cadastro de pacientes em diferentes setores
- Atendimento conforme estrutura de dados específica
- Histórico de pacientes atendidos
- Consulta ao último paciente atendido
- Exibição do estado atual das estruturas

## Conceitos de POO Aplicados

- **Interface**: `Setor` define contrato comum
- **Classe Abstrata**: `SetorBase` implementa funcionalidades comuns
- **Herança**: Setores específicos herdam de `SetorBase`
- **Polimorfismo**: Uso da interface `Setor` para tratar diferentes tipos
- **Encapsulamento**: Atributos privados com métodos públicos
```