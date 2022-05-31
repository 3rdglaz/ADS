using System;

namespace Fundamentos_de_Programação
{
    class Program
    {
        static void Main(String[] arg)
        {
            for 50
            stringEscolhida = consoleRead()
            Atleta[i].nome;
            Atleta[i].alt;
            Atleta[i].peso;

            if começa com a string escolhida
                ReadLine(alteta[i])

        }
    }
}


int[,] matriz = new int[3, 3] { { nome, alt, peso }0,
         { 5, 7, 17 }1,
         { 45, 10, 43 } 2};






//     static void Main(string[] args)
//     {
//         int[,] matriz = new int[3, 3] { { 2, 2, 11 }, { 5, 7, 17 }, { 45, 10, 43 } };

//         Console.Write(Par(matriz));
//         Console.Write(matriz.Rank);

//     }
//     static int Par(int[,] matriz)
//     {

//         int par = 0;
//         for (int i = 0; i <= matriz.Rank; i++)
//         {
//             for (int j = 0; j <= matriz.Rank; j++)
//             {
//                 if (matriz[i, j] % 2 == 0)
//                 {
//                     par += matriz[i, j];
//                 }
//             }
//         }
//         return par;
//     }

// }
// char[] vogal = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
// String consoante = "";
// // char[] semConsoante = new char[] { };

// // int c = 0;

// Console.WriteLine("Digite uma frase");
// String frase = Console.ReadLine();
// for (int i = 0; i < frase.Length; i++)
// {

//     if (frase[i] != 'a' && frase[i] != 'e' && frase[i] != 'i' && frase[i] != 'o' && frase[i] != 'u' && frase[i] != 'A' && frase[i] != 'E' && frase[i] != 'I' && frase[i] != 'O' && frase[i] != 'U')
//     {
//         consoante += frase[i];
//     }
// }
// Console.WriteLine("Consoantes: {0}", consoante);





// 
// 
// 65 a 90 são char maiusculo
// String maiusculas = "";
// for (int i = 0; i < eMaiuscula.Length; i++)
// {
//     if (eMaiuscula[i] >= 65 && eMaiuscula[i] <= 90)
//     {
//         maiusculas += eMaiuscula[i];
//     }
// }
// Console.WriteLine("As Maiusculas: {0}", maiusculas);
// static void Main(string[] args)
// {
// (1 ponto): Faça um procedimento que receba uma string passada por parâmetro
//  e imprima somente as letras maiúsculas. Exemplo: Para a string “Teste Isso Aqui”, deve ser impresso “TIA”.
//         Maiuscula("alguma stRiNG");
//     }
// }


// //Faça um programa que leia a descrição e o peso de cinquenta produtos. Esse programa deve imprimir a descrição do produto de maior peso.
// String produto = "", maisPesadoDesc = "", descricao = "";
// int maiorPeso = 0, peso = 0;

// for (int i = 0; i < 50; i++)
// {
//     Console.WriteLine("Produto: ");
//     produto = Console.ReadLine();
//     Console.WriteLine("Descrição: ");
//     descricao = Console.ReadLine();
//     Console.WriteLine("Peso: ");
//     peso = Convert.ToInt32(Console.ReadLine());
//     if (peso > maiorPeso)
//     {
//         maiorPeso = peso;
//         maisPesadoDesc = descricao;
//     }
// }
// Console.WriteLine("Item: {0}\nPeso: {1}\nDescrição: {2}", produto, peso, maisPesadoDesc);


// int numeroNovo = 0;
// int numeroPar = 0;
// for (int i = 0; i < 5; i++)
// {
//     Console.WriteLine("Digite o ${0} valor: \t", i + 1);
//     int numero = Convert.ToInt32(Console.ReadLine());
//     if (numero % 2 == 0)
//     {
//         numeroNovo += numero;
//         numeroPar++;
//     }
// }
// double media = numeroNovo / numeroPar;
// Console.WriteLine("{0}", media);




//Ex 1
// Faça uma função que receba dois parâmetros: o valor de um boleto e um percentual de desconto. A função deve retornar o valor do boleto após a aplicação do desconto.
// Console.WriteLine("Digite o valor do boleto: \t");
// double valor_boleto = Convert.ToInt32(Console.ReadLine());

// Console.WriteLine("Digite o valor do desconto: \t");
// double valor_desconto = Convert.ToInt32(Console.ReadLine());

// double total = Desconto(valor_boleto, valor_desconto);
// Console.WriteLine("{0}", total);
//=====================================================================================================================================
// Ex 2
//Faça um procedimento que receba por parâmetro três números inteiros e imprima:

// ParImpar(1, 3, 5);
//=========================================================================================================================================
//Ex 3
// Faça um programa que leia 5 números inteiros informados pelo usuário. Essa leitura precisa acontecer em um comando de repetição do tipo “for”. 
// Ao término do programa, imprima a média de números pares digitados pelo usuário. Exemplo de execução do programa (os valores em negrito foram informados pelo usuário):

//=================================================================================================================================================
// Ex 4
//Faça um programa que leia idades de pessoas enquanto a idade informada for maior ou igual a zero. Ao término do programa, imprima a menor idade informada pelo usuário.
// Exemplo de execução do programa (os valores em negrito foram informados pelo usuário):

//     Console.WriteLine("Insira idade: ");
//     int idadeTeste = Convert.ToInt32(Console.ReadLine());
//     int menorIdade = idadeTeste;

//     while (idadeTeste > 0)
//     {
//         Console.WriteLine("Insira idade: ");
//         idadeTeste = Convert.ToInt32(Console.ReadLine());
//         if (idadeTeste > 0 && idadeTeste < menorIdade)
//         {
//             menorIdade = idadeTeste;
//         }
//     }
//     Console.WriteLine("Menor Idade: {0}", menorIdade);


// }














// Construa um programa para ler um intervalo
// de tempo em segundos, converter para
// horas, minutos e segundos e imprimir o
// resultado.
// int horas = 0;
//     int minutos = 0;
//     Console.WriteLine("Insira Segundos: ");
//     int segundos = Convert.ToInt32(Console.ReadLine());
//     while (segundos >= 3600)
//     {
//         segundos -= 3600;//subtrai 1h em s
//         horas += 1;//soma 1h em h
//     }
//     while (segundos >= 60)
//     {
//         segundos -= 60;//subtrai 1min em s
//         minutos += 1;// soma 1min em min
//     }
//     string s_horas = horas.ToString("D2");
//     string s_minutos = minutos.ToString("D2");
//     string s_segundos = segundos.ToString("D2");
// Console.WriteLine("{0}:{1}:{2}", s_horas, s_minutos, s_segundos);
// Console.WriteLine("{0}:{1}:{2}", s_horas, s_minutos, s_segundos);
//     Console.WriteLine("{0:D2}:{1:D2}:{2:D2}", horas, minutos, segundos);
// }
//Exercício 1
//         static double Desconto(double boleto, double desconto)
//         {
//             double total = (boleto - (boleto * (desconto / 100)));
//             return total;
//         }
//         // //Exercíio 2
//         // 	"Todos são ímpares" se todos os números forem ímpares.
//         //   "Todos são pares" se todos os números forem pares.
//         //   "Pares e ímpares misturados" caso nenhuma opção acima seja verdadeira. 
//         static void ParImpar(int n1, int n2, int n3)
//         {
//             if (n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0)
//             {
//                 Console.WriteLine("São par");
//             }
//             else if (n1 % 2 != 0 && n2 % 2 != 0 && n3 % 2 != 0)
//             {
//                 Console.WriteLine("Impar");
//             }
//             else
//             {
//                 Console.WriteLine("Mistura");
//             }
//         }
//     }
// }

