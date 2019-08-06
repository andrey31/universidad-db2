<template>
<b-container>
  <b-row class="pt-4 mt-4">
    <b-col cols="8" offset="2">
      <h2>Carreras</h2>
    </b-col>
  </b-row>
  <b-row class="pt-4">
    <b-col cols="8" offset="2">
      <b-table
      :items="carreras"
      :fields="fields"
      selectable
      select-mode="single"
      @row-selected="rowSelected"
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
    this.getAllCarreras()
  },
  data () {
    return {
      carreras: [],
      select: [],
      fields: ['carrera'],
    }
  },
  methods: {
    getAllCarreras: async function() {
      try {
        const response = await this.services.carreraService.getAllCarreras()
        this.carreras = response.data
      } catch (error) {
        console.log(error)
      }
    },
    rowSelected: function(item){
      console.log(item)
      let cursos = []
      item.forEach( c => {

        c.cursosCarreras.forEach( cu => {
          cursos.push({cuatrimestre: cu.cuatrimestre, curso: cu.curso.curso})
        })
      })

      this.$router.push({
        name: 'cursos',
        params: {
          items: cursos
        }
      })

    },
  }
}
</script>
