const Animal = require("./classAnimal.js");

class Cat extends Animal {
  catSound() {
    console.log(`${this.name} is meowing meow meow!`);
  }
}

module.exports = Cat;