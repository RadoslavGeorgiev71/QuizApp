import './App.css';
import {firstFunction} from "./api/FirstService";
import {useEffect, useState} from "react";

function App() {
  const [firstText, setFirstText] = useState("")
  useEffect(() => {
    firstFunction().then(response => {
      setFirstText(response.data)
    })
  }, []);

  return (
    <div>
      {firstText}
    </div>
  );
}

export default App;
