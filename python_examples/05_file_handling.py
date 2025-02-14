# File Handling in Python
# Shows different ways to read and write files

# Writing to a text file
with open('example.txt', 'w') as file:
    file.write('Hello, World!\n')
    file.write('This is a new line.')

# Reading from a text file
with open('example.txt', 'r') as file:
    content = file.read()  # Read entire file
    
# Reading line by line
with open('example.txt', 'r') as file:
    for line in file:
        print(line.strip())

# Working with CSV files
import csv

# Writing CSV
data = [
    ['Name', 'Age', 'City'],
    ['John', 25, 'New York'],
    ['Alice', 30, 'London']
]
with open('data.csv', 'w', newline='') as file:
    writer = csv.writer(file)
    writer.writerows(data)

# Reading CSV
with open('data.csv', 'r') as file:
    reader = csv.reader(file)
    for row in reader:
        print(row) 