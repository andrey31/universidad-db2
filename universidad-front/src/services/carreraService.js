import { url } from './url'

class CarreraService {

  constructor (axios) {
    this.axios = axios
    this.url = `${url}/carreras`
  }

  getAllCarreras () {
    return this.axios.get(this.url)
  }
}
export default CarreraService
