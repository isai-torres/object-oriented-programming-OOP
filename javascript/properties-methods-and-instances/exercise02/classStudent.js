class Student {
  constructor(nombre, edad, concentracion, promedio) {
    this.nombre = nombre;
    this.edad = edad;
    this.concentracion = concentracion;
    this.promedio = promedio;
  }

  // Metodo
  mostrarDetalles() {
    console.log(`Nombre: ${this.nombre}`);
    console.log(`Edad: ${this.edad}`);
    console.log(`Concentracion: ${this.concentracion}`);
    console.log(`Promedio: ${this.promedio}`);
  }
}

module.exports = Student;