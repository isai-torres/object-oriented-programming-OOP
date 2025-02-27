class Book:
  def __init__(self, titulo, autor, genero, numPaginas):
  # Attributes
    self.titulo = titulo
    self.autor = autor
    self.genero = genero
    self.numPaginas = numPaginas

  # Method to show the details of the book
  def mostrarDetalles(self):
    print(f"1. Titulo: {self.titulo} \n2. Autor: {self.autor} \n3. Genero: {self.genero} \n4. Paginas: {self.numPaginas}")