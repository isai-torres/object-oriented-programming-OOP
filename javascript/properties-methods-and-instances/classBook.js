class Book {
  constructor(titulo, autor, genero, numPaginas) {
  // Attributes
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.numPaginas = numPaginas;
  }

  // Methods
  mostrarDetalles() {
    console.log(`Titulo: ${this.titulo}, \nAutor: ${this.autor}, \nGenero: ${this.genero}, \nPaginas: ${this.numPaginas}`);
  }
}

// This is the way to EXPORT a class in Node.js
module.exports = Book;