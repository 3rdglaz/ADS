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

function censura() {
    const censura = document.querySelectorAll('.confidencial');
    for(const i of censura){
        i.classList.add("censura");
    };
}

function anomalia() {
    var bizarro ='';
    var alfabeto       = ' ȜȝȞȟȠȡȢȤȥȦȧȨȩȪȫȭȮȯȰȱȲȳȴȵȶȷȸȹȺȻȼȽȾȿɀɁɂɃɄɅɆɇɈɉɊɋɌɍɎɏɐɑɒɓɔɕɖɗɘəɚɛɜɝɞɟɠɡɢɣɤɥɦɧɨɩɪɫɬɭɮɯɰɱɲɳɴɵɶɷɸɹɺɻɼɽɾɿʀʁʂʃʄʅʆʇʈʉʊʋʌʍʎʏʐʑʒʓʔʕʖʗʘʙʚʛʜʝʞʟʠʡʢʣʤʥʦʧʨʩʪʫ';
    for (let i = 0; i < "caio pereira".length; i++) {
        bizarro += alfabeto.charAt(Math.floor(Math.random() * 
        alfabeto.length));
    }
    document.getElementById('assinatura').innerHTML = bizarro;
}

window.onscroll = function() {
    if ((window.innerHeight + window.pageYOffset) >= document.body.offsetHeight) {
        setTimeout(anomalia,4000);
        // console.log(anomalia());
        // console.log('fim');
    }
};
setTimeout(censura,2000);
