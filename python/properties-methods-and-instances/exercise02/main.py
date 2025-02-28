# Thi import is used to import the Student class from the classStudent file
from classStudent import Student

# Instances
student1 = Student("John", 20, "Computer Science", 90.45)
student2 = Student("Jane", 21, "Computer Science", 95.20)
student3 = Student("Alice", 22, "Computer Science", 87.20)

print("Students from Universidad InterAmericana de Puerto Rico:")
print()

# Now we use the method to show the details of the student
student1.mostrarDetalles()
print("--------------------")
student2.mostrarDetalles()
print("--------------------")
student3.mostrarDetalles()