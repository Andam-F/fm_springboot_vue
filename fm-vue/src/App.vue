<template>
  <div id="app">
    <!--<img src="./assets/logo.png">-->
    <router-link to="/Plan">Plan</router-link>
    <router-link to="/Date">Date</router-link>
    <router-link to="/Share">Share</router-link>
    <router-link to="/Friends">Friends</router-link>
    <router-link to="/Recommend">Recommend</router-link>
    <router-link to="/Me">Me</router-link>
    <router-view/>
  </div>
</template>

<script>
  /*import Plan from 'components/Plan.vue'
  import Date from 'components/Date.vue'
  import Share from 'components/Share.vue'
  import Friends from 'components/Friends.vue'
  import Recommend from 'components/Recommend.vue'
  import Me from 'components/Me.vue'*/

export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
