import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const AddIndexer = () => {
    const [name, setName] = useState('');
    const [valueMin, setValueMin] = useState('');
    const [valueMax, setValueMax] = useState('');
    const navigate = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault();

        const newIndexer = {
            name: name,
            valueMin: parseInt(valueMin),
            valueMax: parseInt(valueMax),
        };

        console.log("Sending data:", newIndexer);

        axios
            .post('/api/indexers', newAuthor)
            .then((response) => {
                alert('Author added successfully');
                navigate('/');
            })
            .catch((error) => {
                if (error.response) {
                    console.error('Backend error:', error.response.data);
                    alert(`Error: ${error.response.data.message || 'Error adding author'}`);
                } else {
                    console.error('Request error:', error);
                    alert('Error adding author');
                }
            });
    };

    return (
        <div className="container">
            <h2>Add New Indexer</h2>
            <form onSubmit={handleSubmit}>
                <div className="form-group">
                    <label>Name</label>
                    <input
                        type="text"
                        className="form-control"
                        value={name}
                        onChange={(e) => setName(e.target.value)}
                        required
                    />
                </div>
                <div className="form-group">
                    <label>ValueMin</label>
                    <input
                        type="number"
                        className="form-control"
                        value={valueMin}
                        onChange={(e) => setValueMin(e.target.value)}
                        required
                    />
                </div>
                <div className="form-group">
                    <label>ValueMax</label>
                    <input
                        type="number"
                        className="form-control"
                        value={valueMax}
                        onChange={(e) => setValueMax(e.target.value)}
                        required
                    />
                </div>
                <button type="submit" className="btn btn-primary mt-3">
                    Add Indexer
                </button>
            </form>
        </div>
    );
};

export default AddIndexer;