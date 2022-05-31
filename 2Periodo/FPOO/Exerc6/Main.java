import java.util.Scanner;

public class Main
{
    
    public static void main(String [] args){
        Scanner le = new Scanner (System.in);
        Pesquisa pesq = new Pesquisa();
        
        while(true){
            //cadastra entrevistado
            System.out.println(" ## Novo entrevistado ## ");
            pesq.addEntrevistado( cadastroEntrevistado() );
            // cadastrar outro?
            System.out.println("Deseja sair? (S) | (N)");
            if(le.next().equalsIgnoreCase("s") ){
                break;
            }
            
            
        }
    }
    public static Habitante cadastroEntrevistado(){
        return null;
        Scanner le = new Scanner (System.in);
        Habitante h = new Habitante();
        System.out.println("Informe Sexo: (M) ou (F) ");
        h.setSexo(le.next().equals("M")? ESexo.M : ESexo.F) ;
    }
}