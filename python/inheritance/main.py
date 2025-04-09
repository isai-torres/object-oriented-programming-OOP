# from classAnimal import Animal
from classDog import Dog
from classCat import Cat

capitan = Dog("Capitan", 7)
boots = Cat("Boots", 5)

# Show dog information
capitan.animalInfo()
capitan.dogSound()
capitan.eat()

print() # Add a new line

boots.animalInfo()
boots.catSound()
boots.eat()