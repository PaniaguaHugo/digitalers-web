package com.digitalers.domain;

public class Marcas implements Entity{

	private Long id;
	private String descripcion;
	private String codigo;
	private Long habilitada;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
		
	public Long getHabilitada() {
		return habilitada;
	}
	public void setHabilitada(Long habilitada) {
		this.habilitada = habilitada;
	}
	@Override
	public String toString() {
		return "Marcas [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + "]";
	}
	
	
}
