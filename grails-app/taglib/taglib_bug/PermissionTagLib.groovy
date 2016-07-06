package taglib_bug

import grails.compiler.GrailsCompileStatic
import org.grails.taglib.TagBodyClosure

@GrailsCompileStatic
class PermissionTagLib {
    static defaultEncodeAs = [taglib:'none']
    //static encodeAsForTags =
    //  [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    static namespace = "permission"

    def isAuthenticated = { attrs, TagBodyClosure body ->
        if(session['userId']){
            out << body()
        }
    }

    def isNotAuthenticated = { attrs, TagBodyClosure body ->
        if(session['userId'] == null){
            out << body()
        }
    }

    /*def isAdministrator = { attrs, TagBodyClosure body ->
        if(session['role'] == Role.ADMIN){
            out << body()
        }
    }

    def isNotAdministrator = { attrs, TagBodyClosure body ->
        if(session['userId'] && session['role'] != Role.ADMIN){
            out << body()
        }
    }

    def isBasicUser = { attrs, TagBodyClosure body ->
        if(session['role'] == Role.CLIENT){
            out << body()
        }
    }*/
}
