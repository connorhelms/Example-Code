# Control Flow in Python
# This file demonstrates conditional statements and loops

# If-elif-else conditional statements
def check_temperature(temp):
    if temp > 30:
        return "It's hot!"
    elif temp > 20:
        return "It's warm."
    else:
        return "It's cool."

# For loop - iterating over a sequence
fruits = ["apple", "banana", "orange"]
for fruit in fruits:
    print(f"I like {fruit}")

# While loop - continues until condition is False
count = 0
while count < 5:
    print(count)
    count += 1  # Increment counter 