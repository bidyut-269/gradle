// tag::add-action[]
// tag::define-task[]
open class GreetingTask : DefaultTask() {
    // end::define-task[]
    @TaskAction
    fun greet() {
        println("hello from GreetingTask")
    }
// tag::define-task[]
}
// end::define-task[]

// Create a task using the task type
task<GreetingTask>("hello")
// end::add-action[]
