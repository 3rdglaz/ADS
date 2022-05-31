// aula sobre criação de objeto com hereditariedade
// POLIMORFISMO

namespace Funcionarios
{

    class Program
    {

        static void Main(string[] args)
        {
            var funcP = new FuncionarioMensalista()
            {
            funcP.Nome = "ana";
            funcP.Eamil = "ana@email.com";
            funcP.Salario = 3000;
            }

            var funcH = new FuncionarioHorista
            {
                Nome = "bruno",
                Email = "bruno@email.com",
                HorasTrabalhadas = 360,
                ValorPorHora = 30
            };
            Imprimir(funcP);
        }

        private void Imprimir(Funcionario func)
        {
            Console.WriteLine($"Nome: {func.Nome},\n salário: {func.GetSalario()} ")
        }
    }
    
    
    // classes separadas em outro documento
    // é abstrato pois não pode ser instanciado sozinho, precisa de uma classe filha
    abstract class Funcionario
    {
        // get e set resumido
        public string Nome {get; set;}
        public string Email {get; set;}
        // get e set full
        // para caso queira alterar algum detalhe
        //public string Nome { get => nome; set = value; }
        //public string Email { get => email; set = value; }
        private string nome;
        private string email;
        // falar que é virtual, classe filha pode dar override
        public abstract double GetSalario()
        
    }
    class FuncionarioHorista : Funcionario
    {
        public int HorasTrabalhadas {get; set; }
        public double ValorPorHora {get; set; }
        
        public override double GetSalario()
        {
            return HorasTrabalhadas * ValorPorHora;
        }
    }

    class FuncionarioMensalista : Funcionario
    {
        public double Salario {get; set;}

        public override double GetSalario()
        {
            return Salario;
        }
    }
}