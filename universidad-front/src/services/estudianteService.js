import { url } from './url'

class EstudianteService {

  constructor (axios) {
    this.axios = axios
    this.url = `${url}/estudiantes`
  }

  getAllEstudiantes () {
    console.log(this.url)
    return this.axios.get(this.url)
  }
}
export default EstudianteService
