let num = [];
do {
    let userInput = parseInt(prompt("Introduce un número positivo mayor a 0"));
    if (isNaN(userInput) || userInput <= 0) {
        alert("Vuelve a intentarlo");
    } else{
        num.push(userInput);        
    }
    
} while (num.length < 3);

numAscendente = num.sort(function(a,b){return a-b});
alert("Numeros ascendentes: " + numAscendente);

numDescendente = num.sort(function(a,b){return b-a});
alert("Numeros descendentes: " + numDescendente);

