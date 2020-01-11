var imgs = ["img6.jpg.jpg","img7.jpg.jpg","img8.jpg.jpg","img9.jpg.jpg"];
var img = document.getElementById("image");
var counter = 0;

setInterval(()=>{
    if (counter==imgs.length-1) {
        counter = 0;
    } else {
        counter++;
    }
    img.src=imgs[counter];
},1000);
function next() {
    if (counter==imgs.length-1) {
        counter = 0;
    } else {
        counter++;
    }
    img.src=imgs[counter];
}
function prev() {
    if (counter==0) {
        counter = imgs.length-1;
    } else {
        counter--;
    }
    img.src=imgs[counter];
}