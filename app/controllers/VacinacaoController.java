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


public class VacinacaoController extends Controller {

	
	public static Result vacinacao(){
    	return ok(views.html.vacinacao.render());
    }
	
	public static Result postos(){
    	return ok(views.html.postos.render());
    } 
    
    public static Result calendario(){
    	return ok(views.html.calendario.render());
    }
	
	
}