package server.models;

import java.util.Date;
import java.util.List;import org.springframework.format.annotation.DateTimeFormat;


public class Pedido {

	private Integer id;
	private String nome;
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date dataNascimento;
	private String endereço;
	private String cidade;
	private String estado;
	private Integer cep;
	private MetodoPagamento metodoPagamento;
	private StatusPedido status; 
	private List<Produto> produtos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", endereço=" + endereço
				+ ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", metodoPagamento=" + metodoPagamento
				+ ", status=" + status + ", produtos=" + produtos + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getEndereço()=" + getEndereço() + ", getCidade()="
				+ getCidade() + ", getEstado()=" + getEstado() + ", getCep()=" + getCep() + ", getMetodoPagamento()="
				+ getMetodoPagamento() + ", getStatus()=" + getStatus() + ", getProdutos()=" + getProdutos()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}