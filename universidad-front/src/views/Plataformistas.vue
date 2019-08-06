<template>
  <b-container>
    <b-row class="pt-4 mt-4">
      <b-col>
        <h2>Usuarios de plataforma</h2>
      </b-col>
    </b-row>

    <b-row class="pt-4">
      <b-col>
        <b-table
        :items="plataformistas"
        >

        </b-table>
      </b-col>
    </b-row>
  </b-container>
</template>
<script>
import { mapState } from 'vuex'
export default {
    computed: {
      ...mapState(['services'])
    },
    mounted () {
      this.getAllPlataformistas()
    },
    data () {
      return {
        plataformistas: []
      }
    },
    methods: {
      getAllPlataformistas: async function(){
        try {
          const response = await this.services.userService.getAllPlataformistas()
          this.plataformistas = response.data
        } catch (error) {
          console.log('error')
        }
      }
    }
}
</script>
