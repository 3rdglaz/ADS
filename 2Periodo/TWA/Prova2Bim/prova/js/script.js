

function modonoturno() {
    document.querySelector('body').classList.toggle('modo-noturno');
    document.querySelector('#logo').classList.toggle('logo-noturno');
    document.querySelector('.slide').classList.toggle('slide-noturno');
   
}
// const alterar = document.querySelector('.noturno');
// alterar.addEventListener()
var randImg = ['example5.jpg','example6.jpg','example7.jpg'];
var imgCerta = 1;
function trocaImg(neutro,id) {
    const slide = document.getElementById(id);
    slide.src = "./img/"+randImg[imgCerta];
    imgCerta++;
    if(imgCerta > randImg.length){
        slide.src = "./img/"+neutro;
        imgCerta = 0;
    }
    
    
}

