# Object-Oriented Programming in Python
# Demonstrates class definition and inheritance

class Animal:
    def __init__(self, name, species):
        self.name = name
        self.species = species
    
    def make_sound(self):
        pass
    
    def describe(self):
        return f"{self.name} is a {self.species}"

class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name, species='dog')
        self.breed = breed
    
    def make_sound(self):
        return 'Woof!'
    
    def fetch(self, item):
        return f"{self.name} is fetching the {item}"

# Using the classes
dog = Dog('Rex', 'German Shepherd')
print(dog.describe())
print(dog.make_sound())
print(dog.fetch('ball')) 