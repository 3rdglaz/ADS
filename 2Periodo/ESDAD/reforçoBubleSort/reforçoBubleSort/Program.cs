using System;

namespace reforçoBubleSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] vet = { 4, 3, 2, 1, 5, 7, 9, 4, };
            //Boolean houveTroca = true;
            BubbleSort(vet);
            Printa(vet);
        }
        private static void Printa(int[] vet)
        {
            for (int i = 0; i < vet.Length; i++)
            {
                Console.Write(vet[i]);
            }
        }
        private static void BubbleSort(int[] vet) 
        {
            //Boolean houveTroca = false;
            int ultimaTroca = 0;
            do
            {
                for (int j = 0; j < vet.Length - 1; j++)
                {
                    if (vet[j] > vet[j + 1])
                    {
                        int aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;
                        // é possível trocar aqui por variável que anota qual foi a ultima 
                        // posição do vetor que foi efetuada a troca
                        ultimaTroca = vet[j];
                        //houveTroca = true;
                    }
                }
            } while (ultimaTroca > 0);
            
        }
    }
}
