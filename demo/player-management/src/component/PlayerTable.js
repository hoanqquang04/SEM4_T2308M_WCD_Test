import React, { useEffect, useState } from "react";
import axios from "axios";

const PlayerTable = () => {
  const [players, setPlayers] = useState([]);

  const fetchPlayers = () => {
    axios.get("http://localhost:8080/api/players").then((res) => setPlayers(res.data));
  };

  useEffect(() => {
    fetchPlayers();
  }, []);

  const deletePlayer = async (id) => {
    await axios.delete(`http://localhost:8080/api/players/${id}`);
    fetchPlayers();
  };

  return (
    <table>
      <thead>
        <tr>
          <th>Id</th>
          <th>Player name</th>
          <th>Player age</th>
          <th>Index name</th>
          <th>Value</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        {players.map((player) => (
          <tr key={player.id}>
            <td>{player.id}</td>
            <td>{player.name}</td>
            <td>{player.age}</td>
            <td>{player.indexName}</td>
            <td>{player.value}</td>
            <td>
              <button onClick={() => deletePlayer(player.id)}>🗑</button>
            </td>
          </tr>
        ))}
      </tbody>
    </table>
  );
};

export default PlayerTable;
