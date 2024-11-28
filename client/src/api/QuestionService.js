import axios from "axios";
import {API_URL} from "../App";

export async function getAllQuestions() {
    return await axios.get(API_URL + "/question")
}