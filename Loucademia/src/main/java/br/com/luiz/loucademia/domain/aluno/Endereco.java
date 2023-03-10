package br.com.luiz.loucademia.domain.aluno;

import java.util.Objects;

public class Endereco {
	
	private String rua;
	
	private Integer numero;
	
	private String complemento;
	
	private String cidade;
	
	private Integer cep;
	
	private Estado estado = new Estado();

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", cidade=" + cidade
				+ ", cep=" + cep + ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cep, cidade, complemento, estado, numero, rua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(complemento, other.complemento) && Objects.equals(estado, other.estado)
				&& Objects.equals(numero, other.numero) && Objects.equals(rua, other.rua);
	}
	
}
