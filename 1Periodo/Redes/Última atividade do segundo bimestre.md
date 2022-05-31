# Última atividade do segundo bimestre

## Caio Pereira

## 1. Sumarize as redes abaixo e calcule a nova máscara e a faixa de endereçamento

## a)

**O primeiro passo** requer que convertamos os Endereços IPs para Binário, desta forma, podemos avaliar qual será a máscara "resumida" de todas as redes contidas e sumarizadas.

É notável, que até o segundo octeto, os endereços são similares. Desta forma, aproveitamos a conversão para todos:

**172** convertido para binário requer que utilizemos a 8 casa do binário para obtermos o valor 128, se virarmos a 7 casa, passaremo de 172, portando a sétima casa fica como 0.

```
|128| 64 | 32 | 16 | 8 | 4 | 2 | 1 |
  1   0    0    0    0   0   0   0
10000000
```

Em seguida podemos Virar a 6 casa binária, para obtermos +32

```
|128| 64 | 32 | 16 | 8 | 4 | 2 | 1 |
  1   0    1    0    0   0   0   0
10100000
```

Pularemos a 5 casa, pois somar +16 ultrapassaria do desejado, e damos continuidade a 4 casa, para somarmos +8, e também a 3 casa, para somar +4. Totalizando 172.

```
|128| 64 | 32 | 16 | 8 | 4 | 2 | 1 |
  1   0    1    0    1   1   0   0
10101100
```

**O número 16**, se faz mais rápido, pois apenas 1 Digito Binário sana nossa necessidade. A 4 casa.

```
|128| 64 | 32 | 16 | 8 | 4 | 2 | 1 |
  0   0    0    1    0   0   0   0
00010000  
```

Agora vamos ao Terceiro Octeto, este que detem as variações de Rede.

Ao convertermos obteremos variações apenas a partir da 5ª Casa Binária do Terceiro Octeto, como pode ser visto abaixo.

```sh
172.16.X.0

10101100.00010000.00010 000.00000000

10101100.00010000.00010 000.00000000 = 172.16.8.0

10101100.00010000.00010 001.00000000 = 172.16.9.0

10101100.00010000.00010 010.00000000 = 172.16.10.0

10101100.00010000.00010 011.00000000 = 172.16.11.0

10101100.00010000.00010 100.00000000 = 172.16.12.0

10101100.00010000.00010 101.00000000 = 172.16.13.0

10101100.00010000.00010 110.00000000 = 172.16.14.0

10101100.00010000.00010 111.00000000 = 172.16.15.0
```

**O segundo passo**, pede que transformemos em 0 todos os binários  depois da **Divergência de Valores**. Este que está apontados com espaçamento acima

```sh
10101100.00010000.00010 000.00000000
```

De tal forma, ao contarmos as casas Binárias, obtemos 21. Funcionando assim como Máscara de Sumarização

8 bin + 8 bin + 5 bin = 21 binários ocupados para Rede Sumarizada.

172.16.8.0/21
255.255.248.0

Sendo assim, O endereçamento possível vai de **172.16.8.0** até **172.16.15.0**. 
Tendo 8 X 256 IPs disponíveis.

## B)

**Primeiro** Convertemos para binário:

**192.168.3.0/24**

```sh
11000000.10101000.00000 011.00000000
```

**192.168.4.0/24**

```sh
11000000.10101000.00000 100.00000000
```

**192.168.5.0/24**

```shell
11000000.10101000.00000 101.00000000
```

**Segundo** passo, separamos os Bits de Convergência, e avaliamos para montar a Máscara de Sumarização.

Neste caso, a Divergência começa também após a 5ª Casa. Nos dando 16 bits de Máscara.

Ao converter estes para 0, ficamos com a máscara /21

```sh
11000000.10101000.00000 000.00000000
192.168.0.0/21
```

