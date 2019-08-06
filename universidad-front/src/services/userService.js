import { url } from './url'

class UserService {

  constructor (axios) {
    this.axios = axios
    this.url = `${url}/usuarios`
  }

  getAllPlataformistas () {
    console.log(`${this.url}/admin/false`)
    return this.axios.get(`${this.url}/admin/false`)
  }
}
export default UserService
