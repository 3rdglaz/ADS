import java.util.Scanner;
public class PrincipalEmpresa
{
    static Scanner le = new Scanner(System.in);
    static Empresa empresa = new Empresa();
    public static void main(String[] args) 
    {
        //Empresa empresa = new Empresa();
        System.out.println("Informe o nome da empresa: ");
        empresa.setNome(le.nextLine());
        empresa.addFuncionario(new Funcionario("zezin",5000,2, true,true,false,0));
        while (true){
        //menu();
            int menu = menu();
            if (menu ==4)
                break;
            else if(menu ==2){
                calculaSalario(empresa);
            }
            else if(menu ==1){
                cadastroFuncionario();
            }
            else if (menu ==3){
                listarFuncionarios(empresa);
            }
        
        
        
        }
        System.out.println("Ate !!!");
    }
    public static void listarFuncionarios(Empresa empresa){
        System.out.println("\tFuncionario: ")    ;
        for ( int i = 0; i< empresa.getFuncionarios().size(); i++){
             System.out.println(empresa.getFuncionarios().get(i).getNome());
            }
        for(Funcionario f : empresa.getFuncionarios()){
            System.out.println(f.getNome());
        }
    }
    public static void cadastroFuncionario(){    
        Funcionario func = new Funcionario();
        System.out.print("Nome: ");
        func.setNome(le.next());
        System.out.print("Salario Bruto: ");
        func.setSalarioBruto(le.nextDouble());
        System.out.print("Filhos: ");
        func.setFilhos(le.nextInt());
        System.out.print("Noturno? (S)im ou (N)ao: ");
        func.setNoturno(le.next().equalsIgnoreCase("S"));
        System.out.print("Vale Transporte? (S)im ou (N)ao: ");
        func.setValeTransporte(le.next().equalsIgnoreCase("S"));
        System.out.print("Vendedor: (S)im ou (N)ao: ");
        func.setVendedor(le.next().equalsIgnoreCase("S"));
        if(func.getVendedor()){
            System.out.print("Total lucro de vendasBruto: ");
            func.settotalLucroVendas(le.nextDouble());
        }
        
        empresa.addFuncionario(func);
        }
    public static int menu(){
        System.out.println("\n\t### Escolha ###");
        System.out.println("# 1) Cadastrar funcionario");
        System.out.println("# 2) Calcular gasto salarial");
        System.out.println("# 3) Listar funcionarios");
        System.out.println("# 4) Sair");
        return le.nextInt();
    }
    static void calculaSalario(Empresa empresa)
    {
        System.out.print("Total de Salario: R$ "+ empresa.totalSalarios());
    }
}







            
            