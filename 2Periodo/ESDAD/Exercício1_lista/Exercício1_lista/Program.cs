// See https://aka.ms/new-console-template for more information
/*Faça um procedimento que receba um número n inteiro e positivo. O
procedimento deve imprimir todos os números do intervalo entre 0 e n que são
divisíveis por 2 e por 3 (simultaneamente). Restrição: não utilize comandos de
repetição.*/
Console.WriteLine("Chamando com número 36");
dividePor6(36);
static void dividePor6( int n){
    if (n > 0)
    {
        if (n % 2 == 0 && n % 3 == 0)
        {
            Console.Write($" {n} ");
        }
        dividePor6(n - 1);
    }
    else
        Console.WriteLine("\n Menor que zero. FIM");
}