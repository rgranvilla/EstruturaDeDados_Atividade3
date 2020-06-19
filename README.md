# EstruturaDeDados_Atividade3
Atividade 3 do curso de Estrutura de Dados Fadergs.

Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
 
Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
Passo 5: Repita os passos 2 e 3. 
Passo 6: Exiba todos os números que foram inseridos na fila. 
 
Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 

ANALISE:

Resultado da execução do programa desenvolvido.
Fila: [ 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 ]

No primeiro passo, criamos uma lista com 5 células, estas apresentaram o seguinte resultado:
Lista: [ 1, 2, 3, 4, 5 ]

No segundo passo, iremos remover os dados da lista para que sejam inseridos em uma Pilha, removendo sempre o número que consta na primeira célula. Desta forma, foi desenvolvido um método em Lista.java, que retorna o valor da célula inicial e reorganiza a lista retirando o primeiro valor e diminuindo o tamanho dela. Por sua vez em Pilha.java foi criado um método que faz a inserção do valor que foi retornado da Lista e o adiciona na pilha, fazendo com que a mesma aumente o seu tamanho. Este passo apresentou o seguinte resultado:
Lista: null
Pilha: [ 1, 2, 3, 4, 5 ]

No terceiro passo, utilizando-se o conceito de pilha, onde o último a entrar é o primeiro a sair, foi criado um método que retorna o último valor da pilha, e o mesmo foi adicionado à fila, através de um método que pega o valor retornado da pilha e o inclui na fila. Este passo apresentou o seguinte resultado:
Pilha: null
Fila: [ 5, 4, 3, 2, 1 ]

Vale ressaltar que no conceito de fila, entende-se que o primeiro que entra é o primeiro que sai.

O passo 4, nos pediu para criar uma nova lista contendo valores diferentes do passo 1, porém com o mesmo número de células. O resultado gerado neste passo foi o seguinte:
Lista: [ 6, 7, 8, 9, 10 ]

No passo 5, executou novamente os comandos do passo 2 e 3. E os resultados gerados foram:
(Passo 2)
Lista: null
Pilha: [ 6, 7, 8, 9, 10 ]

(Passo 3)
Lista: null
Pilha: null
Fila: [ 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 ]

Finalmente, no passo 6, podemos ver que os números seguiram a ordem de formação da fila, que fez uso dos valores de uma pilha para a sua formação. Assim, na primeira metado do ciclo de geração da fila, vemos que os valores foram colocados na ordem [5,4,3,2,1], onde o primeiro índice recebeu o valor do último índice da pilha, e assim sucessivamente. Após realizar a segunda metade do ciclo de criação da fila, vemos que os números contidos na pilha, novamente pegando-se o último valor para que seja incluido na fila, temos o resultado da lista com 10 células a seguir:
Fila: [ 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 ]




