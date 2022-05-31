import java.util.Scanner;
public class Main
{
    static Scanner le = new Scanner(System.in);
    static Empregado empregado = new Empregado();
    
    public static void main(String [] args)
    {
        System.out.println("Nome do Empregado: ");
        Empregado empregado = new Empregado (le.nextLine());
        System.out.println("Idade: ");
        empregado.setIdade(le.nextInt());
        System.out.println("Anos de Trabalho: ");
        empregado.setAnosDeTrabalho(le.nextInt());
        System.out.println("Calculando a possibilidade de aposentadoria ... ");
        if(empregado.seraSeAposenta(empregado))
            System.out.println(empregado.getNome()+" pode aposentar!");
        else
            System.out.println(empregado.getNome()+" NÃO pode aposentar!");
    }
}
