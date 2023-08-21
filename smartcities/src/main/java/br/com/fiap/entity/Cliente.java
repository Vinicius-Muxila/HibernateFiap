package br.com.fiap.entity;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	
	@Id
	@SequenceGenerator(name="cliente",sequenceName="sq_tb_cliente",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cliente")
	@Column(name="cd_cliente")
	private int id;
	
	@Column(name="nm_cliente",nullable=false,length=100)
	private String cliente;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cadastro")
    private Calendar dataCadastro;

	public Cliente() {
		super();
	}

	public Cliente(int id, String cliente, Calendar dataCadastro) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.dataCadastro = dataCadastro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	

}
