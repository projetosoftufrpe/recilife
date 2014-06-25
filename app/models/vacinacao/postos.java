package models.vacinacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Postos {

	public static final int POSTOS;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private int tipo;
	@Column
	private String tipoNome;
	@Column
	private int rpa;
	@Column
	private int micro_regiao;
	@Column
	private long cnes;
	@Column
	private String unidade;
	@Column
	private String endereco;
	@Column
	private String bairro;
	@Column(columnDefinition="TEXT")
	private String especialidades;
	@Column
	private String fone;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}

	public String getEnderecoCompleto(){
		return endereco + ", " + bairro;
	}

	public String getNome(){
		return unidade;
	}
	
	public void setTipo(int tipo){
		this.tipo = tipo;
		switch (tipo){
			case POSTOS:
				this.tipoNome = "Postos de Vacinação";
				break;
		}
	}
	
	
	public String getTipoNome() {
		return tipoNome;
	}
	public void setTipoNome(String tipoNome) {
		this.tipoNome = tipoNome;
	}
	public int getRpa() {
		return rpa;
	}
	public void setRpa(int rpa) {
		this.rpa = rpa;
	}
	public int getMicro_regiao() {
		return micro_regiao;
	}
	public void setMicro_regiao(int micro_regiao) {
		this.micro_regiao = micro_regiao;
	}
	public long getCnes() {
		return cnes;
	}
	public void setCnes(long cnes) {
		this.cnes = cnes;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	
	
}
