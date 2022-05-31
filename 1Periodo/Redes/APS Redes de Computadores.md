# APS Redes de Computadores

## Q1 

### Topologia Estrela

![image-20210915221602102](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20210915221602102.png)

Acredito que seja auto explicativa a essa altura, mas é isso, um ponto de acesso único para vários endpoints.

### DHCP

![image-20210915223317748](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20210915223317748.png)

Configuração do Serviço DHCP, mask 192.168.1.1/24 me dá o limite de 256 endereços possíveis,

um dedicado ao Broadcast outro dedicado ao proprio Servidor DHCP.

![image-20210915221813503](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20210915221813503.png)

Como ficou num dispositivo

### Estático

![image-20210915221906114](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20210915221906114.png)

Desde que a Máscara do IP estático respeite a Máscara da Rede, é possível a conexão entre dispositivos

## Q2

### Estático

![image-20210915224043796](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20210915224043796.png)

Ping sendo realizado numa máquina estática de IP 192.168.1.100/24. 

Não há muito o que ser simulado aqui, no quesito requisição de IP, já que respeita a Máscara de Rede.

### DHCP

![image-20210915222356250](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20210915222356250.png)

Requisição de DHCP sendo enviado ao Servidor, em seguida voltando no Dispostivo .3, observável na Camada 7 o pacote DHCP sendo processado pelo dispositivo que requisitou.

## Q3

![image-20210915222807890](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20210915222807890.png)

O ping inicialmente lançado(origem .12) a rede, encontra seu destinatário(.4).

## Q4

Topologia estrela é vastamente utilizada em residências, onde o Roteador assume também a função de Switch e se conecta a multiplos endpoints. Vantagem é o custo para manutenção, e desvantagem é a não redundância dessa rede local. Afinal, a conexão à Redes Centrais, se concentra no Roteador/Switch.

## Q5

Explicações e Prints acima. Explicação da Topologia na Questão 4 (Q4).

As vantagens do DHCP se mostram na única configuração de um dispostivo controlador de IPs, o servidor DHCP. Depois de tal configuração efetuada, apenas é necessária a escolha dos dispositivos finais pela requisição de IP via DHCP. Já que se considerarmos a distribuição manual em casos de grande escala, poderíamos contar com muito trabalho manual.

A desvantagem pode se mostrar, ouso dizer, em um controle não tão bem feito dos endereços MACs, separando assim, IPs já reconhecidos de suas máquinas especificas. Tornando a requisição necessária toda vez, um novo alocamento de endereço.



