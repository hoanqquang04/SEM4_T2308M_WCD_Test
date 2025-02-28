import React, { useState, useEffect } from "react";
import axios from "axios";

const PlayerForm = ({ fetchPlayers }) => {
  const [player, setPlayer] = useState({ name: "", age: "", indexName: "", value: "" });
  const [indexers, setIndexers] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/api/indexers").then((res) => setIndexers(res.data));
  }, []);

  const handleChange = (e) => setPlayer({ ...player, [e.target.name]: e.target.value });

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post("http://localhost:8080/api/players", player);
      fetchPlayers();
    } catch (error) {
      console.error("Lỗi  thêm cầu thủ", error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input type="text" name="name" placeholder="Player name" onChange={handleChange} required />
      <input type="number" name="age" placeholder="Player age" onChange={handleChange} required />
      <select name="indexName" onChange={handleChange} required>
        <option value="">Select Index</option>
        {indexers.map((idx) => (
          <option key={idx.index_id} value={idx.name}>
            {idx.name}
          </option>
        ))}
      </select>
      <input type="number" name="value" placeholder="Value" onChange={handleChange} required />
      <button type="submit">Add</button>
    </form>
  );
};

export default PlayerForm;
