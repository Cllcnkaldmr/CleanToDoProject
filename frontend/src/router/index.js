import { createRouter, createWebHistory } from 'vue-router'
import ViewTodos from '../views/ViewTodos.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: ViewTodos
    },
    {
      path: '/add',
      name: 'add',
      component: () => import('../views/AddTodo.vue')
    },
    {
      path: '/edit/:id',
      name: 'edit',
      component: () => import('../views/UpdateTodo.vue')
    }
  ]
})

export default router
