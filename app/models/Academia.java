package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Academia {
	
	public static final int ACADEMIA = 0;
	
	public static final int TODAS = 99;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private int micro_regiao;
	@Column
	private String nome;
	@Column
	private String endereco;
	@Column
	private String bairro;
	@Column
	private String fone;
	@Column
	private String horarioAula;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMicroRegiao() {
		return micro_regiao;
	}	
	public void setMicroRegiao(int micro_regiao) {
		this.micro_regiao = micro_regiao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro(){
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String gethorarioAula() {
		return horarioAula;
	}
	public void sethorarioAula(String horarioAula) {
		this.horarioAula = horarioAula;
	}


}
	
	
