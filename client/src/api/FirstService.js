import axios from "axios";
import {API_URL} from "../App";

export async function firstFunction() {
    return await axios.get(API_URL + "/first");
}
