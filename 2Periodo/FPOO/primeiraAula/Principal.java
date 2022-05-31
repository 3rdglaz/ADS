import java.util.Scanner;

public class Principal
{

    public static void main(String arg[]){
        Scanner le = new Scanner(System.in);
        String nome;
        //Aluno aluno1 = new Aluno("carlinhos", 10, 69420);
        Aluno aluno1 = new Aluno();
        System.out.print("Nome do Aluno: ");
        aluno1.setNome( le.next());
        System.out.print("Nota do Aluno: ");
        aluno1.setNota( le.nextInt());
                       
        Aluno aluno2 = new Aluno();
        System.out.print("Nome do Aluno: ");
        aluno2.setNome( le.next());
        System.out.print("Nota do Aluno: ");
        aluno2.setNota( le.nextInt());
        
        
        imprimeAprovado(aluno1);
     
        }
    public static void imprimeAprovado(Aluno a){
        if (a.Resultado()){
            System.out.println( a.exibeNome() + " Aprovado");
        }else{
            System.out.println( a.exibeNome() + " Reprovado");
        }
    }
    }
