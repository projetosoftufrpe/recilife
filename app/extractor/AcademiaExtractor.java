package extractor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import models.Academia;
import play.Logger;
import play.db.jpa.JPA;

public class AcademiaExtractor {

	private final String ACADEMIACIDADE = "./data/academiacidade.csv";
	
	public void execute(){
		int results = 0;
		
	Logger.info("Processando Academias da Cidade");
	
	results = processarAcademias();
	Logger.info("Processamento de Academias finalizado com " + results + " erros.");
	JPA.em().getTransaction().commit();
	JPA.em().getTransaction().begin();
	
	Logger.info("Academias da Cidade processadas");
	
	}
	
	public int processarAcademias() {
		
		BufferedReader br;
		String line;
		String fields[];
		String csvSplitBy = ";";
		int erros = 0;
		
		Academia academia;
		
		String arquivo = ACADEMIACIDADE;

		try {
		
			Logger.info("Processando arquivo: " + arquivo);
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF8"));
			
			//Jump first line
			line = br.readLine();				
			
			int count = 0;
			while ((line = br.readLine()) != null) {
				academia = new Academia();
				fields = line.split(csvSplitBy, -1); 
				
				int inteiro;
				long longo;
				String temp;
				
				academia.setMicroRegiao(Integer.valueOf(fields[0]));
				academia.setNome(fields[1]);
				academia.setEndereco(fields[2]);
				academia.setBairro(fields[3]);
				academia.setFone(fields[4]);
				academia.sethorarioAula(fields[5]);
				
				try {
					JPA.em().persist(academia);					
				} catch (Exception ex){
					Logger.error("Erro salvando academia " + academia + ": " + ex.getLocalizedMessage());
					erros++;
				}
			}
			
			Logger.info("Processamento concluído com sucesso. " + arquivo);
			
			br.close();

		} catch (Exception e){
			Logger.error("Erro processando arquivo " + arquivo + ": " + e.getLocalizedMessage());
			e.printStackTrace();
			erros++;
		}
		
		return erros;
	}
	
			
}
	
	
	

