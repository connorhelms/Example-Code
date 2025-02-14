/*
 * Database Operations in Node.js
 * Shows MongoDB connection and operations using Mongoose
 */

const mongoose = require('mongoose');

// Define schema
const userSchema = new mongoose.Schema({
    name: { type: String, required: true },
    email: { type: String, required: true, unique: true },
    age: Number,
    createdAt: { type: Date, default: Date.now }
});

// Create model
const User = mongoose.model('User', userSchema);

// Connect to MongoDB
mongoose.connect('mongodb://localhost/myapp', {
    useNewUrlParser: true,
    useUnifiedTopology: true
});

// CRUD operations
async function createUser(userData) {
    try {
        const user = new User(userData);
        await user.save();
        return user;
    } catch (error) {
        console.error('Error creating user:', error);
        throw error;
    }
}

async function findUsers(query) {
    try {
        return await User.find(query);
    } catch (error) {
        console.error('Error finding users:', error);
        throw error;
    }
}

async function updateUser(id, updates) {
    try {
        return await User.findByIdAndUpdate(id, updates, { new: true });
    } catch (error) {
        console.error('Error updating user:', error);
        throw error;
    }
}

async function deleteUser(id) {
    try {
        return await User.findByIdAndDelete(id);
    } catch (error) {
        console.error('Error deleting user:', error);
        throw error;
    }
}

// Example usage
async function main() {
    try {
        // Create a user
        const user = await createUser({
            name: 'John Doe',
            email: 'john@example.com',
            age: 30
        });

        // Find users
        const users = await findUsers({ age: { $gt: 25 } });

        // Update user
        await updateUser(user._id, { age: 31 });

        // Delete user
        await deleteUser(user._id);
    } catch (error) {
        console.error('Main error:', error);
    }
} 