package controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static play.libs.Json.toJson;

import models.vacinacao.Posto;

import org.joda.time.DateTime;

import play.Logger;
import play.data.DynamicForm;
//import play.db.jpa.JPA;
//import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;


public class AcademiaController extends Controller {
	
	public static Result academia(){
    	return ok(views.html.academia.render());
    }
	
		

}
