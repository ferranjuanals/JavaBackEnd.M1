
var nom="Ferran", cognom1="Juanals", cognom2="Figueras";
var dia=26, mes=03, any=1989;

var nom_complert = nom.concat(" ", cognom1, " ", cognom2);
document.getElementById("fase4_1").innerHTML = "El meu nom es " + nom_complert;

var naixament = dia + "/" + mes + "/" + any;
document.getElementById("fase4_2").innerHTML = "Vaig neixer el " + naixament;

var traspas=4;		
var bool=any%traspas == 0;
var sol;

if(bool) {
    sol="es de traspas";
} else {
    sol="no es de traspas";
}

document.getElementById("fase4_3").innerHTML = "El meu any de naixament " + sol;
