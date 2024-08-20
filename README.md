# JAVA-LOGICA-UDESC
Exercícios propostos nas aulas de introdução ao desenvolvimento de software e testes em java 

# Disciplina: Introdução ao Desenvolvimento de Software e Testes
## Assunto: Estruturas Condicionais

### Lista 1

1. **Escreva um programa que leia um número e informe se ele é divisível por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.**

2. **Construa um programa para determinar se o indivíduo está com um peso favorável.**  
   Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definido como a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo. Ou seja, a situação do peso é determinada pela fórmula:  
   \[
   \text{IMC} = \frac{\text{peso}}{\text{altura}^2}
   \]
   A tabela de referência de pesos é dada conforme segue:

   - **IMC abaixo de 18,5**: Abaixo do peso
   - **IMC entre 18,5 e 24,9**: Peso normal
   - **IMC entre 25 e 29,9**: Sobrepeso
   - **IMC entre 30 e 34,9**: Obesidade grau I
   - **IMC entre 35 e 39,9**: Obesidade grau II
   - **IMC acima de 40**: Obesidade grau III

3. **A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com o saldo médio no último ano.**  
   Fazer um programa que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma mensagem informando o saldo médio e o valor de crédito.

   - **Saldo médio até R$ 200,00**: Nenhum crédito.
   - **Saldo médio entre R$ 201,00 e R$ 400,00**: Crédito de 20% do valor do saldo médio.
   - **Saldo médio entre R$ 401,00 e R$ 600,00**: Crédito de 30% do valor do saldo médio.
   - **Saldo médio acima de R$ 601,00**: Crédito de 40% do valor do saldo médio.

4. **Crie um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:**
   - **não eleitor**: abaixo de 16 anos.
   - **eleitor obrigatório**: entre a faixa de 18 até 65 anos.
   - **eleitor facultativo**: de 16 até 17 anos e maior de 65 anos, inclusive.

5. **Criar um programa que informe a quantidade total de calorias de uma refeição a partir do usuário que deverá informar o prato, a sobremesa e a bebida.**  
   Veja a tabela a seguir:

   | Prato       | Calorias |
   |-------------|----------|
   | Vegetariano | 180 cal  |
   | Peixe       | 230 cal  |
   | Frango      | 250 cal  |
   | Carne       | 350 cal  |

   | Sobremesa        | Calorias |
   |------------------|----------|
   | Abacaxi          | 75 cal   |
   | Sorvete diet     | 110 cal  |
   | Mouse diet       | 170 cal  |
   | Mouse chocolate  | 200 cal  |

   | Bebida           | Calorias |
   |------------------|----------|
   | Chá              | 20 cal   |
   | Suco de laranja  | 70 cal   |
   | Suco de melão    | 100 cal  |
   | Refrigerante diet| 65 cal   |

   **Sugestão**: enumere cada opção de prato, sobremesa e bebida.

6. **Criar um programa que leia um número inteiro entre 1 e 7 e escreva o dia da semana correspondente.**  
   Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.

7. **Construa um programa que determine (imprima) se um dado número N inteiro (lido através do teclado) é par ou ímpar.**

8. **Faça um programa que leia quatro valores referentes a quatro notas escolares de um aluno e imprima uma mensagem dizendo que o aluno foi aprovado, caso o valor da média escolar seja maior ou igual a 7.0.**  
   Se o valor da média for menor que 7.0, solicitar a nota de exame, somar com o valor da média e dividir por 2 para obter nova média.  
   - Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado com exame.  
   - Se o aluno não foi aprovado, indicar uma mensagem informando esta condição.  
   - Apresentar junto com as mensagens o valor da média do aluno, para qualquer condição.

9. **Escreva um programa para ler cinco valores inteiros, calcular a sua média, e escrever na tela os números que são superiores à média calculada.**

10. **Toda vez que um pescador traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de Santa Catarina (500 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.**  
    Faça um programa que leia o peso dos peixes trazidos por um pescador e verifique se há excesso.  
    - Se houver, calcule e mostre o excesso e o valor da multa que deverá ser pago.  
    - Caso contrário, mostre uma mensagem que ele não há multa por excedente de peso.
