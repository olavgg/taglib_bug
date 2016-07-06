package taglib_bug

class AdministrationController {

    static namespace = "administration"

    def index() {
        [brains: [1,2,3,4,5]]
    }

    def login(){
        session['userId'] = 1
        redirect(action: 'index')
    }
}
