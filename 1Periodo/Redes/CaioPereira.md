Última lista do Primeiro Bimestre

obs.: Realizei as conversões em binário utilizando desta tabela como consulta

|  0   |  0   |  0   |  0   |  0   |  0   |  0   |  0   |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: | :--: |
| 128  |  64  |  32  |  16  |  8   |  4   |  2   |  1   |

### 1)

Dividindo 256 por 8, obtemos uma subrede com 32 ips disponíveis.

Ao converter 32 para binário temos: 0010 0000, 

ao assumir que em um octeto devemos reservar 32 ips, podemos concluir que a máscara desta subrede tomaria emprestado 3 Bin. 

|  1   |  1   |  1   | 0    |  0   |  0   |  0   |  0   |
| :--: | :--: | :--: | ---- | :--: | :--: | :--: | :--: |
| 128  |  64  |  32  | 16   |  8   |  4   |  2   |  1   |

E ao chavear de bin para int, obteremos 11100000, ou seja, 224.

Portanto, **RESPOSTA C** :

```
255.255.255.224
```

### 2)

Assumindo a CIDR /27, podemos concluir que a máscara desta subrede toma 27 bits emprestados, sendo 24 destes, pertencente ao 3 primeiros Octetos, e outros 3 do último Octeto.

```
11111111.111111111.11111111.11100000
```

Desta maneira esta Máscara repete a mesma organização do exercício anterior. 

````
255.255.255.224
````

O que nos permite utilizar 32 IPs por subrede. Assim, tomando 32 IPs por subrede:

| x.x.x.0             | x.x.x.31            |
| ------------------- | ------------------- |
| x.x.x.32            | x.x.x.65            |
| x.x.x.64            | ...                 |
| x.x.x.96            | ...                 |
| x.x.x.128           | ...                 |
| **203.197.168.160** | **203.197.168.191** |
| x.x.x.192           | ...                 |

**RESPOSTA C**

### 3)

Ao tomar 6 bits emprestados do último OCTETO

|  1   |  1   |  1   | 1    |  1   |  1   |  0   |  0   |
| :--: | :--: | :--: | ---- | :--: | :--: | :--: | :--: |
| 128  |  64  |  32  | 16   |  8   |  4   |  2   |  1   |

Obtemos a máscara de subrede: 
255.255.255.252

ou /30 em CIDR.

**RESPOSTA A**

### 4)

Ao olhar para as possíveis respostas, percebemos que todas alternativas se referem a um número de IPS disponíveis por SubRede, enquanto a **LETRA C**, se refere a um número de **Hosts** disponíveis por subrede.(Subtraindo do número de IPS o Endereço da Rede e o Endereço Broadcast) 

E ao converter o Octeto 192, para binário, vemos que o número Disponíveis de IP corresponde a 64.

**RESPOSTA C**

### 5)

Numa subrede 182.44.82.16/27, como pode ser observada no **Exercício 1 e 2**, detem a máscara

255.255.255.224, 

E apesar dos endereços de IP se conterem em uma mesma Subrede, apenas **182.44.82.158** é *HOST*, e **182.44.82.159** o endereço de *Broadcast*. Todavia, estes não participam do Endeço de IP apresentado no Enunciado, já que **182.44.82.16/27**, pertence a primeira subrede, e **182.44.82.158**, a sexta subrede.

### 6)

Converter 192 para binário obtemos:

|  1   |  1   |  0   |  0   |  0   |  0   |  0   |  0   |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: | :--: |
| 128  |  64  |  32  |  16  |  8   |  4   |  2   |  1   |

Assim, pegando 2 bits emprestado do Terceiro Octeto. Somados ao 16 bits do Primeiro e Segundo Octeto, temos a notação 207.193.201.0**/18**.