<template>
  <b-container>
    <b-row class="pt-4 mt-4">
      <b-col>
        <h2>Matriculas</h2>
      </b-col>
    </b-row>
    <b-row>
      <b-col cols="4">
        <b-button variant="primary" block> <v-icon class="mr-2" name="plus"></v-icon>Nueva matricula</b-button>
      </b-col>
    </b-row>
    <b-row class="pt-3">
      <b-col>
        <b-table
        :items="matriculas"
        :fields="fields"
        responsive
        >
        <template slot="estudiante" slot-scope="row">
          {{row.item.estudiante.nombre}} {{row.item.estudiante.apellido1}} {{(row.item.estudiante.apellido2).charAt(0)}}.
        </template>

        <template slot="cantidadCursos" slot-scope="row">
          {{(row.item.cursosMatricula).length}}
        </template>
        <template slot="montoMatricula" slot-scope="row">
          {{row.item.pago.montoMatricula}}
        </template>

        <template slot="montoMaterias" slot-scope="row">
          {{row.item.pago.montoMaterias}}
        </template>

        <template slot="descuentoMatricula" slot-scope="row">
          {{row.item.pago.descuentoMatricula}}%
        </template>

        <template slot="financiado" slot-scope="row">
          <label for="" v-if="row.item.pago.financiado">Si</label>
          <label for="" v-else>No</label>
        </template>

        <template slot="metodoPago" slot-scope="row">
          {{row.item.pago.metodoPago.metodo}}
        </template>

        <template slot="cursos" slot-scope="row">
          <a href="" @click.prevent=""><v-icon scale="1" class="text-primary" name="external-link-alt"></v-icon></a>
        </template>

        <template slot="coutasFinanciado" slot-scope="row">
          <a v-if="row.item.pago.financiado">Financiado</a>
          <label v-else>No financiado</label>
        </template>
        </b-table>

      </b-col>
    </b-row>
  </b-container>
</template>
<script>
import {mapState} from 'vuex'
export default {
  name: 'matriculas',
  computed: {
    ...mapState(['services'])
  },
  mounted () {
    this.getAllMatriculas()
  },
  data () {
    return {
      matriculas: [],
      fields: [
        'cuatrimestre',
        { key: 'ano', label: 'Año'},
        'estudiante',
        { key: 'usuario', label: 'Matriculado por'},
        'cantidadCursos',
        'montoMatricula',
        'montoMaterias',
        'descuentoMatricula',
        'financiado',
        'metodoPago',
        'cursos',
        'coutasFinanciado'
      ]
    }
  },
  methods: {
    getAllMatriculas: function () {
      this.services.matriculaService.getAllMatriculas().then( response => {
        this.matriculas = response.data
      }).catch( error => {
        console.log(error)
      })
    }
  }

}
</script>
