<template>
  <a-layout>
    <a-layout-header class="header">
      <div class="logo"/>
      <a-menu
          theme="dark"
          mode="horizontal"
          v-model:selectedKeys="selectedKeys1"
          :style="{ lineHeight: '64px' }"
      >
        <a-menu-item key="1">nav 1111</a-menu-item>
        <a-menu-item key="2">nav 2</a-menu-item>
        <a-menu-item key="3">nav 3</a-menu-item>
      </a-menu>
    </a-layout-header>
  </a-layout>
</template>

<script>
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'TheHeader'
});
</script>

<style scoped>

</style>
