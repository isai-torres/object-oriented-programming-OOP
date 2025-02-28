class Pet:
  # This constructor is using default values (This method is simple and clear for most cases)
  # This approach lets you create an object without passing arguments or by passing them if you want.
  def __init__(self, name = "", age = 0, species = ""):
    self.name = name
    self.age = age
    self.species = species
  
  # This method is used to show the details of the object
  def mostrarDetalles(self):
    print("Pet details:")
    print(f"1. Name: {self.name}")
    print(f"2. Age: {self.age}")
    print(f"3. Species: {self.species}")

  # This method is used to enter the details of the object
  def ingresarDetalles(self):
    self.name = input("Enter the name of the pet: ")
    self.age = int(input("Enter the age of your pet: "))
    self.species = input("Enter the species of your pet: ")