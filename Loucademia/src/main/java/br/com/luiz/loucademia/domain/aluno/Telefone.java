package br.com.luiz.loucademia.domain.aluno;

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
	
	

}
