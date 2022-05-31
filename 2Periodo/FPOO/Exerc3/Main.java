import java.util.Scanner;
public class Main
{
    static Scanner le = new Scanner(System.in);
    static Carro carro = new Carro();
    
    public static void main(String [] args)
    {
        menu();
        
    }
    public static void menu()
    {
        System.out.println("Com AR?(S)im ou (N)ao ");
        carro.setAr(le.next().equalsIgnoreCase("S"));
        System.out.println("Cambio Automatico? (S)im ou (N)ao ");
        carro.setCambioAutomatico(le.next().equalsIgnoreCase("S"));
        System.out.println("Incluir Alarme? (S)im ou (N)ao");
        carro.setAlarme(le.next().equalsIgnoreCase("S"));
        System.out.println("Pintura customizada? (S)im ou (N)ao");
        carro.setPinturaEspecial(le.next().equalsIgnoreCase("S"));
        System.out.println("Teto Solar? (S)im ou (N)ao");
        carro.setTetoSolar(le.next().equalsIgnoreCase("S"));
        System.out.println("Kit Multimidia? (S)im ou (N)ao");
        carro.setMultimidia(le.next().equalsIgnoreCase("S"));
        System.out.println("Eh 1.0? (S)im ou (N)ao");
        carro.setUmPonto0(le.next().equalsIgnoreCase("S"));
        System.out.println("Importado? (S)im ou (N)ao");
        carro.setImportado(le.next().equalsIgnoreCase("S"));
        System.out.println("Total: "+carro.custoFinal());
        System.out.println(carro.contem());
    }
}
