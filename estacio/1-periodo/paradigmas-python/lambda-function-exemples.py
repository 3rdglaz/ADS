veiculos = ['aviao', 'carro', 'moto', 'barco', 'bicicleta']   
f_maiuscula = lambda x: x.upper()

nomes_maiusculos = list(map(f_maiuscula, veiculos))

# print(nomes_maiusculos)
lista = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

function_pares = lambda x: x % 2 == 0

# print(f'teste de par {function_pares(2)}')

pares = list(filter(function_pares, lista))

# print(f'lista de pares {pares}')

lista_numeros = [9.34534, 7.312643, 3.00912, 6.423467]

lista_precisao = [2,2,3,3]

arredondamento = lambda x, y: round(x, y)

resultado = list(map(arredondamento, lista_numeros, lista_precisao))

print(f'resultado: {resultado}')
