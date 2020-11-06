package br.com.fiap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_LOJA")
public class LojaModel {

	private long id;
	private String nome;
	private String url;

	public LojaModel() {
	}

	public LojaModel(long id, String nome, String url) {
		super();
		this.id = id;
		this.nome = nome;
		this.url = url;
	}

	@Id
	@Column(name = "ID_LOJA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOJA_SEQ")
	@SequenceGenerator(name = "LOJA_SEQ", sequenceName = "LOJA_SEQ", allocationSize = 1)
	public long getIdLoja() {
		return id;
	}

	public void setIdLoja(long id) {
		this.id = id;
	}

	@Column(name = "NOME_LOJA")
	@NotNull(message = "Nome obrigatório")
	@Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 40 caracteres")
	public String getNomeLoja() {
		return nome;
	}

	public void setNomeLoja(String nome) {
		this.nome = nome;
	}
	
	@Column(name = "URL_LOJA")
	@NotNull(message = "URL obrigatório")
	@Size(min = 10, max = 50, message = "URL deve ser entre 10 e 50 caracteres")
	public String getUrlLoja() {
		return url;
	}

	public void setUrlLoja(String url) {
		this.url = url;
	}

	

}
