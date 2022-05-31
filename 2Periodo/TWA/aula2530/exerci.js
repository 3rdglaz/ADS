// é pra aplicar classes diferentes
const html = document.querySelector('html');
const css = document.querySelector(':root')
window.addEventListener('keydown', aumentaFonte());

function aumentaFonte(event){
    if(event.key = 't'){
        html.classList.toggle('grande');
    }
}

// selecione todos elementos, dando console.log()

const all = document.querySelectorAll('*:not(html)');

function mostraElemento(evento){
    console.log(this); 
}

all.forEach(element =>  {
    element.addEventListener('click', mostraElemento);
})

// remove elemento da tela

function someElemento(evento){
    evento.preventDefault();
    evento.target.remove();
}
all.forEach(element =>{
    element.addEventListener('click', someElemento());
}