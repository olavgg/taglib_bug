package taglib_bug

class AdministrationController {

    static namespace = "administration"

    def index() { }

    def login(){
        session['userId'] = 1
        redirect(action: 'index')
    }
}
