class BootStrap {

    def grid

    def init = { servletContext ->
        println grid.services()
    }
    def destroy = {
    }
}
