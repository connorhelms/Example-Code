# Python Functions
# Demonstrates function definition and usage

def greet(name, greeting="Hello"):
    '''
    Greets a person with a custom greeting
    Args:
        name (str): Person's name
        greeting (str): Optional greeting message
    Returns:
        str: Complete greeting message
    '''
    return f"{greeting}, {name}!"

# Function with multiple parameters
def calculate_rectangle_area(length, width):
    '''
    Calculates area of a rectangle
    Args:
        length (float): Rectangle length
        width (float): Rectangle width
    Returns:
        float: Area of rectangle
    '''
    return length * width 