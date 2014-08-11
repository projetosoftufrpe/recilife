package controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Academia;
import services.AcademiaService;

import static play.libs.Json.toJson;

import org.joda.time.DateTime;

import play.Logger;
import play.data.DynamicForm;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import static models.Academia.*;


public class AcademiaController extends Controller {
	
	@Transactional
	
	public static Result academias(long tipo) {
		AcademiaService academiaService = new AcademiaService();
		
		String tipoNome;
		List<Academia> academias;
		if(tipo == TODAS) {
				academias = academiaService.getAcademias();
		} else {
				academias = academiaService.getAcademias(tipo);
		}
		
		return ok(views.html.academia.render());
		}
		
	@Transactional
	
	public static Result configurar() {
		Date ini = new Date();
		
		AcademiaService service = new AcademiaService();
		service.processar();
		
		Date fim = new Date();
		Logger.info((fim.getTime() - ini.getTime())/1000 + " segundos");
		return ok("Foi");
	}
	
}

