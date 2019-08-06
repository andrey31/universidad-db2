<template>
  <div id="app">
    <sidebar-menu v-if="this.$route.path !== '/login'" :menu="menu" width="200px" :collapsed="collapsed">

        <!-- <span slot="collapse-icon"><v-icon name="arrows-alt-h"></v-icon></span> -->
        <!-- <span slot="dropdown-icon">dropdown-icon</span> -->

      </sidebar-menu>
    <!-- <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </div> -->
    <router-view/>
  </div>
</template>

<script>
export default {
  data () {
    return {
      collapsed: true,
      menu: [
        { header: true, title: 'Universidad DB' },
        { href: '/', name: 'inicio', title: 'Inicio', icon: 'fas fa-home' },
        { href: '/carreras', name: 'carreras', title: 'Carreras', icon: 'fas fa-book-reader'},
        { href: '/plataforma', title: 'Plataformistas', icon: 'fas fa-user-tie' },
        { href: '/estudiantes', title: 'Estudiantes', icon: 'fas fa-users' },
        { href: '/matriculas', title: 'Matriculas', icon: 'fas fa-file'},
        { href: '/estadisticas', title: 'Estadisticas', icon: 'fas fa-chart-bar'},
        { href: '/login', title: 'Salir', icon: 'fas fa-sign-out-alt'}
      ]
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
