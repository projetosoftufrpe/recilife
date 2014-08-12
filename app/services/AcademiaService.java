package services;

import java.util.ArrayList;
import java.util.List;

import models.Academia;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import extractor.AcademiaExtractor;
import static models.Academia.*;


public class AcademiaService {

	public void processar() {
		new AcademiaExtractor().execute();
	}
	
	@Transactional
	
	public List<Academia> getAcademias() {
		String query = "FROM Academia ORDER BY nome ASC";
		
		List<Academia> list = JPA.em().createQuery(query)
					.getResultList();
		return list;
	}

	@Transactional
	
	public List<Academia> getAcademias(long tipo) {
		String query = "FROM Academia ORDEM BY nome ASC";
		
		List<Academia> list = JPA.em().createQuery(query)
					.getResultList();
					
			if (tipo == TODAS) {
				
				return list;
				
			} else {
				List<Academia> finalList = new ArrayList<Academia>();
				for (Academia a: list){
						if (a.getId() == tipo){
								finalList.add(a);
						}
				}
				return finalList;
			}
						}

	public Academia getAcademia(long id) {
			return (Academia)JPA.em().createQuery("FROM Academia WHERE CodigoAcademia = :id")
					.setParameter("id", id)
					.getSingleResult();

	}
	
		
}

