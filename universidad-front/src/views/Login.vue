<template>
  <b-container>
    <b-row class="pt-5 mt-5 mb-5 justify-content-center">
      <b-col cols="12" lg="6">
        <div class="logo mb-3 text-success">
          <h3>
            <b>Universidad DB</b>
          </h3>
        </div>

        <!-- Errores -->
        <b-row class="justify-content-center">
          <b-col cols="10">
            <b-alert :show="showAlert" variant="warning">
              <label v-for="error in errores" class="w-100" :key="error.id">{{error}}</label>
            </b-alert>
          </b-col>
        </b-row>
        <!-- /Errores -->

        <b-form class="bg-dark row form-login text-white" @submit="login">
          <b-form-group
            class="col-12"
            id="username"
            label="Usuario"
            label-for="input-username"
          >
            <b-form-input id="input-username" type="text" v-model="user.usuario" required></b-form-input>
          </b-form-group>

          <b-form-group class="col-12" id="pass" label="Contraseña" label-for="input-pass">
            <b-form-input id="input-pass" type="password" v-model="user.contrasena" required></b-form-input>
          </b-form-group>

          <b-form-group class="col-12">
            <b-button type="submit" block size="lg" variant="success">Ingresar</b-button>
          </b-form-group>
        </b-form>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapState } from "vuex";

export default {
  name: "login",
  computed: {
    ...mapState(["services"])
  },
  mounted() {
    this.logout();
  },
  data() {
    return {
      user: {
        usuario: "",
        contrasena: ""
      },
      errores: [],
      showAlert: false
    };
  },
  methods: {
    login: async function(e) {
      e.preventDefault();

      try {
        const response = await this.services.loginService.login(this.user);
        this.$ls.set('user', response.data.user.usuario);
        this.$ls.set('admin', response.data.user.admin)
        this.$router.push("/");
      } catch (error) {
        console.log(error)
        this.errores = []
        this.errores.push("Error usuario o contraseña incorrecta");
        this.showAlert = true;
      }
    },
    logout: function() {
      this.$ls.set('user', '');
      this.$ls.set('admin', '')
    }
  }
};
</script>

<style>
.form-login {
  /* background: #f5f5f5; */

  /* top | right | bottom | left */
  padding-top: 50px;
  padding-bottom: 50px;
  padding-left: 30px;
  padding-right: 30px;
  /* border: 2px solid ; */
  border-radius: 10px;

  /* border: 4px solid black; */
}
</style>
