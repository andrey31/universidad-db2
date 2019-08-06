<template>
  <b-container class="mt-4">
    <b-row>
      <b-col cols="1">
        <b-button variant="outline" @click="$router.push('/carreras')" block>
          <v-icon name="arrow-left"></v-icon>
        </b-button>
      </b-col>
    </b-row>
    <b-row  class="pt-2">
      <b-col>
        <b-table
        :items="itemsOne"
        ></b-table>
      </b-col>
      <b-col>
        <b-table
        :items="itemsTwo"
        ></b-table>
      </b-col>
    </b-row>
  </b-container>
</template>
<script>
export default {
  props: ['items'],
  computed: {
    itemsOne: function (){
      return this.items.slice(0, Math.ceil(this.itemsLength/2))
    },
    itemsTwo: function () {
      return this.items.slice(Math.ceil(this.itemsLength/2))
    },
    itemsLength: function () {
      //let num = (this.items.length) / 5
      //return Math.ceil(num)itemsLength
      return this.items.length
    }
  },
  mounted () {
    if (!this.items) this.$router.push('/carreras')
  }
}
</script>
