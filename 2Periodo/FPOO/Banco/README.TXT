ercicio Banco

1 pessoa pode ter varias contas
que tem SAQUE E DEPOSITO
Cada conta pertence a 1 BANCO

BANCO
 -nome
 -gerente.Gerente
CONTA
 -numero
 -bacno
 -saldo
CLIENTE
 - nome
 - cpf
  -contas

GERENTE
 - nome

Programa:
Imprime Saldo de contas que o CLIENTE tem
Imprime nome do BANCO e GERENTE da CONTA


Menu do main
-pede nome Cliente
-pede nome Banco
#MENU#
1 - criar Conta
2 - realizar Deposito
3 - realizar Saque
4 - Listar Contas
5 - Saldo das Contas
6 - Conta com Maior Saldo
0 - Sair
-------
class Programa{
    public static void main (String [] args){

        int numero = 10;

        switch (numero){
            case 1:
                System.out.println("Dez");
                break;
            case 2:
                System.out.println("Numero muito grande");
                break;

        }

    }