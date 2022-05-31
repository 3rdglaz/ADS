// using System;

// namespace Fundamentos_de_Programação
// {
//     class Program
//     {
//         static double Porcentagem(Double[] v)
//         {
//             double soma = 0;
//             // roda o loop pra pegar todos os indices do vetor
//             for (int i = 0; i < v.Length; i++)
//             {
//                 // entre 100 e 300 = 15%
//                 if (v[i] > 100 && v[i] < 300)
//                 {
//                     v[i] *= 1.15;
//                     Console.WriteLine("{0}", v[i]);
//                 }
//                 // entre 300 e 500 = 25%
//                 else if (v[i] >= 300 && v[i] < 500)
//                 {
//                     v[i] *= 1.25;
//                     Console.WriteLine("{0}", v[i]);
//                 }
//                 // restante
//                 else
//                 {
//                     v[i] *= 1.05;
//                     Console.WriteLine("{0}", v[i]);
//                 }
//                 // soma dentro do loop os indices na var soma
//                 soma += v[i];
//             }
//             //retorna soma
//             return soma;
//         }
//         static void Main(string[] args)
//         {

//             double[] vetor = new double[3] { 301, 301, 301 };

//             Console.WriteLine("{0}", Porcentagem(vetor));
//         }
//     }
// }




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

