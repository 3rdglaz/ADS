public class Main
{

    private int x;

    public static void main(String args[]){
        Funcionario f = new Professor();// e possivel estanciar
        // permite dessa maneira\/ formalizar que F = new Professor;
        System.out.println( ((Professor) f ).salario() );
    }


    public int sampleMethod(int y)
    {
        // escreva seu código aqui
        return x + y;
    }
}
