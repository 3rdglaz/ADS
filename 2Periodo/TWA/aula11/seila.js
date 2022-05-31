var link = document.querySelector('#google');
var clicou=false;
link.innerText = 'Clique aqui!';
link.addEventListener('click',()=>{
    if(!clicou)
        link.classList.add('blue');
    else
        link.classList.remove('blue');
    
    clicou=!clicou;
});

//nomeie 3 propriedades ou metodos de strings De exemplos

indexOf('abaxi') // vai voltar o index no qual o elemenot abacaxi se encontra no vetor.
//retorna o primeiro índice em que o elemento pode ser encontrado no array
substring()
charAt()
//nomeie 5 propriedades ou métodos do elemtno DOM
getElementById ()
innerHTML() - nó (elemento) valor de texto
getElementsByClassName ()
createElement(p)// cria paragrado
createTextNode("This is new.")// coloca texto
// D~e eemplo de um metodo que utilizamos para interagir com o console
console.assert()  // escreve mensagem de erro