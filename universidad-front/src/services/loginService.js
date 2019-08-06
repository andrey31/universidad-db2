import { url } from './url'

class LoginService {

  constructor (axios) {
    this.axios = axios
    this.url = `${url}/usuarios/login/`
  }

  login (user) {
    return this.axios.post(this.url, user)
  }
}
export default LoginService
