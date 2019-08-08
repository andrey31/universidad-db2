import { url } from './url'

class MatriculaService {

  constructor (axios) {
    this.axios = axios
    this.url = `${url}/matriculas`
  }

  getAllMatriculas () {
    console.log(this.url)
    return this.axios.get(this.url)
  }
}
export default MatriculaService
