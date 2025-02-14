/*
 * Node.js Basics
 * Demonstrates fundamental Node.js concepts
 */

// Importing core modules
const fs = require('fs');
const path = require('path');
const http = require('http');

// Reading file asynchronously
fs.readFile('example.txt', 'utf8', (err, data) => {
    if (err) {
        console.error('Error reading file:', err);
        return;
    }
    console.log('File contents:', data);
});

// Creating an HTTP server
const server = http.createServer((req, res) => {
    res.writeHead(200, {'Content-Type': 'text/plain'});
    res.end('Hello World\n');
});

server.listen(3000, () => {
    console.log('Server running at http://localhost:3000/');
});

// Working with paths
const filePath = path.join(__dirname, 'files', 'example.txt');
console.log('File path:', filePath); 