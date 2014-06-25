package controllers;

import models.*;
import play.data.*;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
  
	public static Result index() {
        return ok(index.render());
    }
    
    public static Result sobre(){
    	return ok(views.html.sobre.render());
    } 
    

static Form<Task> taskForm = Form.form(Task.class);
    
}


