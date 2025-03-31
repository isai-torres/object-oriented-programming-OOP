const Car = require('./classCar.js');

// Instances
const car1 = new Car("Ford", "Mustang", "Red");
const car2 = new Car("Toyota", "Corolla", "Blue");
const car3 = new Car("Ford", "Fiesta", "White");

// Create array of objects
const cars = [car1, car2, car3];

for (let i = 0; i < cars.length; i++) {
  cars[i].drive();
}