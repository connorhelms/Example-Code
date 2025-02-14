/*
 * Asynchronous Programming in Node.js
 * Demonstrates async/await patterns
 */

// Promisified delay function
const delay = (ms) => new Promise(resolve => setTimeout(resolve, ms));

// Async function with error handling
async function fetchUser(id) {
    try {
        // Simulate API call
        await delay(1000);
        if (id < 0) {
            throw new Error('Invalid user ID');
        }
        return { id, name: 'John Doe' };
    } catch (error) {
        console.error('Error fetching user:', error);
        throw error;
    }
}

// Using async/await with Promise.all
async function fetchMultipleUsers(ids) {
    try {
        const userPromises = ids.map(id => fetchUser(id));
        const users = await Promise.all(userPromises);
        return users;
    } catch (error) {
        console.error('Error fetching multiple users:', error);
        throw error;
    }
}

// Example usage
async function main() {
    try {
        const users = await fetchMultipleUsers([1, 2, 3]);
        console.log('Users:', users);
    } catch (error) {
        console.error('Main error:', error);
    }
}

main(); 