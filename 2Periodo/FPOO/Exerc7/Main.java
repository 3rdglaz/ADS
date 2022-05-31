import java.util.Scanner;
public class Main
{
    static Scanner le = new Scanner(System.in);
    static Peixe peixe = new Peixe();
    public static void main(String [] args)
    {
        double multa=0;
        while(true){
            int menu = menu();
            
            if (menu==0)
                break;
            else if(menu==1){
                System.out.println("\t Insira o peso");
                multa+=peixe.calculaExcesso(le.nextDouble());
            }    
            else if(menu==2)
                    System.out.println("\tMulta até agora: R$"+multa);
            }
        }
    
    public static int menu(){
        System.out.println("\t################################\n\t##### Bem-Vindo ao PescApp #####\n\t################################");
        System.out.println("\t 1 - Pesar peixe");
        System.out.println("\t 2 - Quanto deu de multa até agora");
        System.out.println("\t 0 - SAIR!");
        return le.nextInt();
    }
}
