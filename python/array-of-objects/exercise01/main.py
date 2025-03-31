from classCar import Car

# Instances of the Car class
car1 = Car("Toyota", "Corolla", "Red")
car2 = Car("Honda", "Civic", "Blue")
car3 = Car("Ford", "Mustang", "Black")

# Create array of objects
cars = [car1, car2, car3]

# Create for loop to iterate through the array of cars
for car in cars:
  car.drive()