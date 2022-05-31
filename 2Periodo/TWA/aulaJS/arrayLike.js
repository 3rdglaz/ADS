// const gridsection = document.querySelectorAll('grid-section'); //grid-sect = nome da clase
// gridsection.forEach(function(item,index,array){
//     console.log(item);
//     console.log(index);
// })

const imagens= document.querySelectorAll('img'); // todos que estiverem a tag img vão pra dentro da variavel

imagens.forEach(function(item){
    console.log(item);
})

const titulosArray = Array.from(titulso);
console.log(titulosArray)
// imprimir todos exercícios títulso array
titulosArray.forEach(function(item){
    console.log(item);
})
/// com arrow function define já
titulosArray.forEach((item)=>{
    console.log(item);
})
//imprimir paragrafos e conteudo
const paragrafos = document.querySelectorAll('p')//classe do paragor
paragrafos.forEach(item=>{console.log(item);console.log(item.innerText)});
