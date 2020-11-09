
var any = 1989;
var traspas = 4;
var text = "";

for(var i = 1948; i <= any; i = i + traspas) {
    text += i + "<br>";
}

document.getElementById("fase3_1").innerHTML = text;

var bool = (any%traspas == 0);
var verd="L'any " + any + " es de traspas";
var fals="L'any " + any + " no es de traspas";

if(bool) {
    document.getElementById("fase3_2").innerHTML = verd;
} else {
    document.getElementById("fase3_2").innerHTML = fals;
}