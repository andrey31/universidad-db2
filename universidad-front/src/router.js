import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Login from './views/Login.vue'
import Plataformistas from './views/Plataformistas.vue'
import Estudiantes from './views/Estudiantes.vue'
import Carreras from './views/Carreras.vue'
import Cursos from './views/Cursos.vue'
import Matriculas from './views/Matriculas.vue'

Vue.use(Router)

const route = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
      meta: {
        requieresAuth: true
      }
    },
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/plataforma',
      name: 'plataformistas',
      component: Plataformistas
    },
    {
      path: '/estudiantes',
      name: 'estudiantes',
      component: Estudiantes
    },
    {
      path: '/carreras',
      name: 'carreras',
      component: Carreras
    },
    {
      path: '/cursos',
      name: 'cursos',
      component: Cursos,
      props: true
    },
    {
      path: '/matriculas',
      name: 'matriculas',
      component: Matriculas
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    }
  ]
})
route.beforeEach((to, from, next) => {
  if(to.matched.some(record => record.meta.requieresAuth)){
    if(Vue.ls.get('admin') === null){
      next({
        path: '/login'
      })
    }else{
      next()
    }
  }else{
    next()
  }
})
export default route
