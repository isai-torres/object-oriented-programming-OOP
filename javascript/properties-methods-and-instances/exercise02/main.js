const Student = require('./classStudent');

// Instances
const student1 = new Student("John", 25, "Computer Science", 90);
const student2 = new Student("Jane", 22, "Web Development", 95);
const student3 = new Student("Doe", 30, "Data Science", 85);

console.log("Students from Universidad InterAmericana de Puerto Rico:");
console.log();


// mostrar los detalles de cada estudiante
student1.mostrarDetalles();
console.log("--------------------------------");
student2.mostrarDetalles();
console.log("--------------------------------");
student3.mostrarDetalles();