
import java.util.Scanner;
public class main
{   
    static Scanner le = new Scanner(System.in);
    static Cliente cliente = new Cliente();
    static Banco banco = new Banco();
    public static void main(String [] args)
    {
        System.out.println("Nome do Cliente: ");
        Cliente cli = new Cliente( le.nextLine());
        System.out.println("Nome do Banco: ");
        Banco bco = new Banco(le.nextLine());
        System.out.println("Nome do Gerente: ");
        // faz a mesma coisa que de cima
        bco.setGerente(le.nextLine());
        while(true){
            int menu = menu();
            if (menu == 0)
                break;
            else if (menu ==1)
                //cli.addConta( novaConta(cli,bco));
                novaConta(cli,bco);
            else if (menu == 2)
                sacar ( cli);
            //else if (menu == 3)
                            
            else if (menu == 4)
                listarContas(cli);
            else if ( menu == 5)
                imprimeSaldoContas(cli);
            //System.out.println("# 5 - saldo geral: ");
            //System.out.println("# 6 - maior saldo: ");
            //System.out.println("# 0 - METER O Pe!!! ");
            }
        //System.out.println("Nome do Gerente: ");
        
    }
    public static void sacar (Cliente cliente){
        System.out.println("informe a conta: ");
        listarContas( cliente );
        int escolhaConta = le.nextInt();
        System.out.println("Informe o valor do saque: ");
        Conta contaEscolhida = cliente.getContas().get(escolhaConta -1);
        cliente.getContas().get(escolhaConta-1).saque(le.nextDouble());
    }
    public static void listarContas(Cliente cliente){
        int contador = 1;
        // esse for nao funciona
        for(Conta c : cliente.getContas() )
        {
            System.out.println("## "+ (contador++) +") "+c.getNumero());
        }
    }
    public static Conta novaConta(Cliente cliente, Banco banco){
        System.out.println("numero conta: ");
        Conta c = new Conta(le.nextInt());
        c.setBanco( banco );
        c.setCliente( cliente );
        banco.addConta(c);
        return c;
    }
    public static void imprimeMaiorConta(Banco banco){
        Conta maiorConta = banco.contaMaiorSaldo();

        System.out.println("Maior conta: " + maiorConta.getNumero() + "R$" + maiorConta.getSaldo() );
    }
    public static void imprimeSaldoContas(Cliente cliente){
        System.out.println("Saldo total: " + cliente.saldoConta() );
    }
    public static void depositar(Cliente cliente){
        System.out.println("Informa a conta: ");
        int conta = le.nextInt();
        Conta contaSelecionada = getContaPeloNumero( le.nextInt());
        
        if(contaSelecionada == null ){
            System.out.println("Conta nao existe...");
            
        }else{
            System.out.println("informe o valor do deposito: ");
            contaSelecionada.deposito ( le.nextDouble());
        }
        }
    public static Conta getContaPeloNumero(int procuraConta){
        for(Conta c : cliente.getContas() ){
            if (c.getNumero() == procuraConta){
                return c;
            }
        }
        return null;
    }
    public static int menu(){
        System.out.println("\t#####\tMENU\t#####");
        System.out.println("# 1 - nova conta: ");
        System.out.println("# 2 - realizar deposito: ");
        System.out.println("# 3 - realizar saque: ");
        System.out.println("# 4 - listar contas: ");
        System.out.println("# 5 - saldo geral: ");
        System.out.println("# 6 - maior saldo: ");
        System.out.println("# 0 - METER O Pe!!! ");
        return le.nextInt();
        
    }
}