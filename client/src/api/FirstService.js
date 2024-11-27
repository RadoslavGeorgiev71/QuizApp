import axios from "axios";

const API_URL = "http://localhost:8080/first";

export async function firstFunction() {
    return await axios.get(API_URL);
}
