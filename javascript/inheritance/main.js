const Animal = require("./classAnimal.js");
const Cat = require("./classCat.js");
const Dog = require("./classDog.js");

const capitan = new Dog("Capitan", 7);
const boots = new Cat("Boots", 5);

// Show dog information
capitan.animalInfo();
capitan.dogSound();
capitan.eat();

console.log();

// Show cat information
boots.animalInfo();
boots.catSound();
boots.eat();