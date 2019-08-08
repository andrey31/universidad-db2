import Axios from 'axios'

import LoginService from './loginService'
import UserService from './userService'
import EstudianteService from './estudianteService'
import CarreraService from './carreraService'
import MatriculaService from './matriculaService'

Axios.defaults.headers.common.Accept2 = 'application/json'

export default {
  loginService: new LoginService(Axios),
  userService: new UserService(Axios),
  estudianteService: new EstudianteService(Axios),
  carreraService: new CarreraService(Axios),
  matriculaService: new MatriculaService(Axios)
}
