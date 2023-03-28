
// Declaración de variable para guardar input del usuario.
let userInput;

// Validación de los datos introducidos por el usuario.
do {
    userInput = parseFloat(prompt("Introduce un número entero positivo para calcular su factorial: "));
} while (isNaN(userInput) || userInput <= 0);

// Funcion recursiva para calcular el factorial.
let factorial = (userInput) => {
    if (userInput === 0) {
        return 1;
    } else{
        return userInput * factorial(userInput -1);
    }
}

// Creacion de los elementos para su inserción posterior en el DOM.
let paragraphText = document.createTextNode(factorial(userInput));
let paragraph = document.querySelector("#factorial");

// Inserción en el DOM.
paragraph.append(paragraphText);

