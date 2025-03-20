class Pet {
  // Always add a constructor to a class
  // This approach lets you create an object without passing arguments or by passing them if you want.
  constructor(name = "", age = 0, species = "") {
    this.name = name;
    this.age = age;
    this.species = species;
  }

  // This method is used to show the details of the object
  mostrarDetalles() {
    console.log("Pet details:");
    console.log(`Nombre: ${this.name}`);
    console.log(`Edad: ${this.age}`);
    console.log(`Species: ${this.species}`);
  }

  ingresarDetalles() {
    const prompt = require("prompt-sync")(); // This line is used to import the prompt-sync module
    this.name = prompt("Enter the name of the pet: ");
    this.age = parseInt(prompt("Enter the age of the pet: "), 10); // parseInt() is used to convert a string to an integer, the 10 specifies the base of the number system..
    this.species = prompt("Enter the species of the pet: ");
  }
}

module.exports = Pet;