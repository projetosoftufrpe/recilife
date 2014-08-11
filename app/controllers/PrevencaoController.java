package controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static play.libs.Json.toJson;

import org.joda.time.DateTime;

import play.Logger;
import play.data.DynamicForm;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;


public class PrevencaoController extends Controller {
	
	public static Result prevencao(){
    	return ok(views.html.prevencao.render());
    }

	public static Result dengue(){
    	return ok(views.html.dengue.render());
    }
	
	public static Result tabagismo(){
    	return ok(views.html.tabagismo.render());
    }
	
	public static Result dst(){
    	return ok(views.html.dst.render());
    }
	
	public static Result hipertensao(){
    	return ok(views.html.hipertensao.render());
    }
	
	public static Result obesidade(){
    	return ok(views.html.obesidade.render());
    }
	
	public static Result diabetes(){
    	return ok(views.html.diabetes.render());
    }
		

}
