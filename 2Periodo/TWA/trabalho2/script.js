// window.addEventListener('scroll',() => {

// const rodou = window.scrollY;//pega o qyuanto a pagina rodou
// console.log(rodou);//printa o quanto rodou
// const confidencial = document.querySelector('.confidencial');// pega a class confidencial
// if (rodou == 100) {
//     console.log("mark"); //printa mark quando alcança 100
//     confidencial.classList.add("censura");//e add censura a class
    
// }

// function censura(){
//     const confidencial = document.querySelector('.confidencial');// pega a class confidencial
//     confidencial.classList.add("censura");//e add censura a class
// }  

// setTimeout(censura,4000)

function teste() {
    
    const censura = document.querySelectorAll('.confidencial');
    for(const i of censura){
        i.classList.add("censura");
        
    };

}
setTimeout(teste,2000);
