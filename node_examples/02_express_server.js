/*
 * Express.js Server
 * Shows how to create a basic REST API
 */

const express = require('express');
const app = express();

// Middleware
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Routes
app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.get('/api/users', (req, res) => {
    const users = [
        { id: 1, name: 'John' },
        { id: 2, name: 'Jane' }
    ];
    res.json(users);
});

app.post('/api/users', (req, res) => {
    const { name } = req.body;
    // Add user to database
    res.status(201).json({ message: 'User created' });
});

// Error handling middleware
app.use((err, req, res, next) => {
    console.error(err.stack);
    res.status(500).send('Something broke!');
});

app.listen(3000, () => {
    console.log('Server is running on port 3000');
}); 