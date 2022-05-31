/*
 Faça uma função que ordene um vetor de inteiros passado por
parâmetro utilizando o método bolha e retorne o número de trocas realizadas.
*/
Console.WriteLine("Hello, World!");
int[] vet = new int[] { 7,4,1,5, 2, 3 };
Console.Write(contaTroca(vet));

static int contaTroca(int[] vet)
{
    int contador=0, i, j,aux;
    for(i=0;i < vet.Length-1; i++)
    {
        for(j=0;j < vet.Length-1; j++)
        {
            if(vet[j] > vet[j+1])
            {
                aux = vet[j];
                vet[j] = vet[j + 1];
                vet[j + 1] = aux;
                
                contador++;
            }
        }
    }
    return contador;
}

