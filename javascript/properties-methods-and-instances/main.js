// This is the way to IMPORT a class in Node.js
const Book = require('./classBook');

// Instances
const book1 = new Book("Meditations", "Marcus Aurelius", "Philosophy", 100);
const book2 = new Book("The Art of War", "Sun Tzu", "Philosophy", 50);
const book3 = new Book("Think Like a Programmer", "V. Anton Spraul", "Programming", 200);

// Now we use the method to show the details of the book
book1.mostrarDetalles();
console.log("--------------------");
book2.mostrarDetalles();
console.log("--------------------");
book3.mostrarDetalles();
console.log("--------------------");