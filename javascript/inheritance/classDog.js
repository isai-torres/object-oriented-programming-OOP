const Animal = require("./classAnimal.js");

class Dog extends Animal {
  dogSound() {
    console.log(`${this.name} is barking woof woof!`);
  }
}

module.exports = Dog;