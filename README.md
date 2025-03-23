# poo-fundamentals
Repositório para trabalhar os fundamentos básicos de POO (Programação Orientada a Objetos).

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada no projeto.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.

## Estrutura do Projeto
O projeto está organizado em pacotes e classes que demonstram conceitos fundamentais de POO, como encapsulamento, herança, polimorfismo e sobrecarga de métodos.

### Pacotes e Classes

#### `org.fundamentals`
- **SistemaRh**: Classe principal que demonstra o uso de encapsulamento e herança com as classes `Funcionario` e `Gerente`.
- **SistemaFinanceiro**: Classe principal que demonstra o cálculo de lucro mensal através da classe `RelatorioFinanceiro`.
- **RelatorioFinanceiro**: Classe que contém o método `calcularLucroMensal` para calcular o lucro mensal.

#### `org.fundamentals.entities`
- **Funcionario**: Classe que representa um funcionário com um salário. Utiliza encapsulamento para proteger o atributo `salario`.
- **Gerente**: Classe que herda de `Funcionario` e adiciona funcionalidades específicas para um gerente, como a avaliação de equipe.

## Conceitos de POO Demonstrados

### Construtor
- Operação especial da classe que executa no momento da instanciação do objeto.
- Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão.
- É possível especificar mais de um construtor na mesma classe (sobrecarga).

### Sobrecarga
- Recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.

### Encapsulamento
- Princípio que consiste em proteger os dados de um objeto e permitir que eles sejam acessados ou modificados apenas de maneiras controladas.
- Exemplo: uma conta bancária que protege o saldo, não permitindo definir um valor negativo diretamente, sendo necessário passar pelo método `depositar()` ou `sacar()` para assim modificar o saldo.

#### Modificadores de Acesso
- **private**: O membro pode ser acessado apenas dentro da classe.
- **public**: Pode ser acessado por qualquer classe.
- **protected**: O membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes.
- **default**: O membro pode ser acessado por classes do mesmo pacote.

### Herança e Polimorfismo
- Demonstrado através das classes `Funcionario` e `Gerente`, onde `Gerente` herda de `Funcionario` e adiciona funcionalidades específicas.

## Executando o Projeto
Para executar o projeto, utilize uma IDE como IntelliJ IDEA e execute as classes principais `SistemaRh` e `SistemaFinanceiro`.

## Autor
- renansistemas