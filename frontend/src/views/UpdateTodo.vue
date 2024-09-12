<template>
    <main>
        <Navbar/>
        <div class="my-5">
            <div class="mx-auto w-25 " style="max-width:100%;">
              <h2 class="text-center mb-3">Update Todo</h2>
              <form @submit.prevent="updateTodo">
                <!--name-->
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="task" class="form-label">Task</label>
                    <input id="task"  type="text" name="task" class="form-control" placeholder="Task" required v-model="todo.task">
                  </div>
                </div>

                
                <!--Email-->
                <div class="row">
                    <div class="col-md-12 form-group mb-3">
                      <label for="details" class="form-label">Details</label>
                      <input id="details" type="text"  name="details" class="form-control" placeholder="Details" required v-model="todo.details" >
                    </div>
                  </div>
                         
               
                <div class="row">
                  <div class="col-md-12 form-group">
                    <input class="btn btn-primary w-100" type="submit" value="Submit">
                  </div>
                </div>
      
                <div>
                  
                </div>
              </form>
        
            </div>
          </div>

    </main>
</template>


<script>
import Navbar from '../components/Navbar.vue';

export default {
    name: 'UpdateTodo',
    components: {
        Navbar
    },

    data(){
        return {
            todo: {
                task: '',
                details: '',
                
            }
        }
    },

    beforeMount(){
        this.getTodos();
    },

    methods: {
        getTodos(){
            fetch(`http://localhost:8080/todo/${this.$route.params.id}`)
            .then(res => res.json())
            .then(data => {
                this.todo = data;
                console.log(this.todo);
            })

        },
        updateTodo(){
            fetch(`http://localhost:8080/todo`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(this.todo)
            })
            .then(data => {
                console.log(data);
                this.$router.push('/');
            })
        }
    }
}

</script>