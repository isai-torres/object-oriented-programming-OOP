class Car {
  constructor(make, model, color) {
    this.make = make;
    this.model = model;
    this.color = color;
  }

  // Create method to display car details
  drive() {
    console.log(`You are driving a ${this.color} ${this.make} ${this.model}`);
  }
}

module.exports = Car;