let userInput; 
do {
    userInput = parseInt(prompt("Ingresa el valor en grados celsius"));
} while (isNaN(userInput) || userInput <= 0);

let fahrenheitDegrees = (userInput * 9) / 5 + 32;

// alert("Ese numero de grados celsius equivale a " + fahrenheitDegrees + " grados fahrenheit")

let paragraph = document.querySelector("#fahrenheit");
let fahrenheitText = document.createTextNode("-" + fahrenheitDegrees + " grados fahrenheit");

paragraph.append(fahrenheitText);