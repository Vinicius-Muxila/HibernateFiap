package br.com.fiap.entity;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@SequenceGenerator(name="produto",sequenceName="sq_tb_produto",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="produto")
	@Column(name="cd_produto")
	private int id;
	
	@Column(name="nm_produto",nullable=false,length=100)
	private String nome;
	
	@Column(name="vl_preco")
	private double preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_data_validade")
	private Calendar dataValidade;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
	public Produto() {
		super();
	}

	public Produto(int id, String nome, double preco, Calendar dataValidade, Estado estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.estado = estado;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	

}
