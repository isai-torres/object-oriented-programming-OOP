# This import the class Book from the file classBook.py
from classBook import Book

# Instances
book1 = Book("Meditations", "Marcus Aurelius", "Philosophy", 100)
book2 = Book("The Art of War", "Sun Tzu", "Philosophy", 50)
book3 = Book("Think Like a Programmer", "V. Anton Spraul", "Programming", 200)

# Now we use the method to show the details of the book
book1.mostrarDetalles()
print("--------------------")
book2.mostrarDetalles()
print("--------------------")
book3.mostrarDetalles()
print("--------------------")