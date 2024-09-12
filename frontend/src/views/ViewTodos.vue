<template>
    <main>
        <Navbar />

        <!-- Table-->
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center">View Todo</h1>
                    <!--Add button -->
                    <a href="/add" class="btn btn-primary">Add Todo</a>
                    <table class="table table-striped">
                        <thead>
                          <tr>
                            <th scope="col">id</th>
                            <th scope="col">task</th>
                            <th scope="col">details</th>
                            
                          </tr>
                        </thead>
                        <tbody>
                          <tr v-for="todo in todos" :key="todo.id">
                            <th scope="row">{{todo.id}}</th>
                            <td>{{todo.task}}</td>
                            <td>{{todo.details}}</td>
                            <td>
                              <a class="btn btn-primary" :href="`/edit/${todo.id}`">Edit</a>
                              <button class="btn btn-danger mx-2" @click="deleteTodo(todo.id)">Delete</button>
                            </td>
                          </tr>
                        </tbody>
                      </table>
                </div>
            </div>
        </div>
        
    </main>
</template>


<script>
import Navbar from '../components/Navbar.vue'

    export default {
        name: 'ViewTodos',
        components: {
            Navbar
        },
        data() {
            return {
                todos: []
            }
        },

        beforeMount(){
            this.getTodos()
        },

        methods: {
            getTodos(){
                fetch('http://localhost:8080/todos')
                .then(res => res.json())
                .then(data => {
                    this.todos = data
                    console.log(data)
                })
            },
            deleteTodo(id){
                fetch(`http://localhost:8080/todo/${id}`, {
                    method: 'DELETE'
                })
                .then(data => {
                    console.log(data)
                    this.getTodos()
                })
            }
        }

    }

</script>