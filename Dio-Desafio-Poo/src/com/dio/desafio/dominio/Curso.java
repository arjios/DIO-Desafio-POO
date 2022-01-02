package com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private Integer cargaHoraria;
	
	public Curso() {
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public Double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", "
				+ "getTitulo()=" + getTitulo() + ", "
						+ "getDescricao()="	+ getDescricao() + "]";
	}
	
	
}
