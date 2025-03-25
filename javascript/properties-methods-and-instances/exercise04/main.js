const Book = require('./classBook.js');

// This is an instance of the Book class
const book1 = new Book();

console.log(`Titulo: ${book1.titulo}`);
console.log(`Autor: ${book1.autor}`);
console.log(`Genero: ${book1.genero}`);
console.log(`Paginas: ${book1.numPaginas}`);