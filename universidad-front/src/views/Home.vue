<template>
  <div>
    <div>

    </div>
    <index-admin v-if="admin"></index-admin>
    <index-plataforma v-else></index-plataforma>
  </div>
</template>

<script>
// @ is an alias to /src
import IndexAdmin from "@/components/Admin";
import IndexPlataforma from "@/components/Plataforma"

export default {
  name: 'home',
  components: {
    IndexAdmin,
    IndexPlataforma
  },
  mounted () {
    this.isAdmin()
  },
  data () {
    return {
      admin: false,
    }
  },
  methods: {
    isAdmin() {
      if (this.$ls.get("admin") === 'true') {
        this.admin = true;
      }
    }
  }


}
</script>
