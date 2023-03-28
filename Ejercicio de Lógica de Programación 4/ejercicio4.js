// Declaración de variable para guardar el input del usuario.
// let userInput;
// Validación de los datos introducidos por el usuario.
// do {
//     userInput = parseFloat(prompt("Introduce un numero entero positivo mayor a 0"));
// } while (isNaN(userInput) || userInput < 1);


let fibonacci = (userInput) => {
    if (userInput <= 1) {
        return 1;
    } else{
        return (fibonacci(userInput - 1) + fibonacci(userInput - 2));
    }
};

console.log(fibonacci(5 ));

// let paragraphText = document.createTextNode(fibonacci(userInput));
// let paragraph = document.querySelector("#fibonacci");

// paragraph.append(paragraphText);




