// Declaración de variables para guardar inputs del usuario.
let userInput;
let inputNumbers = [];
// Declaración y llamada a la función para generar un numero aleatorio del 1 al 100.
let randomNumber = random(1,100);

// Validaciones de los inputs del usuario
do {
    userInput = parseInt(prompt("Introduce un numero en el rango del 1 al 100"));
    if (isNaN(userInput) || userInput <= 0 || userInput >= 100) { // Solo si el input es numero y esta en el rango se agrega al arreglo para mostrar al final.
        alert("Introduce solo numeros en el rango del 1 al 100");
    } else if(userInput != randomNumber){ 
        inputNumbers.push(userInput);
    } else{
        alert("Felicidades, haz acertado!, el número es : " + userInput + " Los números con los que intentaste son: " + inputNumbers);
    }
} while (isNaN(userInput) || userInput <= 0 || userInput != randomNumber);

// Funcion para generar numeros aleatorios.
function random(min, max) {
    return Math.floor((Math.random() * (max - min + 1)) + min);
}
