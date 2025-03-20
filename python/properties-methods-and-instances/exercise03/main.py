from classPet import Pet

# Instance of the class Pet, but the user will enter the values using the method ingresarDetalles
pet1 = Pet()
pet1.ingresarDetalles()

# Instance of the class Pet, but we enter the values without using the method ingresarDetalles
pet2 = Pet()
pet2.name = "Firulais"
pet2.age = 5
pet2.species = "Labrador"

# Instance of class Pet, but with arguments
pet3 = Pet("Capitan", 8, "Chihuahua")


# Call the method mostrarDetalles
pet1.mostrarDetalles()
print("--------------------")
pet2.mostrarDetalles()
print("--------------------")
pet3.mostrarDetalles()