• É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.

• Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

Analogia: aparelho de som (rádio)
- Um aparelho de som tem diversos circuitos internamente, várias operações acontecendo dentro dele, porém o usuário do aparelho não pode acessar diretamente os circuitos podendo ocorrer erros, então o aparelho esconde todos os detalhes de circuitos e vai disponibilizar pro usuário somente operações que não vão corromper a integridade do aparelho.


### Regra geral básica

• Um objeto ==NÃO== deve expor nenhum atributo (modificador de acesso **private**)

• Os atributos devem ser acessados por meio de métodos get e set (padrão JavaBeans)

Padrão para implementação de getters e setters

`private String name;`
`private double price;`

`public String getName() {`
	`return name;`
`}`

`public void setName(String name) {`
	`this.name = name;`
`}`

`public String getPrice() {`
	`return price;`
`}`

`public void setPrice(double price) {`
	`this.price = price;`
`}`
