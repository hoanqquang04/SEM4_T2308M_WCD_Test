import React from "react";
import PlayerForm from "./components/PlayerForm";
import PlayerTable from "./components/PlayerTable";


const App = () => {
  return (
    <div>
      <h1>Player Information</h1>
      <PlayerForm />
      <PlayerTable />
    </div>
  );
};

export default App;
