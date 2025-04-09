class Animal {
  constructor(name, age) {
    this.name = name;
    this.age = age;
    this.isAlive = true;
  }

  eat() {
    console.log("The animal is eating");
  }

  animalInfo() {
    console.log(`Name: ${this.name}`);
    console.log(`Age: ${this.age}`);
    console.log(`Is this animal alive ${this.isAlive}`);
  }
}

module.exports = Animal;