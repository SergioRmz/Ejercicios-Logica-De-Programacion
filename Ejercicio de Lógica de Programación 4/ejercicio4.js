// Declaración de variable para guardar el input del usuario.
let userInput;
// Validación de los datos introducidos por el usuario.
do {
    userInput = parseInt(prompt("Introduce un numero entero positivo mayor o igual a 0"));
} while (isNaN(userInput) || userInput < 0);


let fibonacci = (userInput) => {
    if (userInput == 0) return 0;
    else if (userInput == 1) return 1;
    else{
        return (fibonacci(userInput - 1) + fibonacci(userInput - 2));
    }
};

// Se trae el parrafo con id fibonacci 
let paragraph = document.querySelector("#fibonacci");
// Se crea un nodo de texto para mostrar el resultado de la funcion
let paragraphText = document.createTextNode(fibonacci(userInput));

// Se anade el texto creado al parrafo.
paragraph.append(paragraphText);




