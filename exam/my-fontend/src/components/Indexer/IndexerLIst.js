import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const IndexerList = () => {
    const [indexers, setIndexers] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    const fetchIndexers = async () => {
        try {
            setLoading(true);
            const response = await axios.get('/api/indexers');
            setIndexers(response.data);
            setLoading(false);
        } catch (error) {
            setError(error.message);
            setLoading(false);
        }
    };

    useEffect(() => {
        fetchIndexers();
    }, []);

    const handleDelete = async (id) => {
        try {
            await axios.delete(`/api/indexers/${id}`);
            alert('Deleted successfully!');
            fetchIndexers();
        } catch (error) {
            console.error('Error deleting:', error);
            alert('An error occurred while deleting.');
        }
    };

    if (loading) {
        return <p>Loading indexers...</p>;
    }

    if (error) {
        return <p>Error: {error}</p>;
    }

    return (
        <div className="container mt-4">
            <h3>Indexer List</h3>
            <Link to="/add-indexer" className="btn btn-primary mb-3">Add Indexer</Link>
            <table className="table table-bordered">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>ValueMin</th>
                    <th>ValueMax</th>
                </tr>
                </thead>
                <tbody>
                {indexers.map(indexer => (
                    <tr key={indexer.indexer.id}>
                        <td>{indexer.indexerId}</td>
                        <td>{indexer.name || 'Chưa có tên'}</td>
                        <td>{indexer.valueMin || 'Chưa có năm sinh'}</td>
                        <td>{indexer.valueMax || 'Chưa có năm sinh'}</td>
                        <td>
                            <Link to={`/edit-indexer/${indexer.indexer}`}
                                  className="btn btn-warning btn-sm me-2">Sửa</Link>
                            <button
                                className="btn btn-danger btn-sm"
                                onClick={() => handleDelete(indexer.indexerId)}
                            >
                                Xóa
                            </button>
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
};

export default IndexerList;