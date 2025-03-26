const Pet = require("./classPet.js");

// Instance of the class Pet, but the user will enter the values using the method ingresarDetalles
const pet1 = new Pet();
pet1.ingresarDetalles();

// Instance of the class Pet, but we enter the values without using the method ingresarDetalles
const pet2 = new Pet();
pet2.name = "Firulais";
pet2.age = 5;
pet2.species = "schnauzer";

// Instance of class Pet, but with arguments
const pet3 = new Pet("Bobby", 3, "dog");

// show pet details
pet1.mostrarDetalles();
console.log("---------------------");
pet2.mostrarDetalles();
console.log("---------------------");
pet3.mostrarDetalles();

//---------------------- Important ----------------------
// For prompting the user to enter the values in JavaScript you will need to install the prompt-sync package. "npm install prompt-sync"