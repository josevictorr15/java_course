
• É um tipo estruturado que pode conter (membros):
	• Atributos (dados / campos)
	• Métodos (funções / operações)

• A classe também pode prover muitos outros recursos, tais como:
	• Construtores
	• Sobrecarga
	• Encapsulamento
	• Herança
	• Polimorfismo

• Exemplos:
	• Entidades: Produto, Cliente, Triangulo
	• Serviços: ProdutoService, ClienteService, EmailService, StorageService
	• Controladores: ProdutoController, ClienteController
	• Utilitários: Calculadora, Compactador
	• Outros (views, repositórios, gerenciadores, etc.)


### Discussão

• Toda classe em Java é uma subclasse de classe Object

• Object possui os seguintes métodos:
	• getClass - retorna o tipo do objeto
	• equals - compara se o objeto é igual a outro
	• hashCode - retorna um código hash do objeto
	• toString - converte o objeto para string


### Membros estáticos

• Também chamados membros de classe
	• Em oposição a membros e instância

• São membros que fazem sentidos independentemente de objetos. Não precisam de objetos para serem chamados. São chamados a partir do próprio nome da classe.

• Aplicações comuns:
	• Classes utilitárias
	• Declaração de constantes

• Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.

