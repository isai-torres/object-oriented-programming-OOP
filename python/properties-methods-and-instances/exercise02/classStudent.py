class Student:
  def __init__(self, nombre, edad, concentracion, promedio):
    self.nombre = nombre
    self.edad = edad
    self.concentracion = concentracion
    self.promedio = promedio

  def mostrarDetalles(self):
    print(f"1. Nombre: {self.nombre}")
    print(f"2. Edad: {self.edad}")
    print(f"3. Concentración: {self.concentracion}")
    print(f"4. Promedio: {self.promedio}")