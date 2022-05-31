import java.util.Scanner;
public class Main
{
    static Scanner le = new Scanner(System.in);
    static Salario salario = new Salario();
    
    public static void main(String [] args)
    {
        System.out.println("Nome do Assalariado: ");
        Salario salario = new Salario(le.nextLine());
        System.out.println("Horas Trabalhadas: ");
        salario.setHorasTrabalhadas(le.nextInt());
        System.out.println("Salario-Hora: ");
        salario.setSalarioHora(le.nextDouble());
        System.out.println("Nùmero de dependentes: ");
        salario.setDependentes(le.nextInt());
        System.out.println("Salário líquido: "+salario.salarioLiquido());
        
    
        
    }
}
