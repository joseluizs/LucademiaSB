package br.com.luiz.loucademia.domain.aluno;

import java.util.Objects;

public class Telefone {
	
	private Integer dddCelular;
	private Integer numeroCelular;
	private Integer dddFixo;
	private Integer numeroFixo;
	public Integer getDddCelular() {
		return dddCelular;
	}
	public void setDddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}
	public Integer getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(Integer numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public Integer getDddFixo() {
		return dddFixo;
	}
	public void setDddFixo(Integer dddFixo) {
		this.dddFixo = dddFixo;
	}
	public Integer getNumeroFixo() {
		return numeroFixo;
	}
	public void setNumeroFixo(Integer numeroFixo) {
		this.numeroFixo = numeroFixo;
	}
	@Override
	public String toString() {
		return "Telefone [dddCelular=" + dddCelular + ", numeroCelular=" + numeroCelular + ", dddFixo=" + dddFixo
				+ ", numeroFixo=" + numeroFixo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dddCelular, dddFixo, numeroCelular, numeroFixo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(dddCelular, other.dddCelular) && Objects.equals(dddFixo, other.dddFixo)
				&& Objects.equals(numeroCelular, other.numeroCelular) && Objects.equals(numeroFixo, other.numeroFixo);
	}
	
	

}
