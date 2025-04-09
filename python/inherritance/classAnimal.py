class Animal:
  def __init__(self, name, age):
    self.name = name
    self.age = age
    self.isAlive = True
  
  def eat(self):
    print("The animal is eating")

  def animalInfo(self):
    print(f"Name: {self.name}")
    print(f"Age: {self.age}")
    print(f"Is this animal alive: {self.isAlive}")