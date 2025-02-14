# TensorFlow Basics
# Demonstrates fundamental TensorFlow operations and a simple neural network

import tensorflow as tf
import numpy as np

# Creating tensors
scalar = tf.constant(100)
vector = tf.constant([1, 2, 3, 4])
matrix = tf.constant([[1, 2], [3, 4]])

# Basic operations
a = tf.constant([[1, 2], [3, 4]])
b = tf.constant([[5, 6], [7, 8]])
addition = tf.add(a, b)
multiplication = tf.matmul(a, b)

# Simple neural network
model = tf.keras.Sequential([
    tf.keras.layers.Dense(64, activation='relu', input_shape=(10,)),
    tf.keras.layers.Dense(32, activation='relu'),
    tf.keras.layers.Dense(1, activation='sigmoid')
])

# Compile and train
model.compile(optimizer='adam',
             loss='binary_crossentropy',
             metrics=['accuracy'])

# Generate dummy data
x_train = np.random.random((1000, 10))
y_train = np.random.randint(2, size=(1000, 1))

# Train the model
model.fit(x_train, y_train, epochs=10, batch_size=32) 