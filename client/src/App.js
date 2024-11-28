import './App.css';
import {firstFunction} from "./api/FirstService";
import {useEffect, useRef, useState} from "react";
import {getAllQuestions} from "./api/QuestionService";

export const API_URL = "http://localhost:8080";

function App() {
  const [firstText, setFirstText] = useState("")

  const loaded = useRef(false);

  const [questions, setQuestions] = useState([])

  useEffect(() => {
    firstFunction().then(response => {
      setFirstText(response.data)
    })
    if (!loaded.current) {
        loaded.current = true
        getAllQuestions().then(response => {
            setQuestions(response.data)
        })
    }
  }, []);

  return (
      <main>
        <div>
          {firstText}
        </div>
        <div>
          <ul>
            {questions.map(question => {
              return (<li key={question.id}>
                <h3>{question.name}</h3>
                <p>{question.text}</p>
              </li>)
            })}
          </ul>
        </div>
      </main>
  );
}

export default App;
