
• É uma operação especial da classe, que executa no momento da instanciação do objeto

• Usos comuns:
	• Iniciar valores dos atributos
	• Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)

• Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
```
	Product p = new Product();
```

• É possível especificar mais de um construtor na mesma classe (sobrecarga)