<template>
  <b-container>
    <b-row class="pt-4 mt-4">
      <b-col>
        <h2>Estudiantes</h2>
      </b-col>
    </b-row>
    <b-row>
      <b-col cols="1">
        <b-button variant="primary">Nuevo</b-button>
        <!-- <a href="" @click.prevent=""><v-icon name="plus" scale="2" class="text-primary"></v-icon></a> -->
      </b-col>
      <b-col cols="4" offset="7">
         <b-input-group>
          <b-input-group-text slot="prepend">Busqueda</b-input-group-text>
          <b-form-input v-model="filter"></b-form-input>
        </b-input-group>
      </b-col>
    </b-row>

    <b-row class="pt-3">
      <b-col>
        <b-table
        :items="estudiantes"
        :fields="fields"
        :filter="filter"
        >
          <template slot="nombreCompleto" slot-scope="row">
            {{row.item.nombre}} {{row.item.apellido1}} {{row.item.apellido2}}
          </template>
          <template slot="correo" slot-scope="row">
            {{row.item.correo.toLowerCase()}}
          </template>

          <template slot="regular" slot-scope="row">
            <b-badge v-if="row.item.regular" variant="primary">Regular</b-badge>
            <b-badge v-else variant="success">Nuevo ingreso</b-badge>
          </template>

          <!-- <template slot="carrera" slot-scope="row">
            <b-button>Ver</b-button>
          </template> -->
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
    this.getAllEstudiantes()
  },
  data () {
    return {
      estudiantes: [],
      fields: [
        'nombreCompleto',
        'telefono',
        'correo',
        { key: 'regular', label: 'Regular/Nuevo'},
        'carrera',
        'direccion'
      ],
      filter: ''
    }
  },
  methods: {
    getAllEstudiantes: async function(){
      try {
        const response = await this.services.estudianteService.getAllEstudiantes()
        this.estudiantes = response.data
      } catch (error) {
        console.log(error)
      }
    }
  }
}
</script>
