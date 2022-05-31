# APS 2º Bimestre

### Caio Pereira

passos necessários para criar os dois tipos de roteamento, tanto o estático quanto o dinâmico. 

Além disso  informe os ips que foram configurados nos roteadores e nos hosts. É importante detalhar todo o passo a  passo da melhor maneira possível. E por fim apresente uma tela do seu roteamento no cisco, utilizando o  comando ping para informar que o roteamento foi realizado com sucesso. É necessário explicar a resposta  da execução do comando ping. 

## Estático

1. Montar duas redes distintas
2. Configurar um roteador para cada
3. Criar uma **Rede** entre os *Roteadores*
4. Rotear a **Saída** do *Primeiro Roteador* para a **Rede** do *Segundo Roteador*

### 1.

A Montagem de redes é bem simples, foi configurada 2 computadores, conectados por um *switch* na mesma **rede** e máscara

![image-20211119155943186](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119155943186.png) *p.s.: esta é uma rede de exemplo*

- O Gateway de cada Computador é Configurado com o IP do Roteador

![image-20211119161312863](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119161312863.png)

- Os dispositivos estão na mesma rede, setados pela Máscara /27

- O ping nesta rede pode ser comprovado a seguir:

  ![image-20211119160301543](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119160301543.png)

### 2. 

Como mostrado acima, o roteador já foi configurado.

### 3.

Em seguida configuramos uma **Rede** entre os *Roteadores*:

*Note que agora já são outros roteadores, porém de configuração semelhante*

![image-20211119160454319](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119160454319.png)

*a elipse alaranjada determina a rede entre roteadores de **Endereço 10.0.0.0/24*** 

![image-20211119160631803](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119160631803.png)

*configuração dos Roteadores **1** e **3***

### 4.

A Configuração do Roteamento estático pode ser conferida abaixo, nela apontei **O Roteador 3** com o **Endereço 10.0.0.3** para a **Rede 10.3.3.64**, no **Roteador 1**:

![image-20211119160932449](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119160932449.png)

Desta Forma o PING pode ser comprovado a seguir:

![image-20211119161610163](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119161610163.png)

Segue abaixo, a topologia de toda as Redes:

![image-20211119161642273](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119161642273.png)

## Dinâmico

Pouco muda na configuração de um roteamento dinâmico.

No **Roteador 1** configuramos o Roteamento RIP de maneira que fique assim

![image-20211119161841874](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119161841874.png)

Após adicionar o RIP Routing, o Host não encontrava o Endereço requisitado, atualizado o Router RIP para versão 2 este passou a funcionar devidamente

![image-20211119162425519](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119162425519.png)

É observável a tentativa e erro, antes e depois da configuração para versão 2

![image-20211119162541759](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119162541759.png)

## O Roteamento

Através da observação do Pacote Ping em modo **simulação** é perceptível que o ICMP é enviado para o **Gateway** este que em seguida encaminha para a Porta correta(do outro Roteador), ao ler o cabeçalho do Pacote.



![image-20211119162908797](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119162908797.png)![image-20211119162952137](C:\Users\4th\AppData\Roaming\Typora\typora-user-images\image-20211119162952137.png)

