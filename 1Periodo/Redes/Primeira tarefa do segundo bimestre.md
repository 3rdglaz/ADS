# Primeira tarefa do segundo bimestre

## Caio Pereira

```
Para realizar esse trabalho vocês deverão criar uma rede com roteamento dinâmico contendo pelo menos 3 roteadores para realizar a comunicação de duas redes distintas. Além disso você
deverá informar como foi realizada a configuração nos roteadores. Lembro que você poderá utilizar a configuração realizada na APS para desenvolver seu trabalho.
É importante informar toda a configuração realizada para fazer com que os roteadores se comuniquem, para isso vocês podem realizar o print da tela como foi feito na APS. Além disso devera ser apresentado também print do ping para mostrar que a conexão está sendo bem sucedida. 
**ARQUIVOS APENAS COM A REDE MONTADA EM UM DOCUMENTO WORD SEM AS DEVIDAS EXPLICAÇÕES SERÃO DESCONSIDERADOS.**
O valor do trabalho é 3 pontos, e poderá ser entregue até o dia 26/11/2020 às 23:59
A CONFIGURAÇÃO CORRETA DE CADA ROTEADOR E A CONEXÃO BEM SUCEDIDA VALERÁ 1 PONTO. COMO SÃO 3 ROTEADORES, SERÃO 3 PONTOS NO TOTAL.
```

--------------------

Dando continuidade utilizando a APS como base, basta **Adicionar** mais uma rede para atender os requisitos do Exercício.

Totalizando **3 Redes Distintas**, com **Roteamento Dinâmicos**. Visão final do Exercício:
![image-20211120202213742](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211120202213742.png)

A **esquerda** e a **direita** temos as duas redes que foram utilizadas na APS e demonstrada as configurações.

Na **parte inferior** observamos a nova rede com **Endereço de Rede** **10.2.2.32/27**.

-------

### Configuração do Roteamento Dinâmico

Estas Redes comunicam entre si através do **Protocolo de Roteamento Dinâmico** ***RIP***

![image-20211120204954164](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211120204954164.png)

Basta adicionar o endereço das redes entre os Roteadores. Estas são observáveis na **PRIMEIRA IMAGEM**.

#### Redes Dos Roteadores

Entre **1** e **2** - Temos a rede **11.0.0.0/24**

Entre **2** e **3** - Temos a rede **12.0.0.0/24**

Entre **3** e **1** - Temos a rede **13.0.0.0/24**

Desta maneira, precisávamos inserir o Endereço das **Redes dos Roteadores**(pode ser visto acima), no RIP. Permitindo assim a conversação entre os dispositivos de distintas redes. Como pode ser visto abaixo:

### Rede 1 para Rede 2(10.2.2.33/27) e Rede 3(10.3.3.65/27)

![image-20211120210943190](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211120210943190.png)

### Rede 2 para Rede 3(10.3.3.65) e Rede (10.1.1.1)

![image-20211120211547182](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211120211547182.png)

## Rede 3 para Rede 2 (10.2.2.62) Rede 1 (10.1.1.1)

![image-20211120211737682](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211120211737682.png)