# PyTorch Basics
# Shows fundamental PyTorch operations and a simple neural network

import torch
import torch.nn as nn
import torch.optim as optim

# Creating tensors
tensor_1d = torch.tensor([1, 2, 3, 4])
tensor_2d = torch.tensor([[1, 2], [3, 4]])
random_tensor = torch.rand(3, 4)

# Basic operations
a = torch.tensor([[1, 2], [3, 4]])
b = torch.tensor([[5, 6], [7, 8]])
addition = a + b
multiplication = torch.matmul(a, b)

# Simple neural network
class SimpleNet(nn.Module):
    def __init__(self):
        super(SimpleNet, self).__init__()
        self.fc1 = nn.Linear(10, 64)
        self.fc2 = nn.Linear(64, 32)
        self.fc3 = nn.Linear(32, 1)
        self.relu = nn.ReLU()
        self.sigmoid = nn.Sigmoid()
    
    def forward(self, x):
        x = self.relu(self.fc1(x))
        x = self.relu(self.fc2(x))
        x = self.sigmoid(self.fc3(x))
        return x

# Initialize model, loss, and optimizer
model = SimpleNet()
criterion = nn.BCELoss()
optimizer = optim.Adam(model.parameters())

# Generate dummy data
x_train = torch.rand(1000, 10)
y_train = torch.randint(0, 2, (1000, 1)).float()

# Training loop
num_epochs = 10
for epoch in range(num_epochs):
    # Forward pass
    outputs = model(x_train)
    loss = criterion(outputs, y_train)
    
    # Backward pass and optimize
    optimizer.zero_grad()
    loss.backward()
    optimizer.step() 