package br.gov.sp.fatec.sprintapp.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aut_autorizacao")
public class Autorizacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aut_id")
	private Long id;
	@Column(name="aut_nome")
	private String nome;
	
//	private Set<Usuario> usuarios;
	
//	public Set<Usuario> getUsuarios() {
//		return usuarios;
//	}
//	public void setUsuarios(Set<Usuario> usuarios) {
//		this.usuarios = usuarios;
//	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
