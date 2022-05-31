# Segunda tarefa do segundo bimestre

## Caio Pereira

```
Para realizar esse trabalho vocês deverão criar uma rede com roteamento estático contendo pelo menos 3 roteadores para realizar a comunicação de duas redes distintas. Além disso você
deverá informar como foi realizada a configuração nos roteadores. Lembro que você poderá utilizar a configuração realizada na APS para desenvolver seu trabalho.
É importante informar toda a configuração realizada para fazer com que os roteadores se comuniquem, para isso vocês podem realizar o print da tela como foi feito na APS. Além disso devera ser apresentado também print do ping para mostrar que a conexão está sendo bem sucedida. 
**ARQUIVOS APENAS COM A REDE MONTADA EM UM DOCUMENTO WORD SEM AS DEVIDAS EXPLICAÇÕES SERÃO DESCONSIDERADOS.**
O valor do trabalho é 3 pontos, e poderá ser entregue até o dia 26/11/2020 às 23:59
A CONFIGURAÇÃO CORRETA DE CADA ROTEADOR E A CONEXÃO BEM SUCEDIDA VALERÁ 1 PONTO. COMO SÃO 3 ROTEADORES, SERÃO 3 PONTOS NO TOTAL
```

-------------

Utilizando da mesma **Rede** da APS e da **Atividade Um**, configurarei o Roteamento **Estático**.

![image-20211121214932969](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211121214932969.png)

Desta forma, a configuração do mesmo **Roteador 1**, fica da seguinte maneira:

![image-20211121213846014](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211121213846014.png)

Onde informamos que a **Rede 10.2.2.32/27** pode ser encontrada no **Salto 11.0.0.2**, Endereço este do **Roteador 2**.

Ao replicar este mesmo passo, endereçando corretamente, obtemos as seguintes configurações

![image-20211121214732579](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211121214732579.png)

No campo **Network** informamos ao Roteador, qual a Rede que desejamos encontrar. Em **Mask** detalhamos a qual máscara esta rede pertence. E por último, em **NEXT HOP**, indicamos qual rota o ***Pacote*** deve prosseguir para encontrar a dita **Rede**.

----

## Comandos Ping de Confirmação

Dispositivo da **Rede 10.1.1.0/27** para dispositivos da **Rede 10.2.2.32/27** e **Rede 10.3.3.64/27**

![image-20211121220835214](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211121220835214.png)

Dispositivo da **Rede 10.2.2.32/27** para dispositivos da **Rede 10.1.1.0/27** e **Rede 10.3.3.64/27**

![image-20211121221059897](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211121221059897.png)

Dispositivo da **Rede 10.3.3.64/27** para dispositivos da Rede **10.1.1.0/27** e **Rede 10.2.2.32/27**W

![image-20211121221738717](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211121221738717.png)