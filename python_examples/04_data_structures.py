# Python Data Structures
# Demonstrates various built-in data structures and their operations

# Lists - ordered, mutable sequences
numbers = [1, 2, 3, 4, 5]
numbers.append(6)        # Add element to end
numbers.insert(0, 0)    # Insert at specific position
first = numbers.pop(0)  # Remove and return element
numbers.extend([7, 8])  # Add multiple elements

# Dictionaries - key-value pairs
person = {
    'name': 'Alice',
    'age': 30,
    'city': 'New York'
}
person['job'] = 'Engineer'  # Add new key-value pair
age = person.get('age')     # Safe way to get value
keys = person.keys()        # Get all keys
values = person.values()    # Get all values

# Sets - unordered collection of unique elements
fruits = {'apple', 'banana', 'orange'}
fruits.add('grape')         # Add single element
fruits.update(['mango', 'kiwi'])  # Add multiple elements
fruits.remove('apple')      # Remove element
is_present = 'banana' in fruits  # Check membership

# Tuples - immutable sequences
coordinates = (10, 20)
x, y = coordinates         # Tuple unpacking
nested = ((1, 2), (3, 4)) # Nested tuples 