## Atividade 4 - Faculdade Facimp Wyden
Este repositório contém a implementação da Atividade 4, desenvolvida para a Faculdade Facimp Wyden. O projeto tem como objetivo aplicar os conceitos de herança em Java, através da criação de uma hierarquia de classes que representam diferentes tipos de veículos de transporte.

## Descrição
O sistema foi modelado utilizando uma classe base e subclasses que herdam e sobrescrevem métodos para demonstrar o polimorfismo e a reutilização de código. As classes implementadas são:
<ul>
<li>Veiculo: Classe base que contém os atributos comuns (modelo e ano) e o método mover(), que pode ser sobrescrito.</li>
<li>Carro: Subclasse que adiciona o atributo numPortas e implementa sua versão do método mover().</li>
<li>Bicicleta: Subclasse que define o atributo tipo (por exemplo, "urbana", "mountain bike", etc.) e sobrescreve o método mover().</li>
<li>Caminhao: Subclasse que incorpora o atributo capacidadeCarga e fornece uma implementação específica do método mover().</li>
</ul>
