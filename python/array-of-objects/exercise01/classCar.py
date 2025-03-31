class Car:
  def __init__(self, make, model, color):
    self.make = make
    self.model = model
    self.color = color

# Create a method to display the car details
  def drive(self):
    print(f"You are driving a {self.color} {self.make} {self.model}")